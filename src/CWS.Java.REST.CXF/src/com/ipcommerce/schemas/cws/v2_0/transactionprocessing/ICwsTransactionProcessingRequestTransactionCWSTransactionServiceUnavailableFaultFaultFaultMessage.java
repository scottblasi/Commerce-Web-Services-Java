
package com.ipcommerce.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:03:54.390-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "CWSTransactionServiceUnavailableFault", targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingRequestTransactionCWSTransactionServiceUnavailableFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSTransactionServiceUnavailableFault cwsTransactionServiceUnavailableFault;

    public ICwsTransactionProcessingRequestTransactionCWSTransactionServiceUnavailableFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingRequestTransactionCWSTransactionServiceUnavailableFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingRequestTransactionCWSTransactionServiceUnavailableFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingRequestTransactionCWSTransactionServiceUnavailableFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSTransactionServiceUnavailableFault cwsTransactionServiceUnavailableFault) {
        super(message);
        this.cwsTransactionServiceUnavailableFault = cwsTransactionServiceUnavailableFault;
    }

    public ICwsTransactionProcessingRequestTransactionCWSTransactionServiceUnavailableFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSTransactionServiceUnavailableFault cwsTransactionServiceUnavailableFault, Throwable cause) {
        super(message, cause);
        this.cwsTransactionServiceUnavailableFault = cwsTransactionServiceUnavailableFault;
    }

    public com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSTransactionServiceUnavailableFault getFaultInfo() {
        return this.cwsTransactionServiceUnavailableFault;
    }
}
