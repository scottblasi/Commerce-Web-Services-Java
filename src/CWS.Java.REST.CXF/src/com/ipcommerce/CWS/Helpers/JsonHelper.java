package com.ipcommerce.CWS.Helpers;

import java.io.IOException;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Properties;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.module.SimpleModule;

import com.ipcommerce.schemas.cws.v2_0.serviceinformation.ApplicationData;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.BatchAssignmentSupport;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.CloseBatch;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.CreditAuthorizeSupportType;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.CreditReturnSupportType;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.CreditReversalSupportType;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.MerchantProfile;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.PINDebitReturnSupportType;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.PartialApprovalSupportType;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.PinDebitUndoSupportType;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.PurchaseCardLevel;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.QueryRejectedSupportType;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.TrackDataSupportType;
import com.ipcommerce.schemas.cws.v2_0.transactions.CVResult;
import com.ipcommerce.schemas.cws.v2_0.transactions.CaptureState;
import com.ipcommerce.schemas.cws.v2_0.transactions.Status;
import com.ipcommerce.schemas.cws.v2_0.transactions.Transaction;
import com.ipcommerce.schemas.cws.v2_0.transactions.TransactionState;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.AdviceResponse;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.CommercialCardResponse;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.PrepaidCard;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.Resubmit;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.TypeCardType;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.BankcardUndo;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.BankcardReturn;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.pro.BankcardTransactionDataPro;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.pro.BankcardTransactionPro;
import com.ipcommerce.schemas.cws.v2_0.transactions.rest.AuthorizeAndCaptureTransaction;
import com.ipcommerce.schemas.cws.v2_0.transactions.rest.AuthorizeTransaction;
import com.ipcommerce.schemas.cws.v2_0.transactions.rest.ReturnById;
import com.ipcommerce.schemas.cws.v2_0.transactions.rest.Undo;
import com.microsoft.schemas._2003._10.serialization.Char;

//Jackson JSON User Group - http://jackson-users.ning.com/
public class JsonHelper {

//	public static <T> String ObjectToJson(Class<T> clazz, Object obj)
	public static String ObjectToJson(Object obj)
	{	
		try {
			ObjectMapper mapper = new ObjectMapper();
			String requestData = mapper.writeValueAsString(obj);
			
			while(requestData.contains("value"))
			{
				int valueIndex = requestData.indexOf("value");
				int endBracketIndex = requestData.indexOf('}', valueIndex);
				// Grabs the full string to replace ex. {"value:"OffPremises"}
				String replaceString = requestData.substring(valueIndex - 2, endBracketIndex + 1);
				// Grabs the value string only ex. "OffPremises"
				String valueOnly = requestData.substring(valueIndex + 7, endBracketIndex);
				requestData = requestData.replace(replaceString, valueOnly);				 
			}		
			// TODO Fix this - after converting from using Axis to CXF, enumerations now have underscores between words. 
			// Temp fix is to remove the underscores throughout the json string, but this is not a good idea. Figure
			// out a better way to do this. Options include Jackson removing them during writing, or regenerate
			// CXF classes and remove underscores during class generation. 
			// After creating the deserialization methods below, this would be a good place to do the same option for serializing.
			requestData = requestData.replace("_", "");
			
			requestData = HandleObjects(obj, requestData);			
			
			return requestData;
			
		}  catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return null;
	}	
	
