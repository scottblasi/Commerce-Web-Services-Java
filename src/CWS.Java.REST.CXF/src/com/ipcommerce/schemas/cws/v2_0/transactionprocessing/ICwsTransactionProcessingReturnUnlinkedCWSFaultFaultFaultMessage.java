
package com.ipcommerce.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:03:53.389-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "CWSFault", targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingReturnUnlinkedCWSFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSFault cwsFault;

    public ICwsTransactionProcessingReturnUnlinkedCWSFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingReturnUnlinkedCWSFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingReturnUnlinkedCWSFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingReturnUnlinkedCWSFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSFault cwsFault) {
        super(message);
        this.cwsFault = cwsFault;
    }

    public ICwsTransactionProcessingReturnUnlinkedCWSFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSFault cwsFault, Throwable cause) {
        super(message, cause);
        this.cwsFault = cwsFault;
    }

    public com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSFault getFaultInfo() {
        return this.cwsFault;
    }
}
