package com.ipcommerce.CWS.Sample;

import javax.naming.ConfigurationException;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.PropertiesConfiguration;

import com.ipcommerce.CWS.Helpers.DataGenerator;
import com.ipcommerce.CWS.ServiceProxies.ServiceInformationProxy;
import com.ipcommerce.CWS.ServiceProxies.TransactionProcessingProxy;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.ApplicationData;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.ArrayOfBankcardService;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.BankcardService;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.CloseBatch;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.MerchantProfile;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.ServiceInformation;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.TenderType;
import com.ipcommerce.schemas.cws.v2_0.transactions.Response;
import com.ipcommerce.schemas.cws.v2_0.transactions.Transaction;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.BankcardReturn;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.BankcardTenderData;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.BankcardTransaction;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.BankcardUndo;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.PINDebitUndoReason;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.pro.BankcardTransactionPro;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.pro.BankcardTransactionResponsePro;

public class CommerceWebServicesSampleCode {
	
	private static String identityToken;
	private static String sessionToken;
	private static String applicationProfileId;
	private static String merchantProfileId;
	
	private static ServiceInformation svcInfo;
	private static BankcardService bankcardService;
	private static String bcpServiceId;
	private static String eckServiceId;
	private static String svaServiceId;	
	
	private ServiceInformationProxy svcClient = new ServiceInformationProxy();
	private TransactionProcessingProxy txnClient = new TransactionProcessingProxy();
	
	public CommerceWebServicesSampleCode()
	{
		// Load configuration file. 
		try {
			Configuration configFile = new PropertiesConfiguration("com/ipcommerce/CWS/Resources/cws.properties");
		
			identityToken =  configFile.getString("IDENTITY_TOKEN");
			merchantProfileId = configFile.getString("MERCHANT_PROFILE_ID");			
			
		}  catch (org.apache.commons.configuration.ConfigurationException e) {
			System.out.println("ConfigurationException: " + e.getMessage());
		}
	}
	
	public void SampleCodeRunner()
	{
		// Step 1: SignOn Authentication
		SignOn();
		
		// Step 2: Managing Application Configuration Data
		ManageApplicationConfigurationData();
		
		// Step 3: Retrieving Service Information	
        RetrieveServiceInformation();
        
        // Step 4: Manage Merchant Profiles
        ManageMerchantProfiles();
        
        // Step 5: Authorizing Transactions
        AuthorizeTransactionAndTokenization();
        AuthorizeAndCaptureTransaction();
        
        // Step 6: Adjusting And Voiding Transactions
        //TODO Adjust
        Undo();
        
        // Step 7: Capturing Transactions for Settlement
        //TODO Capture / CaptureAll / CaptureAllAsync / CaptureSelective / CaptureSelectiveAsync
        
        // Step 8: Refunding Transactions
        // TODO ReturnUnlinked
        ReturnById();
        
        System.out.println("Finished CWS SampleCodeRunner");
	}

	private void SignOn()
	{
		System.out.println("Attempting to sing on...");
		sessionToken = svcClient.SignOn(identityToken);
		if(sessionToken != null || sessionToken != "")
			System.out.println("Sign on successful! SessionToken: " + sessionToken);
	}
	
	private void ManageApplicationConfigurationData()
	{
		System.out.println("Attempting to save application data...");
        ApplicationData applicationData = DataGenerator.CreateApplicationData();
        applicationProfileId = svcClient.SaveApplicationData(sessionToken, applicationData);
        if(!applicationProfileId.equals(null) || !applicationProfileId.isEmpty())
        	System.out.println("Application saved successfully! Application Profile ID: " + applicationProfileId + "\n");
        else System.out.println("ERROR Saving Application!\n");
	}
	
	private void RetrieveServiceInformation()
	{
		System.out.println("Getting service information...");
		svcInfo = svcClient.GetServiceInformation(sessionToken);
		System.out.println("Service information recieved!");
		// TODO Print some service information
	}

