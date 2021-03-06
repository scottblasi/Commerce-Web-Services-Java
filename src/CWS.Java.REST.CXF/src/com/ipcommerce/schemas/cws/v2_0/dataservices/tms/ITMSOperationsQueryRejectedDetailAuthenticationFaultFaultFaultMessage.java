
package com.ipcommerce.schemas.cws.v2_0.dataservices.tms;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:04:42.939-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "AuthenticationFault", targetNamespace = "http://schemas.ipcommerce.com/Identity/1.0/")
public class ITMSOperationsQueryRejectedDetailAuthenticationFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.identity._1.AuthenticationFault authenticationFault;

    public ITMSOperationsQueryRejectedDetailAuthenticationFaultFaultFaultMessage() {
        super();
    }
    
    public ITMSOperationsQueryRejectedDetailAuthenticationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ITMSOperationsQueryRejectedDetailAuthenticationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ITMSOperationsQueryRejectedDetailAuthenticationFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.AuthenticationFault authenticationFault) {
        super(message);
        this.authenticationFault = authenticationFault;
    }

    public ITMSOperationsQueryRejectedDetailAuthenticationFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.AuthenticationFault authenticationFault, Throwable cause) {
        super(message, cause);
        this.authenticationFault = authenticationFault;
    }

    public com.ipcommerce.schemas.identity._1.AuthenticationFault getFaultInfo() {
        return this.authenticationFault;
    }
}
