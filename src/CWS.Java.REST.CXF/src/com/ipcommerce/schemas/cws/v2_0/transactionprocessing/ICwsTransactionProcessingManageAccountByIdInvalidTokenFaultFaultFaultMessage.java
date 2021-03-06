
package com.ipcommerce.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:03:52.662-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "InvalidTokenFault", targetNamespace = "http://schemas.ipcommerce.com/Identity/1.0/")
public class ICwsTransactionProcessingManageAccountByIdInvalidTokenFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.identity._1.InvalidTokenFault invalidTokenFault;

    public ICwsTransactionProcessingManageAccountByIdInvalidTokenFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingManageAccountByIdInvalidTokenFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingManageAccountByIdInvalidTokenFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingManageAccountByIdInvalidTokenFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.InvalidTokenFault invalidTokenFault) {
        super(message);
        this.invalidTokenFault = invalidTokenFault;
    }

    public ICwsTransactionProcessingManageAccountByIdInvalidTokenFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.InvalidTokenFault invalidTokenFault, Throwable cause) {
        super(message, cause);
        this.invalidTokenFault = invalidTokenFault;
    }

    public com.ipcommerce.schemas.identity._1.InvalidTokenFault getFaultInfo() {
        return this.invalidTokenFault;
    }
}
