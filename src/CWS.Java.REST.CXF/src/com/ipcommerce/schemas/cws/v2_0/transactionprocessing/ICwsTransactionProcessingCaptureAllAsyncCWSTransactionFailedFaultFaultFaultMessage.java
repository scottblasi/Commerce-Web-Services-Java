
package com.ipcommerce.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:03:54.147-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "CWSTransactionFailedFault", targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingCaptureAllAsyncCWSTransactionFailedFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSTransactionFailedFault cwsTransactionFailedFault;

    public ICwsTransactionProcessingCaptureAllAsyncCWSTransactionFailedFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingCaptureAllAsyncCWSTransactionFailedFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingCaptureAllAsyncCWSTransactionFailedFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingCaptureAllAsyncCWSTransactionFailedFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSTransactionFailedFault cwsTransactionFailedFault) {
        super(message);
        this.cwsTransactionFailedFault = cwsTransactionFailedFault;
    }

    public ICwsTransactionProcessingCaptureAllAsyncCWSTransactionFailedFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSTransactionFailedFault cwsTransactionFailedFault, Throwable cause) {
        super(message, cause);
        this.cwsTransactionFailedFault = cwsTransactionFailedFault;
    }

    public com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSTransactionFailedFault getFaultInfo() {
        return this.cwsTransactionFailedFault;
    }
}