
package com.ipcommerce.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:03:53.909-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "CWSConnectionFault", targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingAdjustCWSConnectionFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSConnectionFault cwsConnectionFault;

    public ICwsTransactionProcessingAdjustCWSConnectionFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingAdjustCWSConnectionFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingAdjustCWSConnectionFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingAdjustCWSConnectionFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSConnectionFault cwsConnectionFault) {
        super(message);
        this.cwsConnectionFault = cwsConnectionFault;
    }

    public ICwsTransactionProcessingAdjustCWSConnectionFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSConnectionFault cwsConnectionFault, Throwable cause) {
        super(message, cause);
        this.cwsConnectionFault = cwsConnectionFault;
    }

    public com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSConnectionFault getFaultInfo() {
        return this.cwsConnectionFault;
    }
}
