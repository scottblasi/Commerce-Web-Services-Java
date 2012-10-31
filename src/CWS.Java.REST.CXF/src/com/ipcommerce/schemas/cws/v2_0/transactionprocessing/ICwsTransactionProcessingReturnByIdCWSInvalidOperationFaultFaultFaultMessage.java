
package com.ipcommerce.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:03:54.217-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "CWSInvalidOperationFault", targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingReturnByIdCWSInvalidOperationFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSInvalidOperationFault cwsInvalidOperationFault;

    public ICwsTransactionProcessingReturnByIdCWSInvalidOperationFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingReturnByIdCWSInvalidOperationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingReturnByIdCWSInvalidOperationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingReturnByIdCWSInvalidOperationFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSInvalidOperationFault cwsInvalidOperationFault) {
        super(message);
        this.cwsInvalidOperationFault = cwsInvalidOperationFault;
    }

    public ICwsTransactionProcessingReturnByIdCWSInvalidOperationFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSInvalidOperationFault cwsInvalidOperationFault, Throwable cause) {
        super(message, cause);
        this.cwsInvalidOperationFault = cwsInvalidOperationFault;
    }

    public com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSInvalidOperationFault getFaultInfo() {
        return this.cwsInvalidOperationFault;
    }
}
