
package com.ipcommerce.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:03:53.379-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "CWSInvalidServiceInformationFault", targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingReturnUnlinkedCWSInvalidServiceInformationFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSInvalidServiceInformationFault cwsInvalidServiceInformationFault;

    public ICwsTransactionProcessingReturnUnlinkedCWSInvalidServiceInformationFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingReturnUnlinkedCWSInvalidServiceInformationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingReturnUnlinkedCWSInvalidServiceInformationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingReturnUnlinkedCWSInvalidServiceInformationFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSInvalidServiceInformationFault cwsInvalidServiceInformationFault) {
        super(message);
        this.cwsInvalidServiceInformationFault = cwsInvalidServiceInformationFault;
    }

    public ICwsTransactionProcessingReturnUnlinkedCWSInvalidServiceInformationFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSInvalidServiceInformationFault cwsInvalidServiceInformationFault, Throwable cause) {
        super(message, cause);
        this.cwsInvalidServiceInformationFault = cwsInvalidServiceInformationFault;
    }

    public com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSInvalidServiceInformationFault getFaultInfo() {
        return this.cwsInvalidServiceInformationFault;
    }
}
