
package com.ipcommerce.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:03:52.795-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "CWSInvalidServiceInformationFault", targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingCaptureCWSInvalidServiceInformationFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSInvalidServiceInformationFault cwsInvalidServiceInformationFault;

    public ICwsTransactionProcessingCaptureCWSInvalidServiceInformationFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingCaptureCWSInvalidServiceInformationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingCaptureCWSInvalidServiceInformationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingCaptureCWSInvalidServiceInformationFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSInvalidServiceInformationFault cwsInvalidServiceInformationFault) {
        super(message);
        this.cwsInvalidServiceInformationFault = cwsInvalidServiceInformationFault;
    }

    public ICwsTransactionProcessingCaptureCWSInvalidServiceInformationFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSInvalidServiceInformationFault cwsInvalidServiceInformationFault, Throwable cause) {
        super(message, cause);
        this.cwsInvalidServiceInformationFault = cwsInvalidServiceInformationFault;
    }

    public com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSInvalidServiceInformationFault getFaultInfo() {
        return this.cwsInvalidServiceInformationFault;
    }
}
