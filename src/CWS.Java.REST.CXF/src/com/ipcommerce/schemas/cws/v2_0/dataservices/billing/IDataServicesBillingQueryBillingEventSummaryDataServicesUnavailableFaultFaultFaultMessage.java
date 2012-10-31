
package com.ipcommerce.schemas.cws.v2_0.dataservices.billing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T13:53:38.186-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "DataServicesUnavailableFault", targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices")
public class IDataServicesBillingQueryBillingEventSummaryDataServicesUnavailableFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.cws.v2_0.dataservices.DataServicesUnavailableFault dataServicesUnavailableFault;

    public IDataServicesBillingQueryBillingEventSummaryDataServicesUnavailableFaultFaultFaultMessage() {
        super();
    }
    
    public IDataServicesBillingQueryBillingEventSummaryDataServicesUnavailableFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IDataServicesBillingQueryBillingEventSummaryDataServicesUnavailableFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IDataServicesBillingQueryBillingEventSummaryDataServicesUnavailableFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.dataservices.DataServicesUnavailableFault dataServicesUnavailableFault) {
        super(message);
        this.dataServicesUnavailableFault = dataServicesUnavailableFault;
    }

    public IDataServicesBillingQueryBillingEventSummaryDataServicesUnavailableFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.dataservices.DataServicesUnavailableFault dataServicesUnavailableFault, Throwable cause) {
        super(message, cause);
        this.dataServicesUnavailableFault = dataServicesUnavailableFault;
    }

    public com.ipcommerce.schemas.cws.v2_0.dataservices.DataServicesUnavailableFault getFaultInfo() {
        return this.dataServicesUnavailableFault;
    }
}