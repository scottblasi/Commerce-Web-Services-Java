
package com.ipcommerce.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:03:54.646-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "CWSValidationResultFault", targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingCaptureSelectiveCWSValidationResultFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSValidationResultFault cwsValidationResultFault;

    public ICwsTransactionProcessingCaptureSelectiveCWSValidationResultFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingCaptureSelectiveCWSValidationResultFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingCaptureSelectiveCWSValidationResultFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingCaptureSelectiveCWSValidationResultFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSValidationResultFault cwsValidationResultFault) {
        super(message);
        this.cwsValidationResultFault = cwsValidationResultFault;
    }

    public ICwsTransactionProcessingCaptureSelectiveCWSValidationResultFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSValidationResultFault cwsValidationResultFault, Throwable cause) {
        super(message, cause);
        this.cwsValidationResultFault = cwsValidationResultFault;
    }

    public com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSValidationResultFault getFaultInfo() {
        return this.cwsValidationResultFault;
    }
}