	// If ArrayList exists, pull each object out, rerun HandleDates for each object type.	
	private static String HandleObjects(Object obj, String requestData)
	{
		// TODO requestData should be pass by reference for this recursion....
		if(obj instanceof ArrayList)
		{
			for(Object o : ((ArrayList)obj))
				requestData = HandleObjects(o, requestData);
		}		
		if(obj instanceof MerchantProfile)
		{
			Calendar cal = ((MerchantProfile)obj).getLastUpdated();
			requestData = ReplaceDateInString(requestData, "lastUpdated", cal);
		}		
		if(obj instanceof ApplicationData)
		{
			Calendar cal = ((ApplicationData) obj).getSoftwareVersionDate();
			requestData = ReplaceDateInString(requestData, "softwareVersionDate", cal);
		}		
		if(obj instanceof AuthorizeTransaction)
		{
			Transaction txn = ((AuthorizeTransaction)obj).getTransaction();
			if(txn instanceof BankcardTransactionPro)
			{
				BankcardTransactionDataPro txnDataPro = (BankcardTransactionDataPro) ((BankcardTransactionPro) txn).getTransactionData();
				Calendar cal = txnDataPro.getLevel2Data().getOrderDate();
				requestData = ReplaceDateInString(requestData, "orderDate", cal);
				String replaceString = "{\"applicationProfileId\"";
				String newString = "{\"$type\":\"AuthorizeTransaction,http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Rest\",\"ApplicationProfileId\"";
				requestData = requestData.replace(replaceString, newString);
				replaceString = "\"transaction\":{\"";
				newString = "\"Transaction\":{\"$type\":\"BankcardTransactionPro,http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro\",\"";
				requestData = requestData.replace(replaceString, newString);
				replaceString = "\"transactionData\":{\"";
				newString = "\"TransactionData\":{\"$type\":\"BankcardTransactionDataPro,http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro\",\"";						
			}
		}
		if(obj instanceof AuthorizeAndCaptureTransaction)
		{
			Transaction txn = ((AuthorizeAndCaptureTransaction)obj).getTransaction();
			if(txn instanceof BankcardTransactionPro)
			{
				BankcardTransactionDataPro txnDataPro = (BankcardTransactionDataPro) ((BankcardTransactionPro) txn).getTransactionData();
				Calendar cal = txnDataPro.getLevel2Data().getOrderDate();
				requestData = ReplaceDateInString(requestData, "orderDate", cal);
				String replaceString = "{\"applicationProfileId\"";
				String newString = "{\"$type\":\"AuthorizeAndCaptureTransaction,http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Rest\",\"ApplicationProfileId\"";
				requestData = requestData.replace(replaceString, newString);
				replaceString = "\"transaction\":{\"";
				newString = "\"Transaction\":{\"$type\":\"BankcardTransactionPro,http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro\",\"";
				requestData = requestData.replace(replaceString, newString);
				replaceString = "\"transactionData\":{\"";
				newString = "\"TransactionData\":{\"$type\":\"BankcardTransactionDataPro,http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro\",\"";						
			}
		}
		if(obj instanceof Undo)
		{
			com.ipcommerce.schemas.cws.v2_0.transactions.Undo undo = ((Undo)obj).getUndo();
			
			if(undo instanceof BankcardUndo)
			{
				String replaceString = "{\"applicationProfileId\"";
				String newString = "{\"$type\":\"Undo,http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Rest\",\"ApplicationProfileId\"";
				requestData = requestData.replace(replaceString, newString);
				replaceString = "\"undo\":{";
				newString = "\"DifferenceData\":{\"$type\":\"BankcardUndo,http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard\",";
				requestData = requestData.replace(replaceString, newString);
			}
		}
		if(obj instanceof ReturnById)
		{
			com.ipcommerce.schemas.cws.v2_0.transactions.Return  returnById = ((ReturnById)obj).getReturn();
			
			if(returnById instanceof BankcardReturn)
			{
				String replaceString = "{\"applicationProfileId\"";
				String newString = "{\"$type\":\"ReturnById,http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Rest\",\"ApplicationProfileId\"";
				requestData = requestData.replace(replaceString, newString);
				replaceString = "\"return\":{";
				newString = "\"DifferenceData\":{\"$type\":\"BankcardReturn,http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard\",";
				requestData = requestData.replace(replaceString, newString);
			}
		}
		return requestData;
	}

	private static String ReplaceDateInString(String requestData, String replacementField, Calendar date)
	{
		String sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a").format(date.getTime());
		int valueIndex = requestData.indexOf(replacementField);
		int colonIndex = requestData.indexOf(':', valueIndex);
		int commaIndex = requestData.indexOf(',', colonIndex);
		String replaceString = requestData.substring(colonIndex + 1, commaIndex);
		requestData = requestData.replace(replaceString, "\"" + sdf.toString() + "\"");		
		return requestData;
	}
		
