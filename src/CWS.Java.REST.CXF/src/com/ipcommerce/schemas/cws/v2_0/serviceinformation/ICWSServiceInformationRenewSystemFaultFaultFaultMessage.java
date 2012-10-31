
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:02:10.452-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "SystemFault", targetNamespace = "http://schemas.ipcommerce.com/Identity/1.0/")
public class ICWSServiceInformationRenewSystemFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.identity._1.SystemFault systemFault;

    public ICWSServiceInformationRenewSystemFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationRenewSystemFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationRenewSystemFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationRenewSystemFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.SystemFault systemFault) {
        super(message);
        this.systemFault = systemFault;
    }

    public ICWSServiceInformationRenewSystemFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.SystemFault systemFault, Throwable cause) {
        super(message, cause);
        this.systemFault = systemFault;
    }

    public com.ipcommerce.schemas.identity._1.SystemFault getFaultInfo() {
        return this.systemFault;
    }
}
