
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:02:10.507-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "UserNotFoundFault", targetNamespace = "http://schemas.ipcommerce.com/Identity/1.0/")
public class ICWSServiceInformationChangeUsernameForServiceKeyUserNotFoundFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.identity._1.UserNotFoundFault userNotFoundFault;

    public ICWSServiceInformationChangeUsernameForServiceKeyUserNotFoundFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationChangeUsernameForServiceKeyUserNotFoundFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationChangeUsernameForServiceKeyUserNotFoundFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationChangeUsernameForServiceKeyUserNotFoundFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.UserNotFoundFault userNotFoundFault) {
        super(message);
        this.userNotFoundFault = userNotFoundFault;
    }

    public ICWSServiceInformationChangeUsernameForServiceKeyUserNotFoundFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.UserNotFoundFault userNotFoundFault, Throwable cause) {
        super(message, cause);
        this.userNotFoundFault = userNotFoundFault;
    }

    public com.ipcommerce.schemas.identity._1.UserNotFoundFault getFaultInfo() {
        return this.userNotFoundFault;
    }
}
