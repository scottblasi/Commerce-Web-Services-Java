package com.ipcommerce.CWS.ServiceProxies;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.PropertiesConfiguration;

import com.ipcommerce.CWS.Helpers.HttpConnections;
import com.ipcommerce.CWS.Helpers.JsonHelper;
import com.ipcommerce.CWS.Helpers.HttpConnections.HttpMethod;
import com.ipcommerce.schemas.cws.v2_0.transactions.Response;
import com.ipcommerce.schemas.cws.v2_0.transactions.Return;
import com.ipcommerce.schemas.cws.v2_0.transactions.Transaction;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.BankcardTransaction;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.pro.BankcardTransactionPro;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.pro.BankcardTransactionResponsePro;
import com.ipcommerce.schemas.cws.v2_0.transactions.electronicchecking.ElectronicCheckingTransaction;
import com.ipcommerce.schemas.cws.v2_0.transactions.electronicchecking.ElectronicCheckingTransactionResponse;
import com.ipcommerce.schemas.cws.v2_0.transactions.rest.AuthorizeAndCaptureTransaction;
import com.ipcommerce.schemas.cws.v2_0.transactions.rest.AuthorizeTransaction;
import com.ipcommerce.schemas.cws.v2_0.transactions.storedvalue.StoredValueTransaction;
import com.ipcommerce.schemas.cws.v2_0.transactions.storedvalue.StoredValueTransactionResponse;

public class TransactionProcessingProxy {
	
	private static String RestBaseUrl;
	private static String MsgFormat;

	public TransactionProcessingProxy(){
		// Load configuration file. 
		try {
			Configuration configFile = new PropertiesConfiguration("com/ipcommerce/CWS/Resources/cws.properties");
		
			RestBaseUrl =  configFile.getString("REST_BASE_URI") + "/Txn";
			MsgFormat = configFile.getString("MSG_FORMAT");
			
		}  catch (org.apache.commons.configuration.ConfigurationException e) {
			System.out.println("ConfigurationException: " + e.getMessage());
		}
	}
	
	// TODO: Add merchantProfile as a parameter - only used for UMP
	public Response Authorize(String sessionToken, Transaction transaction, String applicationProfileId, String merchantProfileId, String workflowId)
	{
		String requestUrl = RestBaseUrl + "/" + workflowId;		

		if(MsgFormat.equals("JSON"))
		{
			try {
				AuthorizeTransaction authorizeTransaction = new AuthorizeTransaction(applicationProfileId, merchantProfileId, transaction);
				String requestData = JsonHelper.ObjectToJson(authorizeTransaction);
				String response = HttpConnections.sendPostRequest(requestUrl, sessionToken, requestData, true);
				if(transaction instanceof BankcardTransaction || transaction instanceof BankcardTransactionPro)
				{
					BankcardTransactionResponsePro txnResponse = new BankcardTransactionResponsePro();
					return (BankcardTransactionResponsePro) JsonHelper.JsonToObject(response, txnResponse);
				}
				if(transaction instanceof ElectronicCheckingTransaction)
				{
					ElectronicCheckingTransactionResponse txnResponse = new ElectronicCheckingTransactionResponse();
					return (ElectronicCheckingTransactionResponse) JsonHelper.JsonToObject(response, txnResponse);
				}
				if(transaction instanceof StoredValueTransaction)
				{
					StoredValueTransactionResponse txnResponse = new StoredValueTransactionResponse();
					return (StoredValueTransactionResponse) JsonHelper.JsonToObject(response, txnResponse);
				}
			} catch (Exception e) {
				// TODO Build REST Fault handler
				System.out.println(e.getMessage());
				e.printStackTrace();
			} 		
		}		
		return null;
	}	