	private void ManageMerchantProfiles()
	{
		ArrayOfBankcardService bankcardServices = svcInfo.getBankcardServices();
		// If there are multiple services you'll want to use them as desired. The sample will only focus on the first one.
		if(bankcardServices.getBankcardService() != null)
		{
			bankcardService = bankcardServices.getBankcardService().get(0);
			bcpServiceId = bankcardService.getServiceId();
			MerchantProfile merchProfile = new MerchantProfile();
			System.out.println("There are " + bankcardServices.getBankcardService().size() + " bankcard services available. Using serviceId " + bcpServiceId);
			System.out.println("Merchant Profile " + merchantProfileId + " does not exist. Attempting to save...");
			svcClient.SaveMerchantProfiles(sessionToken, bcpServiceId, TenderType.CREDIT, DataGenerator.CreateMerchantProfiles());			
			// TODO: add IsMerchantProfileInitialized			
		}		
		
		
		// TODO: Add eck and sva below is just code from C# project to reference to finish building this method.
		
		 //   #region Step 4: Managing Merchant Profiles
		 //   if (serviceInfo.BankcardServices.Any())
			//    {
		        // If there are multiple services you'll want to use them as desired. The sample will only focus on the first one.
			//        var bankcardService = serviceInfo.BankcardServices.First();
			//        _bcpServiceId = bankcardService.ServiceId;
			//        Console.WriteLine("There are " + serviceInfo.BankcardServices.Count() + " bankcard services available. Using serviceId " + _bcpServiceId + "\n");

			//        if (!_svcClient.IsMerchantProfileInitialized(_sessionToken, _bcpServiceId, _merchantProfileId, TenderType.Credit))
			//        {
			//            Console.WriteLine("Merchant Profile " + _merchantProfileId + " does not exist. Attempting to save...");
			//            _svcClient.SaveMerchantProfiles(_sessionToken, _bcpServiceId, TenderType.Credit, DataGenerator.CreateMerchantProfiles());
			//            if (_svcClient.IsMerchantProfileInitialized(_sessionToken, _bcpServiceId, _merchantProfileId, TenderType.Credit))
			//                Console.WriteLine("Merchant Profile " + _merchantProfileId + " saved successfully!\n");

			//        } else Console.WriteLine("Merchant Profile " + _merchantProfileId + " exists. Skipping SaveMerchantProfiles.");
			//    }
		// TODO Call "GetMerchantProfiles" 
	}
	//TODO Check for operations = true on each transaction	
	private void AuthorizeTransactionAndTokenization()
	{
		if(bcpServiceId != null || bcpServiceId != "");
		{
			Transaction txn = DataGenerator.CreateBankcardTransaction();
			System.out.println("\nBankcard Processing: Authorizing transaction...");
			Response response = txnClient.Authorize(sessionToken, txn, applicationProfileId, merchantProfileId, bcpServiceId);	

			// For tokenization grab the PaymentAccountDataToken from the response, then use this token instead of submitting card data. 
			if(response instanceof BankcardTransactionResponsePro)
			{
				String paymentAccountDataToken = ((BankcardTransactionResponsePro)response).getPaymentAccountDataToken();
				((BankcardTransactionPro)txn).setTenderData(null);
				BankcardTenderData tenderData = new BankcardTenderData();
				tenderData.setPaymentAccountDataToken(paymentAccountDataToken);
				((BankcardTransactionPro)txn).setTenderData(tenderData);
				response = txnClient.Authorize(sessionToken, txn, applicationProfileId, merchantProfileId, bcpServiceId);
			}
		}
		
	 /*
		var bankcardTransaction = DataGenerator.CreateBankcardTransaction();
        var eckTransaction = new ElectronicCheckingTransaction(); // TODO create ECK Transaction
        var svaTransaction = new StoredValueTransaction(); // TODO Create SVA Transaction
        
        var txnIdForAdjustAndCapture = "";
        var txnIdForUndo = "";
        var txnIdsForCaptureAll = new List<string>();
        var txnIdsForCaptureSelective = new List<string>();
        var txnIdForReturnById = "";
        // Bankcard Services - Authorize
        if(!string.IsNullOrEmpty(_bcpServiceId) && serviceInfo.BankcardServices.First().Operations.Authorize)
        {
            Console.WriteLine("\nBankcard Processing: Creating transaction to adjust and then capture...");
            var response = _txnClient.Authorize(_sessionToken, bankcardTransaction, _applicationProfileId, _merchantProfileId,_bcpServiceId);
            ScreenPrinter.PrintTransactionResponse(response, "AUTHORIZE");
            if(response != null)
                txnIdForAdjustAndCapture = !string.IsNullOrEmpty(response.TransactionId) ? response.TransactionId : null;

            Console.WriteLine("\nBankcard Processing: Creating transaction to undo...");
            var response2 = _txnClient.Authorize(_sessionToken, bankcardTransaction, _applicationProfileId, _merchantProfileId, _bcpServiceId);
            ScreenPrinter.PrintTransactionResponse(response2, "AUTHORIZE");
            if (response2 != null)
                txnIdForUndo = !string.IsNullOrEmpty(response2.TransactionId) ? response2.TransactionId : null;

            Console.WriteLine("\nBankcard Processing: Creating 3 transactions to be used to Capture All...");
            for (int i = 0; i < 3; i++)
            {
                var response3 = _txnClient.Authorize(_sessionToken, bankcardTransaction, _applicationProfileId, _merchantProfileId, _bcpServiceId);
                ScreenPrinter.PrintTransactionResponse(response3, "AUTHORIZE");
                if (response3 != null && !string.IsNullOrEmpty(response3.TransactionId))
                    txnIdsForCaptureAll.Add(response3.TransactionId);
            }

            Console.WriteLine("\nBankcard Processing: Creating 3 transactions to be used to Capture Selective...");
            for (int i = 0; i < 3; i++)
            {
                var response4 = _txnClient.Authorize(_sessionToken, bankcardTransaction, _applicationProfileId, _merchantProfileId, _bcpServiceId);
                ScreenPrinter.PrintTransactionResponse(response4, "AUTHORIZE");
                if (response4 != null && !string.IsNullOrEmpty(response4.TransactionId))
                    txnIdsForCaptureSelective.Add(response4.TransactionId);
            }
        } */
	}

