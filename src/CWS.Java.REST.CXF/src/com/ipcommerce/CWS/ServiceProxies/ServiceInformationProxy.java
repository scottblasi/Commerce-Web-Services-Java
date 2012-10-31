package com.ipcommerce.CWS.ServiceProxies;

import java.io.IOException;
import java.util.List;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.PropertiesConfiguration;

import com.ipcommerce.CWS.Helpers.HttpConnections;
import com.ipcommerce.CWS.Helpers.HttpConnections.HttpMethod;
import com.ipcommerce.CWS.Helpers.JsonHelper;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.ApplicationData;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.ArrayOfBankcardService;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.ArrayOfElectronicCheckingService;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.ArrayOfStoredValueService;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.ArrayOfWorkflow;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.BankcardService;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.ElectronicCheckingService;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.MerchantProfile;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.ServiceInformation;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.StoredValueService;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.TenderType;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.Workflow;

public class ServiceInformationProxy {
	
	private static String RestBaseUrl;
	private static String MsgFormat;

	public ServiceInformationProxy(){
		// Load configuration file. 
		try {
			Configuration configFile = new PropertiesConfiguration("com/ipcommerce/CWS/Resources/cws.properties");
		
			RestBaseUrl =  configFile.getString("REST_BASE_URI") + "/SvcInfo";
			MsgFormat = configFile.getString("MSG_FORMAT");
			
		}  catch (org.apache.commons.configuration.ConfigurationException e) {
			System.out.println("ConfigurationException: " + e.getMessage());
		}
	}
	
	public String SignOn(String identityToken)
	{			
		String requestUrl = RestBaseUrl + "/token";		
		String response = HttpConnections.sendGetRequest(requestUrl, identityToken, HttpMethod.GET, true);				
		return response.replaceAll("\"", "");
	}
	
	public String SaveApplicationData(String sessionToken, ApplicationData applicationData)
	{
		String requestUrl = RestBaseUrl + "/appProfile";		

		if(MsgFormat.equals("JSON"))
		{
			try {
				String requestData = JsonHelper.ObjectToJson(applicationData);
				String response = HttpConnections.sendPutRequest(requestUrl, sessionToken, requestData, HttpMethod.PUT, true);
				if(response.contains("id"))
				{
					int colon = response.indexOf(':');
					int comma = response.indexOf(',');
					return response.substring(colon + 2, comma - 1);					
				}
			} catch (Exception e) {
				// TODO Build REST Fault handler
				System.out.println(e.getMessage());
				e.printStackTrace();
			} 		
		}		
		return null;
	}	
	
	public ServiceInformation GetServiceInformation(String sessionToken)
	{
		String requestUrl = RestBaseUrl + "/serviceInformation";
		
		if(MsgFormat.equals("JSON"))
		{
			try {
				String response = HttpConnections.sendGetRequest(requestUrl, sessionToken, HttpMethod.GET, true);	
				
				int beginIndex = response.indexOf("\"BankcardServices\"");
				int endIndex = response.indexOf(']', beginIndex) + 1;
				String arrayString = response.substring(beginIndex, endIndex);
				arrayString = arrayString.replaceAll("\"BankcardServices\":", "");				
				BankcardService[] bcsArray = new BankcardService[0];
				bcsArray = (BankcardService[])JsonHelper.JsonToObject(arrayString, bcsArray);
				
				beginIndex = response.indexOf("\"ElectronicCheckingServices\"");
				endIndex = response.indexOf(']', beginIndex) + 1;
				arrayString = response.substring(beginIndex, endIndex);
				arrayString = arrayString.replaceAll("\"ElectronicCheckingServices\":", "");
				ElectronicCheckingService[] ecsArray = new ElectronicCheckingService[0];
				ecsArray = (ElectronicCheckingService[])JsonHelper.JsonToObject(arrayString, ecsArray);
				
				beginIndex = response.indexOf("\"Workflows\"");
				endIndex = response.indexOf(']', beginIndex) + 1;
				arrayString = response.substring(beginIndex, endIndex);
				arrayString = arrayString.replaceAll("\"Workflows\":", "");
				Workflow[] wfArray = new Workflow[0];
				wfArray = (Workflow[])JsonHelper.JsonToObject(arrayString, wfArray);
				
				beginIndex = response.indexOf("\"ElectronicCheckingServices\"");
				endIndex = response.indexOf(']', beginIndex) + 1;
				arrayString = response.substring(beginIndex, endIndex);
				arrayString = arrayString.replaceAll("\"ElectronicCheckingServices\":", "");
				StoredValueService[] svArray = new StoredValueService[0];
				svArray = (StoredValueService[])JsonHelper.JsonToObject(arrayString, svArray);
				
				ArrayOfBankcardService arrayOfBcs = new ArrayOfBankcardService();
				for(BankcardService bcs : bcsArray)
					arrayOfBcs.getBankcardService().add(bcs);
				
				ArrayOfElectronicCheckingService arrayOfEcs = new ArrayOfElectronicCheckingService();
				for(ElectronicCheckingService ecs : ecsArray)
					arrayOfEcs.getElectronicCheckingService().add(ecs);
				
				ArrayOfWorkflow arrayOfWf = new ArrayOfWorkflow();
				for(Workflow wf : wfArray)
					arrayOfWf.getWorkflow().add(wf);
				
				ArrayOfStoredValueService arrayOfSvc = new ArrayOfStoredValueService();
				for(StoredValueService sv : svArray)
					arrayOfSvc.getStoredValueService().add(sv);
				
				ServiceInformation svcInfo = new ServiceInformation();		
				svcInfo.setBankcardServices(arrayOfBcs);
				svcInfo.setElectronicCheckingServices(arrayOfEcs);
				svcInfo.setWorkflows(arrayOfWf);
				svcInfo.setStoredValueServices(arrayOfSvc);
		
				return svcInfo;				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return null;
	}
	
	public void SaveMerchantProfiles(String sessionToken, String serviceId, TenderType tenderType, List<MerchantProfile> merchantProfiles )
	{
		String requestUrl = RestBaseUrl + "/merchProfile?serviceId=" + serviceId;
		
		if(MsgFormat.equals("JSON"))
		{
			try {
				String requestData = JsonHelper.ObjectToJson(merchantProfiles);
				String response = HttpConnections.sendPutRequest(requestUrl, sessionToken, requestData, HttpMethod.PUT, true);								
				if(response.contains("id"))
				{
					int colon = response.indexOf(':');
					int comma = response.indexOf(',');
					String merchProfileId = response.substring(colon + 2, comma - 1);
					if((merchProfileId != null) && (merchProfileId != ""))
						System.out.println("Merchant Profile Saved Successfully! Merchant ProfileID: " + merchProfileId);
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}		
	}
}
