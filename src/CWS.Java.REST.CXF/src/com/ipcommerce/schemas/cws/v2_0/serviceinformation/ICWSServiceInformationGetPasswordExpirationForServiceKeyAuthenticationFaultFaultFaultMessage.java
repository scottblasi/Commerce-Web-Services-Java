
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:02:09.848-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "AuthenticationFault", targetNamespace = "http://schemas.ipcommerce.com/Identity/1.0/")
public class ICWSServiceInformationGetPasswordExpirationForServiceKeyAuthenticationFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.identity._1.AuthenticationFault authenticationFault;

    public ICWSServiceInformationGetPasswordExpirationForServiceKeyAuthenticationFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationGetPasswordExpirationForServiceKeyAuthenticationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationGetPasswordExpirationForServiceKeyAuthenticationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationGetPasswordExpirationForServiceKeyAuthenticationFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.AuthenticationFault authenticationFault) {
        super(message);
        this.authenticationFault = authenticationFault;
    }

    public ICWSServiceInformationGetPasswordExpirationForServiceKeyAuthenticationFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.AuthenticationFault authenticationFault, Throwable cause) {
        super(message, cause);
        this.authenticationFault = authenticationFault;
    }

    public com.ipcommerce.schemas.identity._1.AuthenticationFault getFaultInfo() {
        return this.authenticationFault;
    }
}
