
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:02:09.839-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "ExpiredTokenFault", targetNamespace = "http://schemas.ipcommerce.com/Identity/1.0/")
public class ICWSServiceInformationFederatedSignOnExpiredTokenFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.identity._1.ExpiredTokenFault expiredTokenFault;

    public ICWSServiceInformationFederatedSignOnExpiredTokenFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationFederatedSignOnExpiredTokenFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationFederatedSignOnExpiredTokenFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationFederatedSignOnExpiredTokenFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.ExpiredTokenFault expiredTokenFault) {
        super(message);
        this.expiredTokenFault = expiredTokenFault;
    }

    public ICWSServiceInformationFederatedSignOnExpiredTokenFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.ExpiredTokenFault expiredTokenFault, Throwable cause) {
        super(message, cause);
        this.expiredTokenFault = expiredTokenFault;
    }

    public com.ipcommerce.schemas.identity._1.ExpiredTokenFault getFaultInfo() {
        return this.expiredTokenFault;
    }
}