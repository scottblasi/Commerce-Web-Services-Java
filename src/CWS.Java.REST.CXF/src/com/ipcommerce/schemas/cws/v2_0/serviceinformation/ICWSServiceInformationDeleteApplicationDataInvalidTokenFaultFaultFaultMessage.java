
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:02:09.523-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "InvalidTokenFault", targetNamespace = "http://schemas.ipcommerce.com/Identity/1.0/")
public class ICWSServiceInformationDeleteApplicationDataInvalidTokenFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.identity._1.InvalidTokenFault invalidTokenFault;

    public ICWSServiceInformationDeleteApplicationDataInvalidTokenFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationDeleteApplicationDataInvalidTokenFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationDeleteApplicationDataInvalidTokenFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationDeleteApplicationDataInvalidTokenFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.InvalidTokenFault invalidTokenFault) {
        super(message);
        this.invalidTokenFault = invalidTokenFault;
    }

    public ICWSServiceInformationDeleteApplicationDataInvalidTokenFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.InvalidTokenFault invalidTokenFault, Throwable cause) {
        super(message, cause);
        this.invalidTokenFault = invalidTokenFault;
    }

    public com.ipcommerce.schemas.identity._1.InvalidTokenFault getFaultInfo() {
        return this.invalidTokenFault;
    }
}
