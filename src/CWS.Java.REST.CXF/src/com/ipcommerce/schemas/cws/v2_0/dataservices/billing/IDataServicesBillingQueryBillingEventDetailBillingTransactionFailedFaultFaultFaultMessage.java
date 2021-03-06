
package com.ipcommerce.schemas.cws.v2_0.dataservices.billing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T13:53:38.241-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "BillingTransactionFailedFault", targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing")
public class IDataServicesBillingQueryBillingEventDetailBillingTransactionFailedFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.cws.v2_0.dataservices.billing.BillingTransactionFailedFault billingTransactionFailedFault;

    public IDataServicesBillingQueryBillingEventDetailBillingTransactionFailedFaultFaultFaultMessage() {
        super();
    }
    
    public IDataServicesBillingQueryBillingEventDetailBillingTransactionFailedFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IDataServicesBillingQueryBillingEventDetailBillingTransactionFailedFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IDataServicesBillingQueryBillingEventDetailBillingTransactionFailedFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.dataservices.billing.BillingTransactionFailedFault billingTransactionFailedFault) {
        super(message);
        this.billingTransactionFailedFault = billingTransactionFailedFault;
    }

    public IDataServicesBillingQueryBillingEventDetailBillingTransactionFailedFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.dataservices.billing.BillingTransactionFailedFault billingTransactionFailedFault, Throwable cause) {
        super(message, cause);
        this.billingTransactionFailedFault = billingTransactionFailedFault;
    }

    public com.ipcommerce.schemas.cws.v2_0.dataservices.billing.BillingTransactionFailedFault getFaultInfo() {
        return this.billingTransactionFailedFault;
    }
}
