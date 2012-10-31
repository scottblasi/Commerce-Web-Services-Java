package com.ipcommerce.CWS.Helpers;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.PropertiesConfiguration;

import com.ipcommerce.schemas.cws.v2_0.serviceinformation.AddressInfo;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.ApplicationData;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.ApplicationLocation;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.BankcardMerchantData;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.BankcardTransactionDataDefaults;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.CustomerPresent;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.EncryptionType;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.EntryMode;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.HardwareType;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.IndustryType;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.MerchantProfile;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.MerchantProfileMerchantData;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.MerchantProfileTransactionData;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.PINCapability;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.ReadCapability;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.RequestACI;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.RequestAdvice;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.TypeISOCountryCodeA3;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.TypeISOCurrencyCodeA3;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.TypeISOLanguageCodeA3;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.TypeStateProvince;
import com.ipcommerce.schemas.cws.v2_0.transactions.AlternativeMerchantData;
import com.ipcommerce.schemas.cws.v2_0.transactions.Transaction;
import com.ipcommerce.schemas.cws.v2_0.transactions.TransactionReportingData;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.AccountType;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.BankcardTenderData;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.BankcardTransaction;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.BankcardTransactionData;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.BillPayment;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.CardData;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.ExistingDebt;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.GoodsType;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.IsTaxExempt;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.Level2Data;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.PartialApprovalSupportType;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.RequestCommercialCard;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.Tax;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.TaxExempt;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.TypeCardType;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.pro.BankcardInterchangeData;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.pro.BankcardTransactionDataPro;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.pro.BankcardTransactionPro;

public class DataGenerator {

    public static ApplicationData CreateApplicationData()
    {
		try {
			Configuration configFile = new PropertiesConfiguration("com/ipcommerce/CWS/Resources/cws.properties");
			ApplicationData appData = new ApplicationData();
			appData.setSoftwareVersion(configFile.getString("SOFTWARE_VERSION"));
			// TODO fix this reading of calendar date - its wrong
			Calendar cal = Calendar.getInstance();
			try {
				cal.setTime(new SimpleDateFormat().parse(configFile.getString("SOFTWARE_VERSION_DATE")));
			} catch (ParseException e) {
				cal.getTime();
			}
			appData.setSoftwareVersionDate(cal);
			appData.setDeviceSerialNumber(configFile.getString("DEVICE_SERIAL_NUMBER"));
			appData.setApplicationAttended(Boolean.valueOf(configFile.getString("APPLICATION_ATTENDED")));
			appData.setApplicationLocation(ApplicationLocation.fromValue(configFile.getString("APPLICATION_LOCATION")));
			appData.setPTLSSocketId(configFile.getString("PTLS_SOCKET_ID"));
			appData.setEncryptionType(EncryptionType.fromValue(configFile.getString("ENCRYPTION_TYPE")));
			appData.setApplicationName(configFile.getString("APPLICATION_NAME"));
			appData.setSerialNumber(configFile.getString("SERIAL_NUMBER"));
			appData.setHardwareType(HardwareType.fromValue(configFile.getString("HARDWARE_TYPE")));
			appData.setPINCapability(PINCapability.fromValue(configFile.getString("PIN_CAPABILITY")));
			appData.setReadCapability(ReadCapability.fromValue(configFile.getString("READ_CAPABILITY")));
			return appData;
			
		}  catch (org.apache.commons.configuration.ConfigurationException e) {
			System.out.println("ConfigurationException: " + e.getMessage());
		}
		return null;    	    	    	
    }
    
    /*	
     * Date stuff, use to fix above	
     * if(obj instanceof ApplicationData)
			{
				Calendar cal = ((ApplicationData) obj).getSoftwareVersionDate();
				String sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a").format(cal.getTime());
				int valueIndex = requestData.indexOf("softwareVersionDate");
				int colonIndex = requestData.indexOf(':', valueIndex);
				int commaIndex = requestData.indexOf(',', colonIndex);
				String replaceString = requestData.substring(colonIndex + 1, commaIndex);
				requestData = requestData.replace(replaceString, "\"" + sdf.toString() + "\"");
			}	*/
    
