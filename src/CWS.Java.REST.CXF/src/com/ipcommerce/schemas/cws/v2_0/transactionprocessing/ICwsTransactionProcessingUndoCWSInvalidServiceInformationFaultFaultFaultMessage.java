
package com.ipcommerce.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:03:55.250-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "CWSInvalidServiceInformationFault", targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingUndoCWSInvalidServiceInformationFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSInvalidServiceInformationFault cwsInvalidServiceInformationFault;

    public ICwsTransactionProcessingUndoCWSInvalidServiceInformationFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingUndoCWSInvalidServiceInformationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingUndoCWSInvalidServiceInformationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingUndoCWSInvalidServiceInformationFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSInvalidServiceInformationFault cwsInvalidServiceInformationFault) {
        super(message);
        this.cwsInvalidServiceInformationFault = cwsInvalidServiceInformationFault;
    }

    public ICwsTransactionProcessingUndoCWSInvalidServiceInformationFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSInvalidServiceInformationFault cwsInvalidServiceInformationFault, Throwable cause) {
        super(message, cause);
        this.cwsInvalidServiceInformationFault = cwsInvalidServiceInformationFault;
    }

    public com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSInvalidServiceInformationFault getFaultInfo() {
        return this.cwsInvalidServiceInformationFault;
    }
}