	//@JsonDeserialize(using = CwsDeserializer.class)
	public static <T> T JsonToObject(String json, Object obj)
	{			
		try 
		{
			Class<? extends Object> t = obj.getClass();
			
			// An issue with the PropertyNamingStrategy causes this field to not set correctly.
			json = json.replace("PinDebitUndoSupport", "pinDebitUndoSupport");
			
			ObjectMapper mapper = new ObjectMapper();			
			mapper.setPropertyNamingStrategy(new CwsStrategy());
			SimpleModule cwsModule = BuildCwsSimpleModule();
			
			mapper.registerModule(cwsModule);
			
			return (T) mapper.readValue(json, t);			
		} catch (Exception e) {
			// TODO Regenerate exceptions depending on which is used Jackson or GSon
			System.out.println(e.getMessage());
		} 
		return null;		
	}	
	
	private static SimpleModule BuildCwsSimpleModule()
	{
		SimpleModule cwsModule = new SimpleModule("CwsModule");
		cwsModule.addDeserializer(CloseBatch.class, new CloseBatchDeserializer());
		cwsModule.addDeserializer(PurchaseCardLevel.class, new PurchaseCardLevelDeserializer());
		cwsModule.addDeserializer(PINDebitReturnSupportType.class, new PINDebitReturnSupportTypeDeserializer());
		cwsModule.addDeserializer(CreditAuthorizeSupportType.class, new CreditAuthorizeSupportTypeDeserializer());
		cwsModule.addDeserializer(QueryRejectedSupportType.class, new QueryRejectedSupportTypeDeserializer());
		cwsModule.addDeserializer(PinDebitUndoSupportType.class, new PinDebitUndoSupportTypeDeserializer());
		cwsModule.addDeserializer(BatchAssignmentSupport.class, new BatchAssignmentSupportDeserializer());
		cwsModule.addDeserializer(CreditReturnSupportType.class, new CreditReturnSupportTypeDeserializer());
		cwsModule.addDeserializer(TrackDataSupportType.class, new TrackDataSupportTypeDeserializer());
		cwsModule.addDeserializer(CreditReversalSupportType.class, new CreditReversalSupportTypeDeserializer());
		cwsModule.addDeserializer(PartialApprovalSupportType.class, new PartialApprovalSupportTypeDeserializer());
		cwsModule.addDeserializer(AdviceResponse.class, new AdviceResponseDeserializer());
		cwsModule.addDeserializer(Status.class, new StatusDeserializer());
		cwsModule.addDeserializer(TypeCardType.class, new TypeCardTypeDeserializer());
		cwsModule.addDeserializer(CommercialCardResponse.class, new CommercialCardResponseDeserializer());
		cwsModule.addDeserializer(CVResult.class, new CVResultDeserializer());
		cwsModule.addDeserializer(CaptureState.class, new CaptureStateDeserializer());
		cwsModule.addDeserializer(TransactionState.class, new TransactionStateDeserializer());
		cwsModule.addDeserializer(Resubmit.class, new ResubmitDeserializer());
		cwsModule.addDeserializer(PrepaidCard.class, new PrepaidCardDeserializer());
		
		return cwsModule;
	}
}

//TODO The following classes should be made into a generic at some point - logic is here need to implement. 
class PrepaidCardDeserializer extends JsonDeserializer<PrepaidCard> {
	@Override
	public PrepaidCard deserialize(JsonParser arg0, DeserializationContext arg1)	throws IOException, JsonProcessingException {
		return PrepaidCard.fromValue(GetValues.GetValues(arg1));
	}	
}

class ResubmitDeserializer extends JsonDeserializer<Resubmit> {
	@Override
	public Resubmit deserialize(JsonParser arg0, DeserializationContext arg1)	throws IOException, JsonProcessingException {
		return Resubmit.fromValue(GetValues.GetValues(arg1));
	}	
}

class TransactionStateDeserializer extends JsonDeserializer<TransactionState> {
	@Override
	public TransactionState deserialize(JsonParser arg0, DeserializationContext arg1)	throws IOException, JsonProcessingException {
		return TransactionState.fromValue(GetValues.GetValues(arg1));
	}	
}

