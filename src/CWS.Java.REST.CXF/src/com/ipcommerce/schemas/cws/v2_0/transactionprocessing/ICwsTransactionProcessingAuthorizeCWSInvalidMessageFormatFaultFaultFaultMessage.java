
package com.ipcommerce.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:03:54.903-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "CWSInvalidMessageFormatFault", targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingAuthorizeCWSInvalidMessageFormatFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSInvalidMessageFormatFault cwsInvalidMessageFormatFault;

    public ICwsTransactionProcessingAuthorizeCWSInvalidMessageFormatFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingAuthorizeCWSInvalidMessageFormatFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingAuthorizeCWSInvalidMessageFormatFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingAuthorizeCWSInvalidMessageFormatFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSInvalidMessageFormatFault cwsInvalidMessageFormatFault) {
        super(message);
        this.cwsInvalidMessageFormatFault = cwsInvalidMessageFormatFault;
    }

    public ICwsTransactionProcessingAuthorizeCWSInvalidMessageFormatFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSInvalidMessageFormatFault cwsInvalidMessageFormatFault, Throwable cause) {
        super(message, cause);
        this.cwsInvalidMessageFormatFault = cwsInvalidMessageFormatFault;
    }

    public com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSInvalidMessageFormatFault getFaultInfo() {
        return this.cwsInvalidMessageFormatFault;
    }
}
