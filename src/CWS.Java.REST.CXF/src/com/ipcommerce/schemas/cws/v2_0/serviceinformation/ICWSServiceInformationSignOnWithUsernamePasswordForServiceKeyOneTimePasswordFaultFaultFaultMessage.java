
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:02:10.309-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "OneTimePasswordFault", targetNamespace = "http://schemas.ipcommerce.com/Identity/1.0/")
public class ICWSServiceInformationSignOnWithUsernamePasswordForServiceKeyOneTimePasswordFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.identity._1.OneTimePasswordFault oneTimePasswordFault;

    public ICWSServiceInformationSignOnWithUsernamePasswordForServiceKeyOneTimePasswordFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationSignOnWithUsernamePasswordForServiceKeyOneTimePasswordFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationSignOnWithUsernamePasswordForServiceKeyOneTimePasswordFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationSignOnWithUsernamePasswordForServiceKeyOneTimePasswordFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.OneTimePasswordFault oneTimePasswordFault) {
        super(message);
        this.oneTimePasswordFault = oneTimePasswordFault;
    }

    public ICWSServiceInformationSignOnWithUsernamePasswordForServiceKeyOneTimePasswordFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.OneTimePasswordFault oneTimePasswordFault, Throwable cause) {
        super(message, cause);
        this.oneTimePasswordFault = oneTimePasswordFault;
    }

    public com.ipcommerce.schemas.identity._1.OneTimePasswordFault getFaultInfo() {
        return this.oneTimePasswordFault;
    }
}