    public static List<MerchantProfile> CreateMerchantProfiles()
    {
    	try
    	{
    		Configuration configFile = new PropertiesConfiguration("com/ipcommerce/CWS/Resources/cws.properties");
	    	
    		MerchantProfile merchProfile = new MerchantProfile();
	    	merchProfile.setProfileId(configFile.getString("MERCHANT_PROFILE_ID"));
	    	Calendar cal = Calendar.getInstance();	    	
	    	merchProfile.setLastUpdated(cal);
	    	
	    	MerchantProfileMerchantData merchData = new MerchantProfileMerchantData();
	    	merchData.setCustomerServiceInternet(configFile.getString("CUSTOMER_SERVICE_INTERNET"));
	    	merchData.setCustomerServicePhone(configFile.getString("CUSTOMER_SERVICE_PHONE"));
	    	merchData.setLanguage(TypeISOLanguageCodeA3.fromValue(configFile.getString("LANGUAGE")));
	    	merchData.setMerchantId(configFile.getString("MERCHANT_ID"));
	    	merchData.setName(configFile.getString("MERCHANT_NAME"));
	    	merchData.setPhone(configFile.getString("MERCHANT_PHONE"));
	    		    	
	    	BankcardMerchantData bcMerchData = new BankcardMerchantData();
	    	bcMerchData.setABANumber("128965");
	    	bcMerchData.setAgentChain("1289");
	    	bcMerchData.setAgentBank("1289");
	    	bcMerchData.setAcquirerBIN("1248");
	    	bcMerchData.setLocation("108");
	    	bcMerchData.setPrintCustomerServicePhone(false);
	    	bcMerchData.setReimbursementAttribute("X");
	    	bcMerchData.setSettlementAgent("0001");
	    	bcMerchData.setSharingGroup("0001");
	    	bcMerchData.setStoreId("0001");
	    	bcMerchData.setSecondaryTerminalId("751");
	    	bcMerchData.setTimeZoneDifferential("750");
	    	bcMerchData.setIndustryType(IndustryType.fromValue(configFile.getString("INDUSTRY_TYPE")));
	    	bcMerchData.setSIC("4599"); // Required, Standard Industry Code
	    	bcMerchData.setClientNumber("1234"); // Optional - Required for Chase
	    	bcMerchData.setAggregator(Boolean.valueOf(configFile.getString("PRO_INCLUDE_ALTERNATIVE_MERCHANT_DATA")));
	    	bcMerchData.setTerminalId("001");
	    	
	    	AddressInfo address = new AddressInfo();
	    	address.setStreet1(configFile.getString("MERCH_STREET_1"));
	    	if(configFile.getString("MERCH_STREET_2") != null)
	    		address.setStreet2(configFile.getString("MERCH_STREET_2"));
	    	address.setCity(configFile.getString("MERCH_CITY"));
	    	address.setStateProvince(TypeStateProvince.fromValue(configFile.getString("MERCH_STATE_PROVINCE")));
	    	address.setPostalCode(configFile.getString("MERCH_POSTAL_CODE"));
	    	address.setCountryCode(TypeISOCountryCodeA3.fromValue(configFile.getString("MERCH_COUNTRY_CODE")));
	    	
	    	BankcardTransactionDataDefaults bcTxnDataDefaults = new BankcardTransactionDataDefaults();
	    	bcTxnDataDefaults.setCurrencyCode(TypeISOCurrencyCodeA3.fromValue(configFile.getString("CURRENCY_CODE")));
	    	bcTxnDataDefaults.setCustomerPresent(CustomerPresent.fromValue(configFile.getString("CUSTOMER_PRESENT")));
	    	bcTxnDataDefaults.setRequestACI(RequestACI.fromValue(configFile.getString("REQUEST_ACI")));
	    	bcTxnDataDefaults.setEntryMode(EntryMode.fromValue(configFile.getString("ENTRY_MODE")));
	    	bcTxnDataDefaults.setRequestAdvice(RequestAdvice.NOT_CAPABLE); // [NotSet,NotCapable,Capable]
	        	    	
	    	MerchantProfileTransactionData merchTxnData = new MerchantProfileTransactionData();
	    	merchTxnData.setBankcardTransactionDataDefaults(bcTxnDataDefaults);
	    	merchProfile.setTransactionData(merchTxnData);
	    	merchData.setBankcardMerchantData(bcMerchData);
	    	merchData.setAddress(address);
	    	merchProfile.setMerchantData(merchData);
	    	
	    	List<MerchantProfile> merchantProfiles = new ArrayList<MerchantProfile>();
	    	merchantProfiles.add(merchProfile);
	    	return merchantProfiles;
    	} catch (org.apache.commons.configuration.ConfigurationException e) {
			System.out.println("ConfigurationException: " + e.getMessage());
		}
    	return null;
    }
    