	public Response AuthorizeAndCapture(String sessionToken, Transaction transaction, String applicationProfileId, String merchantProfileId, String workflowId)
	{
		String requestUrl = RestBaseUrl + "/" + workflowId;		

		if(MsgFormat.equals("JSON"))
		{
			try {
				AuthorizeAndCaptureTransaction authorizeTransaction = new AuthorizeAndCaptureTransaction(applicationProfileId, merchantProfileId, transaction);
				String requestData = JsonHelper.ObjectToJson(authorizeTransaction);
				String response = HttpConnections.sendPostRequest(requestUrl, sessionToken, requestData, true);
				if(transaction instanceof BankcardTransaction || transaction instanceof BankcardTransactionPro)
				{
					BankcardTransactionResponsePro txnResponse = new BankcardTransactionResponsePro();
					return (BankcardTransactionResponsePro) JsonHelper.JsonToObject(response, txnResponse);
				}
				if(transaction instanceof ElectronicCheckingTransaction)
				{
					ElectronicCheckingTransactionResponse txnResponse = new ElectronicCheckingTransactionResponse();
					return (ElectronicCheckingTransactionResponse) JsonHelper.JsonToObject(response, txnResponse);
				}
				if(transaction instanceof StoredValueTransaction)
				{
					StoredValueTransactionResponse txnResponse = new StoredValueTransactionResponse();
					return (StoredValueTransactionResponse) JsonHelper.JsonToObject(response, txnResponse);
				}
			} catch (Exception e) {
				// TODO Build REST Fault handler
				System.out.println(e.getMessage());
				e.printStackTrace();
			} 		
		}		
		return null;
	}	
	
	public Response Undo(String sessionToken, com.ipcommerce.schemas.cws.v2_0.transactions.Undo differenceData, String applicationProfileId, String workflowId)
	{
		String requestUrl = RestBaseUrl + "/" + workflowId + "/" + differenceData.getTransactionId();
		
		if(MsgFormat.equals("JSON"))
		{
			try{
				com.ipcommerce.schemas.cws.v2_0.transactions.rest.Undo undo = new com.ipcommerce.schemas.cws.v2_0.transactions.rest.Undo(applicationProfileId, differenceData);
				String requestData = JsonHelper.ObjectToJson(undo);
				String response = HttpConnections.sendPutRequest(requestUrl, sessionToken, requestData, HttpMethod.PUT, true);
				if(requestData.contains("BankcardUndo"))
				{
					BankcardTransactionResponsePro txnResponse = new BankcardTransactionResponsePro();
					return (BankcardTransactionResponsePro) JsonHelper.JsonToObject(response, txnResponse);
				}				
				else
				{
					try{ // If not a bankcard try electronic checking response then stored value.
						ElectronicCheckingTransactionResponse txnResponse = new ElectronicCheckingTransactionResponse();
						return (ElectronicCheckingTransactionResponse) JsonHelper.JsonToObject(response, txnResponse);
					}catch (Exception ex) {
						try { // If the JsonToObject conversion fails, try a stored value transaction response.
							StoredValueTransactionResponse txnResponse = new StoredValueTransactionResponse();
							return (StoredValueTransactionResponse) JsonHelper.JsonToObject(response, txnResponse);
						} catch (Exception e)
						{
							System.out.println(e.getMessage());
							e.printStackTrace();
						}						
					}
				}				
			} catch (Exception e) {
				// TODO Build REST Fault handler
				System.out.println(e.getMessage());
				e.printStackTrace();
			} 
		}
		
		return null;
	}

	public Response ReturnById(String sessionToken, Return differenceData, String applicationProfileId, String workflowId)
	{
		String requestUrl = RestBaseUrl + "/" + workflowId;
		
		if(MsgFormat.equals("JSON"))
		{
			try{
				com.ipcommerce.schemas.cws.v2_0.transactions.rest.ReturnById returnById = new com.ipcommerce.schemas.cws.v2_0.transactions.rest.ReturnById(applicationProfileId, null, differenceData);
				String requestData = JsonHelper.ObjectToJson(returnById);
				String response = HttpConnections.sendPostRequest(requestUrl, sessionToken, requestData, true);
				if(requestData.contains("BankcardReturn"))
				{
					BankcardTransactionResponsePro txnResponse = new BankcardTransactionResponsePro();
					return (BankcardTransactionResponsePro) JsonHelper.JsonToObject(response, txnResponse);
				}				
				else
				{
					try{ // If not a bankcard try electronic checking response then stored value.
						ElectronicCheckingTransactionResponse txnResponse = new ElectronicCheckingTransactionResponse();
						return (ElectronicCheckingTransactionResponse) JsonHelper.JsonToObject(response, txnResponse);
					}catch (Exception ex) {
						try { // If the JsonToObject conversion fails, try a stored value transaction response.
							StoredValueTransactionResponse txnResponse = new StoredValueTransactionResponse();
							return (StoredValueTransactionResponse) JsonHelper.JsonToObject(response, txnResponse);
						} catch (Exception e)
						{
							System.out.println(e.getMessage());
							e.printStackTrace();
						}						
					}
				}				
			} catch (Exception e) {
				// TODO Build REST Fault handler
				System.out.println(e.getMessage());
				e.printStackTrace();
			} 
		}
		
		return null;
	}
}