class CaptureStateDeserializer extends JsonDeserializer<CaptureState> {
	@Override
	public CaptureState deserialize(JsonParser arg0, DeserializationContext arg1)	throws IOException, JsonProcessingException {
		return CaptureState.fromValue(GetValues.GetValues(arg1));
	}	
}

class CVResultDeserializer extends JsonDeserializer<CVResult> {
	@Override
	public CVResult deserialize(JsonParser arg0, DeserializationContext arg1)	throws IOException, JsonProcessingException {
		return CVResult.fromValue(GetValues.GetValues(arg1));
	}	
}

class TypeCardTypeDeserializer extends JsonDeserializer<TypeCardType> {
	@Override
	public TypeCardType deserialize(JsonParser arg0, DeserializationContext arg1)	throws IOException, JsonProcessingException {
		return TypeCardType.fromValue(GetValues.GetValues(arg1));
	}	
}

class CommercialCardResponseDeserializer extends JsonDeserializer<CommercialCardResponse> {
	@Override
	public CommercialCardResponse deserialize(JsonParser arg0, DeserializationContext arg1)	throws IOException, JsonProcessingException {
		return CommercialCardResponse.fromValue(GetValues.GetValues(arg1));
	}	
}

class StatusDeserializer extends JsonDeserializer<Status> {
	@Override
	public Status deserialize(JsonParser arg0, DeserializationContext arg1)	throws IOException, JsonProcessingException {
		return Status.fromValue(GetValues.GetValues(arg1));
	}	
}

class AdviceResponseDeserializer extends JsonDeserializer<AdviceResponse> {
	@Override
	public AdviceResponse deserialize(JsonParser arg0, DeserializationContext arg1)	throws IOException, JsonProcessingException {
		return AdviceResponse.fromValue(GetValues.GetValues(arg1));
	}	
}

class PartialApprovalSupportTypeDeserializer extends JsonDeserializer<PartialApprovalSupportType> {
	@Override
	public PartialApprovalSupportType deserialize(JsonParser arg0, DeserializationContext arg1)	throws IOException, JsonProcessingException {
		return PartialApprovalSupportType.fromValue(GetValues.GetValues(arg1));
	}	
}

class CreditReversalSupportTypeDeserializer extends JsonDeserializer<CreditReversalSupportType> {
	@Override
	public CreditReversalSupportType deserialize(JsonParser arg0, DeserializationContext arg1)	throws IOException, JsonProcessingException {
		return CreditReversalSupportType.fromValue(GetValues.GetValues(arg1));
	}	
}

class TrackDataSupportTypeDeserializer extends JsonDeserializer<TrackDataSupportType> {
	@Override
	public TrackDataSupportType deserialize(JsonParser arg0, DeserializationContext arg1)	throws IOException, JsonProcessingException {
		return TrackDataSupportType.fromValue(GetValues.GetValues(arg1));
	}	
}

class CreditReturnSupportTypeDeserializer extends JsonDeserializer<CreditReturnSupportType> {
	@Override
	public CreditReturnSupportType deserialize(JsonParser arg0, DeserializationContext arg1)	throws IOException, JsonProcessingException {
		return CreditReturnSupportType.fromValue(GetValues.GetValues(arg1));
	}	
}

class BatchAssignmentSupportDeserializer extends JsonDeserializer<BatchAssignmentSupport> {
	@Override
	public BatchAssignmentSupport deserialize(JsonParser arg0, DeserializationContext arg1)	throws IOException, JsonProcessingException {
		return BatchAssignmentSupport.fromValue(GetValues.GetValues(arg1));
	}	
}

class PinDebitUndoSupportTypeDeserializer extends JsonDeserializer<PinDebitUndoSupportType> {
	@Override
	public PinDebitUndoSupportType deserialize(JsonParser arg0, DeserializationContext arg1)	throws IOException, JsonProcessingException {
		return PinDebitUndoSupportType.fromValue(GetValues.GetValues(arg1));
	}	
}

class QueryRejectedSupportTypeDeserializer extends JsonDeserializer<QueryRejectedSupportType> {
	@Override
	public QueryRejectedSupportType deserialize(JsonParser arg0, DeserializationContext arg1)	throws IOException, JsonProcessingException {
		return QueryRejectedSupportType.fromValue(GetValues.GetValues(arg1));
	}	
}

