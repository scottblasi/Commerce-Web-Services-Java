
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:02:10.195-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "STSUnavailableFault", targetNamespace = "http://schemas.ipcommerce.com/Identity/1.0/")
public class ICWSServiceInformationChangePasswordForServiceKeySTSUnavailableFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.identity._1.STSUnavailableFault stsUnavailableFault;

    public ICWSServiceInformationChangePasswordForServiceKeySTSUnavailableFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationChangePasswordForServiceKeySTSUnavailableFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationChangePasswordForServiceKeySTSUnavailableFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationChangePasswordForServiceKeySTSUnavailableFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.STSUnavailableFault stsUnavailableFault) {
        super(message);
        this.stsUnavailableFault = stsUnavailableFault;
    }

    public ICWSServiceInformationChangePasswordForServiceKeySTSUnavailableFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.STSUnavailableFault stsUnavailableFault, Throwable cause) {
        super(message, cause);
        this.stsUnavailableFault = stsUnavailableFault;
    }

    public com.ipcommerce.schemas.identity._1.STSUnavailableFault getFaultInfo() {
        return this.stsUnavailableFault;
    }
}
