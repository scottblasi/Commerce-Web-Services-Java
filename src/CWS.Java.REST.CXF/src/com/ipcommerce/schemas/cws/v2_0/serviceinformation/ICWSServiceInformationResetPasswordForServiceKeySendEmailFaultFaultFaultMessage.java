
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:02:09.721-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "SendEmailFault", targetNamespace = "http://schemas.ipcommerce.com/Identity/1.0/")
public class ICWSServiceInformationResetPasswordForServiceKeySendEmailFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.identity._1.SendEmailFault sendEmailFault;

    public ICWSServiceInformationResetPasswordForServiceKeySendEmailFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationResetPasswordForServiceKeySendEmailFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationResetPasswordForServiceKeySendEmailFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationResetPasswordForServiceKeySendEmailFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.SendEmailFault sendEmailFault) {
        super(message);
        this.sendEmailFault = sendEmailFault;
    }

    public ICWSServiceInformationResetPasswordForServiceKeySendEmailFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.SendEmailFault sendEmailFault, Throwable cause) {
        super(message, cause);
        this.sendEmailFault = sendEmailFault;
    }

    public com.ipcommerce.schemas.identity._1.SendEmailFault getFaultInfo() {
        return this.sendEmailFault;
    }
}
