
package com.ipcommerce.schemas.cws.v2_0.dataservices.tms;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:04:42.821-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "TMSTransactionFailedFault", targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults")
public class ITMSOperationsQueryBatchTMSTransactionFailedFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.cws.v2_0.dataservices.tms.faults.TMSTransactionFailedFault tmsTransactionFailedFault;

    public ITMSOperationsQueryBatchTMSTransactionFailedFaultFaultFaultMessage() {
        super();
    }
    
    public ITMSOperationsQueryBatchTMSTransactionFailedFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ITMSOperationsQueryBatchTMSTransactionFailedFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ITMSOperationsQueryBatchTMSTransactionFailedFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.dataservices.tms.faults.TMSTransactionFailedFault tmsTransactionFailedFault) {
        super(message);
        this.tmsTransactionFailedFault = tmsTransactionFailedFault;
    }

    public ITMSOperationsQueryBatchTMSTransactionFailedFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.dataservices.tms.faults.TMSTransactionFailedFault tmsTransactionFailedFault, Throwable cause) {
        super(message, cause);
        this.tmsTransactionFailedFault = tmsTransactionFailedFault;
    }

    public com.ipcommerce.schemas.cws.v2_0.dataservices.tms.faults.TMSTransactionFailedFault getFaultInfo() {
        return this.tmsTransactionFailedFault;
    }
}
