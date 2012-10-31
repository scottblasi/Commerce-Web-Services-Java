
package com.ipcommerce.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:03:54.232-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "CWSDeserializationFault", targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingReturnByIdCWSDeserializationFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSDeserializationFault cwsDeserializationFault;

    public ICwsTransactionProcessingReturnByIdCWSDeserializationFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingReturnByIdCWSDeserializationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingReturnByIdCWSDeserializationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingReturnByIdCWSDeserializationFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSDeserializationFault cwsDeserializationFault) {
        super(message);
        this.cwsDeserializationFault = cwsDeserializationFault;
    }

    public ICwsTransactionProcessingReturnByIdCWSDeserializationFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSDeserializationFault cwsDeserializationFault, Throwable cause) {
        super(message, cause);
        this.cwsDeserializationFault = cwsDeserializationFault;
    }

    public com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSDeserializationFault getFaultInfo() {
        return this.cwsDeserializationFault;
    }
}
