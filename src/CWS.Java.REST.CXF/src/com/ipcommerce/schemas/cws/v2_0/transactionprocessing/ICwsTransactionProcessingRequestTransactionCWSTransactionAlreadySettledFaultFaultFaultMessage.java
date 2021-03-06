
package com.ipcommerce.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:03:54.472-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "CWSTransactionAlreadySettledFault", targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingRequestTransactionCWSTransactionAlreadySettledFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSTransactionAlreadySettledFault cwsTransactionAlreadySettledFault;

    public ICwsTransactionProcessingRequestTransactionCWSTransactionAlreadySettledFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingRequestTransactionCWSTransactionAlreadySettledFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingRequestTransactionCWSTransactionAlreadySettledFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingRequestTransactionCWSTransactionAlreadySettledFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSTransactionAlreadySettledFault cwsTransactionAlreadySettledFault) {
        super(message);
        this.cwsTransactionAlreadySettledFault = cwsTransactionAlreadySettledFault;
    }

    public ICwsTransactionProcessingRequestTransactionCWSTransactionAlreadySettledFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSTransactionAlreadySettledFault cwsTransactionAlreadySettledFault, Throwable cause) {
        super(message, cause);
        this.cwsTransactionAlreadySettledFault = cwsTransactionAlreadySettledFault;
    }

    public com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSTransactionAlreadySettledFault getFaultInfo() {
        return this.cwsTransactionAlreadySettledFault;
    }
}
