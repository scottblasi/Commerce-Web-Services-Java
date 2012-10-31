
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:02:09.873-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "ClaimMappingsNotFoundFault", targetNamespace = "http://schemas.ipcommerce.com/Identity/1.0/")
public class ICWSServiceInformationDelegatedSignOnClaimMappingsNotFoundFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.identity._1.ClaimMappingsNotFoundFault claimMappingsNotFoundFault;

    public ICWSServiceInformationDelegatedSignOnClaimMappingsNotFoundFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationDelegatedSignOnClaimMappingsNotFoundFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationDelegatedSignOnClaimMappingsNotFoundFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationDelegatedSignOnClaimMappingsNotFoundFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.ClaimMappingsNotFoundFault claimMappingsNotFoundFault) {
        super(message);
        this.claimMappingsNotFoundFault = claimMappingsNotFoundFault;
    }

    public ICWSServiceInformationDelegatedSignOnClaimMappingsNotFoundFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.ClaimMappingsNotFoundFault claimMappingsNotFoundFault, Throwable cause) {
        super(message, cause);
        this.claimMappingsNotFoundFault = claimMappingsNotFoundFault;
    }

    public com.ipcommerce.schemas.identity._1.ClaimMappingsNotFoundFault getFaultInfo() {
        return this.claimMappingsNotFoundFault;
    }
}
