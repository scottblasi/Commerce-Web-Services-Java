
package com.ipcommerce.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:03:52.743-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "CWSTransactionFailedFault", targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingManageAccountByIdCWSTransactionFailedFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSTransactionFailedFault cwsTransactionFailedFault;

    public ICwsTransactionProcessingManageAccountByIdCWSTransactionFailedFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingManageAccountByIdCWSTransactionFailedFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingManageAccountByIdCWSTransactionFailedFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingManageAccountByIdCWSTransactionFailedFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSTransactionFailedFault cwsTransactionFailedFault) {
        super(message);
        this.cwsTransactionFailedFault = cwsTransactionFailedFault;
    }

    public ICwsTransactionProcessingManageAccountByIdCWSTransactionFailedFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSTransactionFailedFault cwsTransactionFailedFault, Throwable cause) {
        super(message, cause);
        this.cwsTransactionFailedFault = cwsTransactionFailedFault;
    }

    public com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSTransactionFailedFault getFaultInfo() {
        return this.cwsTransactionFailedFault;
    }
}
