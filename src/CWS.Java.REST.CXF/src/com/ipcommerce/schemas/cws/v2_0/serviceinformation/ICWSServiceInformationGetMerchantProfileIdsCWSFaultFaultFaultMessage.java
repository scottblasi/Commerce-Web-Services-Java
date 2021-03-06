
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:02:10.292-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "CWSFault", targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults")
public class ICWSServiceInformationGetMerchantProfileIdsCWSFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.cws.v2_0.serviceinformation.faults.CWSFault cwsFault;

    public ICWSServiceInformationGetMerchantProfileIdsCWSFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationGetMerchantProfileIdsCWSFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationGetMerchantProfileIdsCWSFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationGetMerchantProfileIdsCWSFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.serviceinformation.faults.CWSFault cwsFault) {
        super(message);
        this.cwsFault = cwsFault;
    }

    public ICWSServiceInformationGetMerchantProfileIdsCWSFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.serviceinformation.faults.CWSFault cwsFault, Throwable cause) {
        super(message, cause);
        this.cwsFault = cwsFault;
    }

    public com.ipcommerce.schemas.cws.v2_0.serviceinformation.faults.CWSFault getFaultInfo() {
        return this.cwsFault;
    }
}
