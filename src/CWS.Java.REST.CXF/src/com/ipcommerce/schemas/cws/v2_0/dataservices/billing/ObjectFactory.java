
package com.ipcommerce.schemas.cws.v2_0.dataservices.billing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.ipcommerce.schemas.cws.v2_0.dataservices.DateRange;
import com.ipcommerce.schemas.cws.v2_0.dataservices.PagingParameters;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ipcommerce.schemas.cws.v2_0.dataservices.billing package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BillingEventMetaData_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "BillingEventMetaData");
    private final static QName _BreakdownType_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "BreakdownType");
    private final static QName _QueryBillingEventParameters_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "QueryBillingEventParameters");
    private final static QName _ArrayOfBillingEventSummary_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "ArrayOfBillingEventSummary");
    private final static QName _BillingEventDetail_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "BillingEventDetail");
    private final static QName _ArrayOfBillingEventDetail_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "ArrayOfBillingEventDetail");
    private final static QName _BillingEventSummary_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "BillingEventSummary");
    private final static QName _BillingTransactionFailedFault_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "BillingTransactionFailedFault");
    private final static QName _BillingBaseFault_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "BillingBaseFault");
    private final static QName _QueryBillingEventDetailSessionToken_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "sessionToken");
    private final static QName _QueryBillingEventDetailPagingParameters_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "pagingParameters");
    private final static QName _QueryBillingEventDetailQueryBillingEventParameters_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "queryBillingEventParameters");
    private final static QName _BillingEventMetaDataTransactionId_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "TransactionId");
    private final static QName _BillingEventMetaDataMerchantProfileId_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "MerchantProfileId");
    private final static QName _BillingEventMetaDataSourceName_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "SourceName");
    private final static QName _BillingEventMetaDataWorkflowId_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "WorkflowId");
    private final static QName _BillingEventMetaDataUserName_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "UserName");
    private final static QName _BillingEventMetaDataEventType_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "EventType");
    private final static QName _BillingEventMetaDataServiceKey_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "ServiceKey");
    private final static QName _BillingEventMetaDataSourceId_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "SourceId");
    private final static QName _QueryBillingEventDetailResponseQueryBillingEventDetailResult_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "QueryBillingEventDetailResult");
    private final static QName _QueryBillingEventParametersBillingEventSourceIds_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "BillingEventSourceIds");
    private final static QName _QueryBillingEventParametersMerchantProfileIds_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "MerchantProfileIds");
    private final static QName _QueryBillingEventParametersServiceKeys_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "ServiceKeys");
    private final static QName _QueryBillingEventParametersEventDateRange_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "EventDateRange");
    private final static QName _BillingEventSummaryBreakdown2_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "Breakdown2");
    private final static QName _BillingEventSummaryBreakdown_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "Breakdown");
    private final static QName _BillingEventDetailSerializedBillingData_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "SerializedBillingData");
    private final static QName _QueryBillingEventSummaryResponseQueryBillingEventSummaryResult_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "QueryBillingEventSummaryResult");
    private final static QName _BillingBaseFaultOperation_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "Operation");
    private final static QName _BillingBaseFaultHelpURL_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "HelpURL");
    private final static QName _BillingBaseFaultProblemType_QNAME = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", "ProblemType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ipcommerce.schemas.cws.v2_0.dataservices.billing
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryBillingEventSummaryResponse }
     * 
     */
    public QueryBillingEventSummaryResponse createQueryBillingEventSummaryResponse() {
        return new QueryBillingEventSummaryResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBillingEventSummary }
     * 
     */
    public ArrayOfBillingEventSummary createArrayOfBillingEventSummary() {
        return new ArrayOfBillingEventSummary();
    }

    /**
     * Create an instance of {@link QueryBillingEventDetail }
     * 
     */
    public QueryBillingEventDetail createQueryBillingEventDetail() {
        return new QueryBillingEventDetail();
    }

    /**
     * Create an instance of {@link QueryBillingEventParameters }
     * 
     */
    public QueryBillingEventParameters createQueryBillingEventParameters() {
        return new QueryBillingEventParameters();
    }

    /**
     * Create an instance of {@link BillingTransactionFailedFault }
     * 
     */
    public BillingTransactionFailedFault createBillingTransactionFailedFault() {
        return new BillingTransactionFailedFault();
    }

    /**
     * Create an instance of {@link BillingEventDetail }
     * 
     */
    public BillingEventDetail createBillingEventDetail() {
        return new BillingEventDetail();
    }

    /**
     * Create an instance of {@link ArrayOfBillingEventDetail }
     * 
     */
    public ArrayOfBillingEventDetail createArrayOfBillingEventDetail() {
        return new ArrayOfBillingEventDetail();
    }

    /**
     * Create an instance of {@link BillingBaseFault }
     * 
     */
    public BillingBaseFault createBillingBaseFault() {
        return new BillingBaseFault();
    }

    /**
     * Create an instance of {@link BillingEventMetaData }
     * 
     */
    public BillingEventMetaData createBillingEventMetaData() {
        return new BillingEventMetaData();
    }

    /**
     * Create an instance of {@link QueryBillingEventDetailResponse }
     * 
     */
    public QueryBillingEventDetailResponse createQueryBillingEventDetailResponse() {
        return new QueryBillingEventDetailResponse();
    }

    /**
     * Create an instance of {@link QueryBillingEventSummary }
     * 
     */
    public QueryBillingEventSummary createQueryBillingEventSummary() {
        return new QueryBillingEventSummary();
    }

    /**
     * Create an instance of {@link BillingEventSummary }
     * 
     */
    public BillingEventSummary createBillingEventSummary() {
        return new BillingEventSummary();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingEventMetaData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "BillingEventMetaData")
    public JAXBElement<BillingEventMetaData> createBillingEventMetaData(BillingEventMetaData value) {
        return new JAXBElement<BillingEventMetaData>(_BillingEventMetaData_QNAME, BillingEventMetaData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BreakdownType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "BreakdownType")
    public JAXBElement<BreakdownType> createBreakdownType(BreakdownType value) {
        return new JAXBElement<BreakdownType>(_BreakdownType_QNAME, BreakdownType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryBillingEventParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "QueryBillingEventParameters")
    public JAXBElement<QueryBillingEventParameters> createQueryBillingEventParameters(QueryBillingEventParameters value) {
        return new JAXBElement<QueryBillingEventParameters>(_QueryBillingEventParameters_QNAME, QueryBillingEventParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBillingEventSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "ArrayOfBillingEventSummary")
    public JAXBElement<ArrayOfBillingEventSummary> createArrayOfBillingEventSummary(ArrayOfBillingEventSummary value) {
        return new JAXBElement<ArrayOfBillingEventSummary>(_ArrayOfBillingEventSummary_QNAME, ArrayOfBillingEventSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingEventDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "BillingEventDetail")
    public JAXBElement<BillingEventDetail> createBillingEventDetail(BillingEventDetail value) {
        return new JAXBElement<BillingEventDetail>(_BillingEventDetail_QNAME, BillingEventDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBillingEventDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "ArrayOfBillingEventDetail")
    public JAXBElement<ArrayOfBillingEventDetail> createArrayOfBillingEventDetail(ArrayOfBillingEventDetail value) {
        return new JAXBElement<ArrayOfBillingEventDetail>(_ArrayOfBillingEventDetail_QNAME, ArrayOfBillingEventDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingEventSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "BillingEventSummary")
    public JAXBElement<BillingEventSummary> createBillingEventSummary(BillingEventSummary value) {
        return new JAXBElement<BillingEventSummary>(_BillingEventSummary_QNAME, BillingEventSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingTransactionFailedFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "BillingTransactionFailedFault")
    public JAXBElement<BillingTransactionFailedFault> createBillingTransactionFailedFault(BillingTransactionFailedFault value) {
        return new JAXBElement<BillingTransactionFailedFault>(_BillingTransactionFailedFault_QNAME, BillingTransactionFailedFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingBaseFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "BillingBaseFault")
    public JAXBElement<BillingBaseFault> createBillingBaseFault(BillingBaseFault value) {
        return new JAXBElement<BillingBaseFault>(_BillingBaseFault_QNAME, BillingBaseFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "sessionToken", scope = QueryBillingEventDetail.class)
    public JAXBElement<String> createQueryBillingEventDetailSessionToken(String value) {
        return new JAXBElement<String>(_QueryBillingEventDetailSessionToken_QNAME, String.class, QueryBillingEventDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagingParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "pagingParameters", scope = QueryBillingEventDetail.class)
    public JAXBElement<PagingParameters> createQueryBillingEventDetailPagingParameters(PagingParameters value) {
        return new JAXBElement<PagingParameters>(_QueryBillingEventDetailPagingParameters_QNAME, PagingParameters.class, QueryBillingEventDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryBillingEventParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "queryBillingEventParameters", scope = QueryBillingEventDetail.class)
    public JAXBElement<QueryBillingEventParameters> createQueryBillingEventDetailQueryBillingEventParameters(QueryBillingEventParameters value) {
        return new JAXBElement<QueryBillingEventParameters>(_QueryBillingEventDetailQueryBillingEventParameters_QNAME, QueryBillingEventParameters.class, QueryBillingEventDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "TransactionId", scope = BillingEventMetaData.class)
    public JAXBElement<String> createBillingEventMetaDataTransactionId(String value) {
        return new JAXBElement<String>(_BillingEventMetaDataTransactionId_QNAME, String.class, BillingEventMetaData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "MerchantProfileId", scope = BillingEventMetaData.class)
    public JAXBElement<String> createBillingEventMetaDataMerchantProfileId(String value) {
        return new JAXBElement<String>(_BillingEventMetaDataMerchantProfileId_QNAME, String.class, BillingEventMetaData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "SourceName", scope = BillingEventMetaData.class)
    public JAXBElement<String> createBillingEventMetaDataSourceName(String value) {
        return new JAXBElement<String>(_BillingEventMetaDataSourceName_QNAME, String.class, BillingEventMetaData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "WorkflowId", scope = BillingEventMetaData.class)
    public JAXBElement<String> createBillingEventMetaDataWorkflowId(String value) {
        return new JAXBElement<String>(_BillingEventMetaDataWorkflowId_QNAME, String.class, BillingEventMetaData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "UserName", scope = BillingEventMetaData.class)
    public JAXBElement<String> createBillingEventMetaDataUserName(String value) {
        return new JAXBElement<String>(_BillingEventMetaDataUserName_QNAME, String.class, BillingEventMetaData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "EventType", scope = BillingEventMetaData.class)
    public JAXBElement<String> createBillingEventMetaDataEventType(String value) {
        return new JAXBElement<String>(_BillingEventMetaDataEventType_QNAME, String.class, BillingEventMetaData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "ServiceKey", scope = BillingEventMetaData.class)
    public JAXBElement<String> createBillingEventMetaDataServiceKey(String value) {
        return new JAXBElement<String>(_BillingEventMetaDataServiceKey_QNAME, String.class, BillingEventMetaData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "SourceId", scope = BillingEventMetaData.class)
    public JAXBElement<String> createBillingEventMetaDataSourceId(String value) {
        return new JAXBElement<String>(_BillingEventMetaDataSourceId_QNAME, String.class, BillingEventMetaData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBillingEventDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "QueryBillingEventDetailResult", scope = QueryBillingEventDetailResponse.class)
    public JAXBElement<ArrayOfBillingEventDetail> createQueryBillingEventDetailResponseQueryBillingEventDetailResult(ArrayOfBillingEventDetail value) {
        return new JAXBElement<ArrayOfBillingEventDetail>(_QueryBillingEventDetailResponseQueryBillingEventDetailResult_QNAME, ArrayOfBillingEventDetail.class, QueryBillingEventDetailResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "BillingEventSourceIds", scope = QueryBillingEventParameters.class)
    public JAXBElement<ArrayOfstring> createQueryBillingEventParametersBillingEventSourceIds(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_QueryBillingEventParametersBillingEventSourceIds_QNAME, ArrayOfstring.class, QueryBillingEventParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "MerchantProfileIds", scope = QueryBillingEventParameters.class)
    public JAXBElement<ArrayOfstring> createQueryBillingEventParametersMerchantProfileIds(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_QueryBillingEventParametersMerchantProfileIds_QNAME, ArrayOfstring.class, QueryBillingEventParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "ServiceKeys", scope = QueryBillingEventParameters.class)
    public JAXBElement<ArrayOfstring> createQueryBillingEventParametersServiceKeys(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_QueryBillingEventParametersServiceKeys_QNAME, ArrayOfstring.class, QueryBillingEventParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "EventDateRange", scope = QueryBillingEventParameters.class)
    public JAXBElement<DateRange> createQueryBillingEventParametersEventDateRange(DateRange value) {
        return new JAXBElement<DateRange>(_QueryBillingEventParametersEventDateRange_QNAME, DateRange.class, QueryBillingEventParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "sessionToken", scope = QueryBillingEventSummary.class)
    public JAXBElement<String> createQueryBillingEventSummarySessionToken(String value) {
        return new JAXBElement<String>(_QueryBillingEventDetailSessionToken_QNAME, String.class, QueryBillingEventSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagingParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "pagingParameters", scope = QueryBillingEventSummary.class)
    public JAXBElement<PagingParameters> createQueryBillingEventSummaryPagingParameters(PagingParameters value) {
        return new JAXBElement<PagingParameters>(_QueryBillingEventDetailPagingParameters_QNAME, PagingParameters.class, QueryBillingEventSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryBillingEventParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "queryBillingEventParameters", scope = QueryBillingEventSummary.class)
    public JAXBElement<QueryBillingEventParameters> createQueryBillingEventSummaryQueryBillingEventParameters(QueryBillingEventParameters value) {
        return new JAXBElement<QueryBillingEventParameters>(_QueryBillingEventDetailQueryBillingEventParameters_QNAME, QueryBillingEventParameters.class, QueryBillingEventSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "SourceName", scope = BillingEventSummary.class)
    public JAXBElement<String> createBillingEventSummarySourceName(String value) {
        return new JAXBElement<String>(_BillingEventMetaDataSourceName_QNAME, String.class, BillingEventSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "Breakdown2", scope = BillingEventSummary.class)
    public JAXBElement<String> createBillingEventSummaryBreakdown2(String value) {
        return new JAXBElement<String>(_BillingEventSummaryBreakdown2_QNAME, String.class, BillingEventSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "Breakdown", scope = BillingEventSummary.class)
    public JAXBElement<String> createBillingEventSummaryBreakdown(String value) {
        return new JAXBElement<String>(_BillingEventSummaryBreakdown_QNAME, String.class, BillingEventSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "SourceId", scope = BillingEventSummary.class)
    public JAXBElement<String> createBillingEventSummarySourceId(String value) {
        return new JAXBElement<String>(_BillingEventMetaDataSourceId_QNAME, String.class, BillingEventSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "SerializedBillingData", scope = BillingEventDetail.class)
    public JAXBElement<String> createBillingEventDetailSerializedBillingData(String value) {
        return new JAXBElement<String>(_BillingEventDetailSerializedBillingData_QNAME, String.class, BillingEventDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingEventMetaData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "BillingEventMetaData", scope = BillingEventDetail.class)
    public JAXBElement<BillingEventMetaData> createBillingEventDetailBillingEventMetaData(BillingEventMetaData value) {
        return new JAXBElement<BillingEventMetaData>(_BillingEventMetaData_QNAME, BillingEventMetaData.class, BillingEventDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBillingEventSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "QueryBillingEventSummaryResult", scope = QueryBillingEventSummaryResponse.class)
    public JAXBElement<ArrayOfBillingEventSummary> createQueryBillingEventSummaryResponseQueryBillingEventSummaryResult(ArrayOfBillingEventSummary value) {
        return new JAXBElement<ArrayOfBillingEventSummary>(_QueryBillingEventSummaryResponseQueryBillingEventSummaryResult_QNAME, ArrayOfBillingEventSummary.class, QueryBillingEventSummaryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "Operation", scope = BillingBaseFault.class)
    public JAXBElement<String> createBillingBaseFaultOperation(String value) {
        return new JAXBElement<String>(_BillingBaseFaultOperation_QNAME, String.class, BillingBaseFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "HelpURL", scope = BillingBaseFault.class)
    public JAXBElement<String> createBillingBaseFaultHelpURL(String value) {
        return new JAXBElement<String>(_BillingBaseFaultHelpURL_QNAME, String.class, BillingBaseFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", name = "ProblemType", scope = BillingBaseFault.class)
    public JAXBElement<String> createBillingBaseFaultProblemType(String value) {
        return new JAXBElement<String>(_BillingBaseFaultProblemType_QNAME, String.class, BillingBaseFault.class, value);
    }

}