    public static Transaction CreateBankcardTransaction()
    {
    	try
    	{
    		Configuration configFile = new PropertiesConfiguration("com/ipcommerce/CWS/Resources/cws.properties");
	    	    		
	    	CardData cardData = new CardData();
	    	IndustryType industry = IndustryType.fromValue(configFile.getString("TXN_DATA_INDUSTRY_TYPE"));
	    	
	    	if(industry == IndustryType.RETAIL)
	    	{
	    		cardData.setCardType(TypeCardType.VISA);
	    		cardData.setExpire("1012");
	    		cardData.setPAN("5454545454545454");
	    		cardData.setTrack1Data("B4111111111111111^IPCOMMERCE/TESTCARD^10121010454500415000010");
	    	}
	    	if(industry == IndustryType.RESTAURANT)
	    	{
	    		cardData.setCardType(TypeCardType.VISA);
	    		cardData.setExpire("1012");
	    		cardData.setPAN("5454545454545454");
	    		cardData.setTrack1Data("B4111111111111111^IPCOMMERCE/TESTCARD^10121010454500415000010");
	    	}
	    	if(industry == IndustryType.MOTO)
	    	{
	    		cardData.setCardholderName("John Doe");
	    		cardData.setCardType(TypeCardType.MASTER_CARD);
	    		cardData.setExpire("1012");
	    		cardData.setPAN("5454545454545454");
	    		//tenderData.CardSecurityData = new CardSecurityData();
                //tenderData.CardSecurityData.CVData = "111";
                //tenderData.CardSecurityData.CVDataProvided = CVDataProvided.Provided;
	    	}
	    	if(industry == IndustryType.ECOMMERCE)
	    	{
	    		cardData.setCardholderName("John Doe");
	    		cardData.setCardType(TypeCardType.MASTER_CARD);
	    		cardData.setExpire("1012");
	    		cardData.setPAN("5454545454545454");
	    		//tenderData.CardSecurityData = new CardSecurityData();
                //tenderData.CardSecurityData.CVData = "111";
                //tenderData.CardSecurityData.CVDataProvided = CVDataProvided.Provided;
	    	}
	    	
	    	/*
             * Note: not all processors support the new Alternative Merchant Data object
             * 		 See else statement below for alternate format of Soft Descriptors
             */
	    	AlternativeMerchantData altMerchData = new AlternativeMerchantData();
	    	TransactionReportingData reportingData = new TransactionReportingData();
	    	if(Boolean.valueOf(configFile.getString("TXN_DATA_SOFT_DESCRIPTORS")))
	    	{
	    		altMerchData.setName("AltMerchName");
	    		altMerchData.setMerchantId("122234");
	    		altMerchData.setDescription("Blue Bottle");
	    		altMerchData.setCustomerServiceInternet("test@altmerch.com");
	    		altMerchData.setCustomerServicePhone("303 5551212");
	    		com.ipcommerce.schemas.cws.v2_0.transactions.AddressInfo address = new com.ipcommerce.schemas.cws.v2_0.transactions.AddressInfo();
	    		address.setStreet1("123 Test Street");
	    		address.setCity("Denver");
	    		address.setStateProvince("CO");
	    		address.setPostalCode("80202");
	    		address.setCountryCode(com.ipcommerce.schemas.cws.v2_0.transactions.TypeISOCountryCodeA3.USA);	    		
	    		altMerchData.setAddress(address);
	    	}
	    	/*
            * Note: older processors support this way of Soft Descriptors/Alternative Merchant Data
            * 		 the combination of your top level MerchantProfile->MerchantName with MerchantProfile->CustomerServiceInternet
            * 		 combined with the ReportingData->Description will make the soft descriptor format
            */
	    	else
	    	{
	    		reportingData.setDescription("AltMerchName");
	    	}
	    	
	    	BankcardInterchangeData interchangeData = new BankcardInterchangeData();
	    	if(Boolean.valueOf(configFile.getString("PRO_INTERCHANGE_DATA")))
	    	{	    		
	    		interchangeData.setBillPayment(BillPayment.RECURRING); // Any time BillPayInd is set to either "DeferredBilling", "Installment", "SinglePayment" or "Recurring", CustomerPresent should be set to "BillPayment"
	    		interchangeData.setRequestCommercialCard(RequestCommercialCard.NOT_SET);
	    		interchangeData.setExistingDebt(ExistingDebt.NOT_EXISTING_DEBT);
	    		interchangeData.setTotalNumberOfInstallments(1); // Used for Installment Payments
	    		interchangeData.setCurrentInstallmentNumber(1); // Send 1 for the first payment and any number greater than 1 for the remaining payments.
	    		interchangeData.setRequestACI(com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.RequestACI.NOT_SET);
	    		interchangeData.setRequestAdvice(com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.RequestAdvice.NOT_SET);
	    	}
	    	else
	    	{
	    		interchangeData.setBillPayment(BillPayment.NOT_SET);
	    		interchangeData.setRequestCommercialCard(RequestCommercialCard.NOT_SET);
	    		interchangeData.setExistingDebt(ExistingDebt.NOT_SET);
	    		interchangeData.setTotalNumberOfInstallments(0);
	    		interchangeData.setCurrentInstallmentNumber(0);
	    		interchangeData.setRequestACI(com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.RequestACI.NOT_SET);
	    		interchangeData.setRequestAdvice(com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.RequestAdvice.NOT_SET);
	    	}
	    	
	    	BankcardTenderData tenderData = new BankcardTenderData(); 
	    	tenderData.setCardData(cardData);
	    	
	    	if(Boolean.valueOf(configFile.getString("PRO_INCLUDE_LEVEL_2_OR_LEVEL_3_DATA")))
	    	{
	    		BankcardTransactionPro txn = new BankcardTransactionPro();
	    		txn.setTenderData(tenderData);
	    		txn.setReportingData(reportingData);
	    		txn.setInterchangeData(interchangeData);
	    		
	    		BankcardTransactionDataPro transactionData = new BankcardTransactionDataPro();
	    		transactionData.setAlternativeMerchantData(altMerchData);
	    		transactionData.setAmount(new BigDecimal(10.00).setScale(2, RoundingMode.HALF_EVEN));
	    		transactionData.setCashBackAmount(new BigDecimal(0.00).setScale(2, RoundingMode.HALF_EVEN));
	    		transactionData.setTipAmount(new BigDecimal(0.00).setScale(2, RoundingMode.HALF_EVEN));
	    		transactionData.setFeeAmount(new BigDecimal(0.00).setScale(2, RoundingMode.HALF_EVEN));
	    		transactionData.setAccountType(AccountType.NOT_SET);
	    		transactionData.setCustomerPresent(com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.CustomerPresent.fromValue(configFile.getString("TXN_DATA_CUSTOMER_PRESENT")));
	    		transactionData.setEmployeeId("12"); // Used for Regail, Restaurant, MOTO
	    		transactionData.setEntryMode(com.ipcommerce.schemas.cws.v2_0.transactions.EntryMode.fromValue(configFile.getString("TXN_DATA_ENTRY_MODE")));
	    		transactionData.setGoodsType(GoodsType.DIGITAL_GOODS); // DigitalGoods - PhysicalGoods - Used only for Ecommerce
	    		//transactionData.setAccountType(AccountType.CheckingAccount); // SavingsAccount, CheckingAccount - used only for PINDebit
	    		transactionData.setCurrencyCode(com.ipcommerce.schemas.cws.v2_0.transactions.TypeISOCurrencyCodeA3.USD);
	    		transactionData.setSignatureCaptured(false); // Required
	    		transactionData.setIsQuasiCash(false); // Optional
	    		transactionData.setIsPartialShipment(false); // Optional	 
	    		transactionData.setPartialApprovalCapable(PartialApprovalSupportType.NOT_SET);
	    		// TODO Fix this so the format is in 2012-10-23T14:38:59.730-06:00
	    		Calendar cal = Calendar.getInstance();
				//String sdf = new SimpleDateFormat("yyyy-MM-ddThh:mm:ss").format(cal.getTime());
	    		transactionData.setTransactionDateTime("2012-10-23T14:38:59.730-06:00");
	    		transactionData.setOrderNumber("12345");
	    		transactionData.setLaneId("1");
	    		
	    		// Level 2 Data
	    		Level2Data l2d = new Level2Data();
	    		l2d.setBaseAmount(new BigDecimal(9.00).setScale(2, RoundingMode.HALF_EVEN));
	    		l2d.setOrderNumber("12345");
	    		l2d.setDestinationPostal("80211");	    		
	    		l2d.setOrderDate(cal);
	    		l2d.setDescription("level2Description");
	    		Tax tax = new Tax();
	    		tax.setAmount(new BigDecimal(1.00).setScale(2, RoundingMode.HALF_EVEN));
	    		TaxExempt te = new TaxExempt();
	    		te.setIsTaxExempt(IsTaxExempt.NOT_EXEMPT_TAX_INFO_NOT_PROVIDED);
	    		
	    		transactionData.setLevel2Data(l2d);
	    		txn.setTransactionData(transactionData);
	    		return txn;
	    	}
	    	else
	    	{
	    		BankcardTransaction txn = new BankcardTransaction();
	    		txn.setTenderData(tenderData);
	    		txn.setReportingData(reportingData);
	    		
	    		BankcardTransactionData transactionData = new BankcardTransactionData();
	    		transactionData.setAlternativeMerchantData(altMerchData);
	    		transactionData.setAmount(new BigDecimal(10.00).setScale(2, RoundingMode.HALF_EVEN));
	    		transactionData.setCashBackAmount(new BigDecimal(0.00).setScale(2, RoundingMode.HALF_EVEN));
	    		transactionData.setTipAmount(new BigDecimal(0.00).setScale(2, RoundingMode.HALF_EVEN));
	    		transactionData.setFeeAmount(new BigDecimal(0.00).setScale(2, RoundingMode.HALF_EVEN));
	    		transactionData.setAccountType(AccountType.NOT_SET);
	    		transactionData.setCustomerPresent(com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.CustomerPresent.fromValue(configFile.getString("TXN_DATA_CUSTOMER_PRESENT")));
	    		transactionData.setEmployeeId("12"); // Used for Regail, Restaurant, MOTO
	    		transactionData.setEntryMode(com.ipcommerce.schemas.cws.v2_0.transactions.EntryMode.fromValue(configFile.getString("TXN_DATA_ENTRY_MODE")));
	    		transactionData.setGoodsType(GoodsType.DIGITAL_GOODS); // DigitalGoods - PhysicalGoods - Used only for Ecommerce
	    		//transactionData.setAccountType(AccountType.CheckingAccount); // SavingsAccount, CheckingAccount - used only for PINDebit
	    		transactionData.setCurrencyCode(com.ipcommerce.schemas.cws.v2_0.transactions.TypeISOCurrencyCodeA3.USD);
	    		transactionData.setSignatureCaptured(false); // Required
	    		transactionData.setIsQuasiCash(false); // Optional
	    		transactionData.setIsPartialShipment(false); // Optional
	    		transactionData.setPartialApprovalCapable(PartialApprovalSupportType.NOT_SET);
	    		Calendar cal = Calendar.getInstance();
				//String sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a").format(cal.getTime());
	    		transactionData.setTransactionDateTime("2012-10-23T14:38:59.730-06:00");
	    		transactionData.setOrderNumber("12345");
	    		transactionData.setLaneId("1");
	    		
	    		txn.setTransactionData(transactionData);
	    		return txn;
	    	}	    	
    	} catch (org.apache.commons.configuration.ConfigurationException e) {
			System.out.println("ConfigurationException: " + e.getMessage());
		}
    	return null;
    }
}

