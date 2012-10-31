
package com.ipcommerce.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:03:54.305-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "CWSExtendedDataNotSupportedFault", targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingReturnByIdCWSExtendedDataNotSupportedFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSExtendedDataNotSupportedFault cwsExtendedDataNotSupportedFault;

    public ICwsTransactionProcessingReturnByIdCWSExtendedDataNotSupportedFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingReturnByIdCWSExtendedDataNotSupportedFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingReturnByIdCWSExtendedDataNotSupportedFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingReturnByIdCWSExtendedDataNotSupportedFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSExtendedDataNotSupportedFault cwsExtendedDataNotSupportedFault) {
        super(message);
        this.cwsExtendedDataNotSupportedFault = cwsExtendedDataNotSupportedFault;
    }

    public ICwsTransactionProcessingReturnByIdCWSExtendedDataNotSupportedFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSExtendedDataNotSupportedFault cwsExtendedDataNotSupportedFault, Throwable cause) {
        super(message, cause);
        this.cwsExtendedDataNotSupportedFault = cwsExtendedDataNotSupportedFault;
    }

    public com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSExtendedDataNotSupportedFault getFaultInfo() {
        return this.cwsExtendedDataNotSupportedFault;
    }
}
