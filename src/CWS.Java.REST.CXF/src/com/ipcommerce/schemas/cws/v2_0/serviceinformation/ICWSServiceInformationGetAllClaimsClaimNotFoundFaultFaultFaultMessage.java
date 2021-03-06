
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:02:10.113-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "ClaimNotFoundFault", targetNamespace = "http://schemas.ipcommerce.com/Identity/1.0/")
public class ICWSServiceInformationGetAllClaimsClaimNotFoundFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.identity._1.ClaimNotFoundFault claimNotFoundFault;

    public ICWSServiceInformationGetAllClaimsClaimNotFoundFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationGetAllClaimsClaimNotFoundFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationGetAllClaimsClaimNotFoundFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationGetAllClaimsClaimNotFoundFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.ClaimNotFoundFault claimNotFoundFault) {
        super(message);
        this.claimNotFoundFault = claimNotFoundFault;
    }

    public ICWSServiceInformationGetAllClaimsClaimNotFoundFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.ClaimNotFoundFault claimNotFoundFault, Throwable cause) {
        super(message, cause);
        this.claimNotFoundFault = claimNotFoundFault;
    }

    public com.ipcommerce.schemas.identity._1.ClaimNotFoundFault getFaultInfo() {
        return this.claimNotFoundFault;
    }
}
