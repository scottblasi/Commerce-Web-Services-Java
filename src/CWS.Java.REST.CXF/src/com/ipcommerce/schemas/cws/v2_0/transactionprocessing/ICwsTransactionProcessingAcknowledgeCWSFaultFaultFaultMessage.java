
package com.ipcommerce.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:03:55.078-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "CWSFault", targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingAcknowledgeCWSFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSFault cwsFault;

    public ICwsTransactionProcessingAcknowledgeCWSFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingAcknowledgeCWSFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingAcknowledgeCWSFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingAcknowledgeCWSFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSFault cwsFault) {
        super(message);
        this.cwsFault = cwsFault;
    }

    public ICwsTransactionProcessingAcknowledgeCWSFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSFault cwsFault, Throwable cause) {
        super(message, cause);
        this.cwsFault = cwsFault;
    }

    public com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSFault getFaultInfo() {
        return this.cwsFault;
    }
}
