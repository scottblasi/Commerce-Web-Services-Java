
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:02:09.982-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "AuthenticationFault", targetNamespace = "http://schemas.ipcommerce.com/Identity/1.0/")
public class ICWSServiceInformationGetClaimsAuthenticationFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.identity._1.AuthenticationFault authenticationFault;

    public ICWSServiceInformationGetClaimsAuthenticationFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationGetClaimsAuthenticationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationGetClaimsAuthenticationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationGetClaimsAuthenticationFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.AuthenticationFault authenticationFault) {
        super(message);
        this.authenticationFault = authenticationFault;
    }

    public ICWSServiceInformationGetClaimsAuthenticationFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.AuthenticationFault authenticationFault, Throwable cause) {
        super(message, cause);
        this.authenticationFault = authenticationFault;
    }

    public com.ipcommerce.schemas.identity._1.AuthenticationFault getFaultInfo() {
        return this.authenticationFault;
    }
}
