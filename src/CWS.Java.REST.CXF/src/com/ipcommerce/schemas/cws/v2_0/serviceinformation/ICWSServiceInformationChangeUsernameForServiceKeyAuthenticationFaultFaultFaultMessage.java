
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:02:10.500-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "AuthenticationFault", targetNamespace = "http://schemas.ipcommerce.com/Identity/1.0/")
public class ICWSServiceInformationChangeUsernameForServiceKeyAuthenticationFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.identity._1.AuthenticationFault authenticationFault;

    public ICWSServiceInformationChangeUsernameForServiceKeyAuthenticationFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationChangeUsernameForServiceKeyAuthenticationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationChangeUsernameForServiceKeyAuthenticationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationChangeUsernameForServiceKeyAuthenticationFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.AuthenticationFault authenticationFault) {
        super(message);
        this.authenticationFault = authenticationFault;
    }

    public ICWSServiceInformationChangeUsernameForServiceKeyAuthenticationFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.AuthenticationFault authenticationFault, Throwable cause) {
        super(message, cause);
        this.authenticationFault = authenticationFault;
    }

    public com.ipcommerce.schemas.identity._1.AuthenticationFault getFaultInfo() {
        return this.authenticationFault;
    }
}
