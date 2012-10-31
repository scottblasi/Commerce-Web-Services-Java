
package com.ipcommerce.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:03:52.611-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "CWSConnectionFault", targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingManageAccountByIdCWSConnectionFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSConnectionFault cwsConnectionFault;

    public ICwsTransactionProcessingManageAccountByIdCWSConnectionFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingManageAccountByIdCWSConnectionFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingManageAccountByIdCWSConnectionFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingManageAccountByIdCWSConnectionFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSConnectionFault cwsConnectionFault) {
        super(message);
        this.cwsConnectionFault = cwsConnectionFault;
    }

    public ICwsTransactionProcessingManageAccountByIdCWSConnectionFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSConnectionFault cwsConnectionFault, Throwable cause) {
        super(message, cause);
        this.cwsConnectionFault = cwsConnectionFault;
    }

    public com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSConnectionFault getFaultInfo() {
        return this.cwsConnectionFault;
    }
}
