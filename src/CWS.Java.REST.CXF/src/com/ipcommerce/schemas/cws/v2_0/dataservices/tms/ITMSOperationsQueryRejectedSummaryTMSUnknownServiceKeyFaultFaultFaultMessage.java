
package com.ipcommerce.schemas.cws.v2_0.dataservices.tms;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:04:42.586-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "TMSUnknownServiceKeyFault", targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults")
public class ITMSOperationsQueryRejectedSummaryTMSUnknownServiceKeyFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.cws.v2_0.dataservices.tms.faults.TMSUnknownServiceKeyFault tmsUnknownServiceKeyFault;

    public ITMSOperationsQueryRejectedSummaryTMSUnknownServiceKeyFaultFaultFaultMessage() {
        super();
    }
    
    public ITMSOperationsQueryRejectedSummaryTMSUnknownServiceKeyFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ITMSOperationsQueryRejectedSummaryTMSUnknownServiceKeyFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ITMSOperationsQueryRejectedSummaryTMSUnknownServiceKeyFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.dataservices.tms.faults.TMSUnknownServiceKeyFault tmsUnknownServiceKeyFault) {
        super(message);
        this.tmsUnknownServiceKeyFault = tmsUnknownServiceKeyFault;
    }

    public ITMSOperationsQueryRejectedSummaryTMSUnknownServiceKeyFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.dataservices.tms.faults.TMSUnknownServiceKeyFault tmsUnknownServiceKeyFault, Throwable cause) {
        super(message, cause);
        this.tmsUnknownServiceKeyFault = tmsUnknownServiceKeyFault;
    }

    public com.ipcommerce.schemas.cws.v2_0.dataservices.tms.faults.TMSUnknownServiceKeyFault getFaultInfo() {
        return this.tmsUnknownServiceKeyFault;
    }
}
