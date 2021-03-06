
package com.ipcommerce.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:03:54.492-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "CWSTransactionFailedFault", targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingRequestTransactionCWSTransactionFailedFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSTransactionFailedFault cwsTransactionFailedFault;

    public ICwsTransactionProcessingRequestTransactionCWSTransactionFailedFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingRequestTransactionCWSTransactionFailedFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingRequestTransactionCWSTransactionFailedFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingRequestTransactionCWSTransactionFailedFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSTransactionFailedFault cwsTransactionFailedFault) {
        super(message);
        this.cwsTransactionFailedFault = cwsTransactionFailedFault;
    }

    public ICwsTransactionProcessingRequestTransactionCWSTransactionFailedFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSTransactionFailedFault cwsTransactionFailedFault, Throwable cause) {
        super(message, cause);
        this.cwsTransactionFailedFault = cwsTransactionFailedFault;
    }

    public com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSTransactionFailedFault getFaultInfo() {
        return this.cwsTransactionFailedFault;
    }
}
