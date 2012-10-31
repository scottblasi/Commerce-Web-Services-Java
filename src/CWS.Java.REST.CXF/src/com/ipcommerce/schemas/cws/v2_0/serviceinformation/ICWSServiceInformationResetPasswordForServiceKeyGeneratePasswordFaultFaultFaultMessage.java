
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:02:09.705-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "GeneratePasswordFault", targetNamespace = "http://schemas.ipcommerce.com/Identity/1.0/")
public class ICWSServiceInformationResetPasswordForServiceKeyGeneratePasswordFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.identity._1.GeneratePasswordFault generatePasswordFault;

    public ICWSServiceInformationResetPasswordForServiceKeyGeneratePasswordFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationResetPasswordForServiceKeyGeneratePasswordFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationResetPasswordForServiceKeyGeneratePasswordFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationResetPasswordForServiceKeyGeneratePasswordFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.GeneratePasswordFault generatePasswordFault) {
        super(message);
        this.generatePasswordFault = generatePasswordFault;
    }

    public ICWSServiceInformationResetPasswordForServiceKeyGeneratePasswordFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.GeneratePasswordFault generatePasswordFault, Throwable cause) {
        super(message, cause);
        this.generatePasswordFault = generatePasswordFault;
    }

    public com.ipcommerce.schemas.identity._1.GeneratePasswordFault getFaultInfo() {
        return this.generatePasswordFault;
    }
}