class PINDebitReturnSupportTypeDeserializer extends JsonDeserializer<PINDebitReturnSupportType> {
	@Override
	public PINDebitReturnSupportType deserialize(JsonParser arg0, DeserializationContext arg1)	throws IOException, JsonProcessingException {
		return PINDebitReturnSupportType.fromValue(GetValues.GetValues(arg1));
	}	
}

class CreditAuthorizeSupportTypeDeserializer extends JsonDeserializer<CreditAuthorizeSupportType> {
	@Override
	public CreditAuthorizeSupportType deserialize(JsonParser arg0, DeserializationContext arg1)	throws IOException, JsonProcessingException {
		return CreditAuthorizeSupportType.fromValue(GetValues.GetValues(arg1));
	}	
}

class PurchaseCardLevelDeserializer extends JsonDeserializer<PurchaseCardLevel> {
	@Override
	public PurchaseCardLevel deserialize(JsonParser arg0, DeserializationContext arg1)	throws IOException, JsonProcessingException {
		return PurchaseCardLevel.fromValue(GetValues.GetValues(arg1));
	}	
}

class CloseBatchDeserializer extends JsonDeserializer<CloseBatch> {
	@Override
	public CloseBatch deserialize(JsonParser arg0, DeserializationContext arg1)	throws IOException, JsonProcessingException {
		return CloseBatch.fromValue(GetValues.GetValues(arg1));
	}	
}

class GetValues {
	public static String GetValues(DeserializationContext context) {
		JsonParser parser = context.getParser();
		String value = null;
		try {
			value = parser.getValueAsString();			
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;		
	}	
}

// Reference: http://www.cowtowncoder.com/blog/archives/2011/03/entry_448.html
// 			  http://programmerbruce.blogspot.com/2011/05/deserialize-json-with-jackson-into.html
class CwsStrategy extends PropertyNamingStrategy
{	
	@Override
	public String nameForField(MapperConfig<?> config, AnnotatedField field, String defaultName)
	{
		return toCwsCase(defaultName);
	}
	
	@Override  
	public String nameForGetterMethod(MapperConfig<?> config, AnnotatedMethod method, String defaultName)  
	{  
		return toCwsCase(defaultName);  
	}  
	  
	@Override  
	public String nameForSetterMethod(MapperConfig<?> config, AnnotatedMethod method, String defaultName)  
	{	//Class<?> type = method.getRawParameterType(0);		
		//if(type.isEnum())		
		
		return toCwsCase(defaultName);  
	}	

	private String toCwsCase(String name) 
	{         
		char c = name.charAt(0);
		
		if(name.equals("avsdata"))
			return "AVSData";
		if(name.equals("avsresult"))
			return "AVSResult";	
		if(name.equals("cvresult"))
			return "CVResult";
		if(name.equals("pinlessDebit"))
			return "PINlessDebit";
		if(name.equals("pinDebitUndoSupport"))
			return "pinDebitUndoSupport";	
		if(name.contains("pin"))
		{
			char c4 = name.charAt(3);			
			return "PIN" + Character.toUpperCase(c4) + name.substring(4);
		}		
		if (!Character.isUpperCase(c)) 
		{             
			return Character.toUpperCase(c) + name.substring(1);         
		}         
		return name;     
	}
}

/* Scratch - 
class CwsDeserializer extends JsonDeserializer<Enum<T>>{

	@Override
	public <T> T deserialize(JsonParser arg0, DeserializationContext arg1)
			throws IOException, JsonProcessingException {
		System.out.println("Inside deserialize");
		JsonParser parser = arg1.getParser();		
		String value = parser.getValueAsString();
		//return CloseBatch.fromValue(value); 
		return null;
	}	
}*/

// Class<?>
/*class CwsDeserializer extends JsonDeserializer<CloseBatch> {

	
	@Override
	public CloseBatch deserialize(JsonParser arg0, DeserializationContext arg1)
			throws IOException, JsonProcessingException {
		System.out.println("Inside deserialize");
		JsonParser parser = arg1.getParser();		
		String value = parser.getValueAsString();
		return CloseBatch.fromValue(value);
	}
	
}*/



