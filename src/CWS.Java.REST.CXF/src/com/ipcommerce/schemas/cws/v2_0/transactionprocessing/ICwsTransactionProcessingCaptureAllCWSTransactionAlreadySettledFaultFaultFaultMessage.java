
package com.ipcommerce.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:03:55.464-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "CWSTransactionAlreadySettledFault", targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingCaptureAllCWSTransactionAlreadySettledFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSTransactionAlreadySettledFault cwsTransactionAlreadySettledFault;

    public ICwsTransactionProcessingCaptureAllCWSTransactionAlreadySettledFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingCaptureAllCWSTransactionAlreadySettledFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingCaptureAllCWSTransactionAlreadySettledFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingCaptureAllCWSTransactionAlreadySettledFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSTransactionAlreadySettledFault cwsTransactionAlreadySettledFault) {
        super(message);
        this.cwsTransactionAlreadySettledFault = cwsTransactionAlreadySettledFault;
    }

    public ICwsTransactionProcessingCaptureAllCWSTransactionAlreadySettledFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSTransactionAlreadySettledFault cwsTransactionAlreadySettledFault, Throwable cause) {
        super(message, cause);
        this.cwsTransactionAlreadySettledFault = cwsTransactionAlreadySettledFault;
    }

    public com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSTransactionAlreadySettledFault getFaultInfo() {
        return this.cwsTransactionAlreadySettledFault;
    }
}
