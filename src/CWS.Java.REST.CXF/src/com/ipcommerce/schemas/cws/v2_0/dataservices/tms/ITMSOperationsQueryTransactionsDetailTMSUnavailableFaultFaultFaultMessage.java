
package com.ipcommerce.schemas.cws.v2_0.dataservices.tms;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:04:42.395-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "TMSUnavailableFault", targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults")
public class ITMSOperationsQueryTransactionsDetailTMSUnavailableFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.cws.v2_0.dataservices.tms.faults.TMSUnavailableFault tmsUnavailableFault;

    public ITMSOperationsQueryTransactionsDetailTMSUnavailableFaultFaultFaultMessage() {
        super();
    }
    
    public ITMSOperationsQueryTransactionsDetailTMSUnavailableFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ITMSOperationsQueryTransactionsDetailTMSUnavailableFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ITMSOperationsQueryTransactionsDetailTMSUnavailableFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.dataservices.tms.faults.TMSUnavailableFault tmsUnavailableFault) {
        super(message);
        this.tmsUnavailableFault = tmsUnavailableFault;
    }

    public ITMSOperationsQueryTransactionsDetailTMSUnavailableFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.dataservices.tms.faults.TMSUnavailableFault tmsUnavailableFault, Throwable cause) {
        super(message, cause);
        this.tmsUnavailableFault = tmsUnavailableFault;
    }

    public com.ipcommerce.schemas.cws.v2_0.dataservices.tms.faults.TMSUnavailableFault getFaultInfo() {
        return this.tmsUnavailableFault;
    }
}