	private void AuthorizeAndCaptureTransaction()
	{		
		if(bcpServiceId != null || bcpServiceId != "");
		{
			Transaction txn = DataGenerator.CreateBankcardTransaction();
			System.out.println("\nBankcard Processing: Authorize And Capture transaction...");
			txnClient.AuthorizeAndCapture(sessionToken, txn, applicationProfileId, merchantProfileId, bcpServiceId);			
		}
	}

	private void Undo()
	{
		// Undo may only be done on a transaction that has been authorized but not yet captured.
		if(bcpServiceId != null || bcpServiceId != "");
		{
			Transaction txn = DataGenerator.CreateBankcardTransaction();
			System.out.println("\nBankcard Processing: Authorizing transaction for Undo...");
			Response response = txnClient.Authorize(sessionToken, txn, applicationProfileId, merchantProfileId, bcpServiceId);			
			
			// Must be BankcardUndo for BankcardTransactions
			if(response != null) 
			{
				String txnId = response.getTransactionId();
				BankcardUndo bcUndo = new BankcardUndo();
				System.out.println("Bankcard Processing: Undo for transaction id " + txnId + "...");
				bcUndo.setTransactionId(txnId);
				bcUndo.setForceVoid(false);
				bcUndo.setPINDebitReason(PINDebitUndoReason.NOT_SET);
				response = txnClient.Undo(sessionToken, bcUndo, applicationProfileId, bcpServiceId);
			}
			if(response != null)
				System.out.println("Bankcard Processing: Undo successful! Undo transaction id " +  response.getTransactionId());
		}
	}
	
	private void ReturnById()
	{
		// ReturnById is used to perform a linked credit to a cardholder's account from a previously authorized and captured transaction.
		if(bcpServiceId != null || bcpServiceId != "");
		{
			Transaction txn = DataGenerator.CreateBankcardTransaction();
			System.out.println("\nBankcard Processing: Authorize And Capture transaction for Return By Id...");
			Response response = txnClient.AuthorizeAndCapture(sessionToken, txn, applicationProfileId, merchantProfileId, bcpServiceId);
			
			// Must be BankcardReturn for BankcardTransactions
			if (response != null)
			{				
				String txnId = response.getTransactionId();
				BankcardReturn bcReturn = new BankcardReturn();
				bcReturn.setTransactionId(response.getTransactionId());
				if(txn instanceof BankcardTransaction || txn instanceof BankcardTransactionPro)
					bcReturn.setAmount(((BankcardTransaction)txn).getTransactionData().getAmount());				
				txnClient.ReturnById(sessionToken, bcReturn, applicationProfileId, bcpServiceId);
			}
		}		
	}
}
