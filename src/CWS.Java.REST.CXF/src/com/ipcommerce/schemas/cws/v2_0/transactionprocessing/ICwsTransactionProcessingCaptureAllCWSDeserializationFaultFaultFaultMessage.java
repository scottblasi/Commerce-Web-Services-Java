
package com.ipcommerce.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:03:55.418-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "CWSDeserializationFault", targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingCaptureAllCWSDeserializationFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSDeserializationFault cwsDeserializationFault;

    public ICwsTransactionProcessingCaptureAllCWSDeserializationFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingCaptureAllCWSDeserializationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingCaptureAllCWSDeserializationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingCaptureAllCWSDeserializationFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSDeserializationFault cwsDeserializationFault) {
        super(message);
        this.cwsDeserializationFault = cwsDeserializationFault;
    }

    public ICwsTransactionProcessingCaptureAllCWSDeserializationFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSDeserializationFault cwsDeserializationFault, Throwable cause) {
        super(message, cause);
        this.cwsDeserializationFault = cwsDeserializationFault;
    }

    public com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSDeserializationFault getFaultInfo() {
        return this.cwsDeserializationFault;
    }
}
