
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:02:10.433-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "AuthorizationFault", targetNamespace = "http://schemas.ipcommerce.com/Identity/1.0/")
public class ICWSServiceInformationRenewAuthorizationFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.identity._1.AuthorizationFault authorizationFault;

    public ICWSServiceInformationRenewAuthorizationFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationRenewAuthorizationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationRenewAuthorizationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationRenewAuthorizationFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.AuthorizationFault authorizationFault) {
        super(message);
        this.authorizationFault = authorizationFault;
    }

    public ICWSServiceInformationRenewAuthorizationFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.AuthorizationFault authorizationFault, Throwable cause) {
        super(message, cause);
        this.authorizationFault = authorizationFault;
    }

    public com.ipcommerce.schemas.identity._1.AuthorizationFault getFaultInfo() {
        return this.authorizationFault;
    }
}
