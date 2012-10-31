
package com.ipcommerce.schemas.cws.v2_0.transactions;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Declined"/>
 *     &lt;enumeration value="Verified"/>
 *     &lt;enumeration value="Authorized"/>
 *     &lt;enumeration value="Adjusted"/>
 *     &lt;enumeration value="Captured"/>
 *     &lt;enumeration value="CaptureDeclined"/>
 *     &lt;enumeration value="PartiallyCaptured"/>
 *     &lt;enumeration value="Undone"/>
 *     &lt;enumeration value="ReturnRequested"/>
 *     &lt;enumeration value="PartialReturnRequested"/>
 *     &lt;enumeration value="ReturnUndone"/>
 *     &lt;enumeration value="Returned"/>
 *     &lt;enumeration value="PartiallyReturned"/>
 *     &lt;enumeration value="InProcess"/>
 *     &lt;enumeration value="ErrorValidation"/>
 *     &lt;enumeration value="ErrorUnknown"/>
 *     &lt;enumeration value="ErrorConnecting"/>
 *     &lt;enumeration value="FundsRequested"/>
 *     &lt;enumeration value="FundsTransferred"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionState")
@XmlEnum
public enum TransactionState {


    /**
     * <summary>
     *             Value has not been explicitly set.
     *             </summary>
     * 
     */
    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),

    /**
     * <summary>
     *             The original transaction was successfully transmitted but declined by the service.
     *             </summary>
     * 
     */
    @XmlEnumValue("Declined")
    DECLINED("Declined"),

    /**
     * <summary>
     *             A verify transaction was successfully run. Check response for details.
     *             </summary>
     * 
     */
    @XmlEnumValue("Verified")
    VERIFIED("Verified"),

    /**
     * <summary>
     *             The original transaction was successfully authorized. The transaction has not yet been captured.
     *             </summary>
     * 
     */
    @XmlEnumValue("Authorized")
    AUTHORIZED("Authorized"),

    /**
     * <summary>
     *             The original transaction was successfully authorized and the amount subsequently successfully adjusted.
     *             </summary>
     * 
     */
    @XmlEnumValue("Adjusted")
    ADJUSTED("Adjusted"),

    /**
     * <summary>
     *             The transaction was successfully captured.
     *             </summary>
     * 
     */
    @XmlEnumValue("Captured")
    CAPTURED("Captured"),

    /**
     * <summary>
     *             An attempt to capture the transaction was declined by the service provider.
     *             </summary>
     * 
     */
    @XmlEnumValue("CaptureDeclined")
    CAPTURE_DECLINED("CaptureDeclined"),

    /**
     * <summary>
     *             The transaction was captured for a partial amount with the expectation that another capture may be attempted for the additional authorized funds.
     *             </summary>
     * 
     */
    @XmlEnumValue("PartiallyCaptured")
    PARTIALLY_CAPTURED("PartiallyCaptured"),

    /**
     * <summary>
     *             The transaction was completely voided or reversed.
     *             </summary>
     * 
     */
    @XmlEnumValue("Undone")
    UNDONE("Undone"),

    /**
     * <summary>
     *             Either the original transaction was a standalone return, or a successfully captured transaction was subsequently returned for the full amount. The return has not yet been captured.
     *             </summary>
     * 
     */
    @XmlEnumValue("ReturnRequested")
    RETURN_REQUESTED("ReturnRequested"),

    /**
     * <summary>
     *             A successfully captured transaction was returned for less than the captured amount. The return has not yet been captured.
     *             </summary>
     * 
     */
    @XmlEnumValue("PartialReturnRequested")
    PARTIAL_RETURN_REQUESTED("PartialReturnRequested"),

    /**
     * <summary>
     *             A standalone return or a return of a successfully captured transaction was voided.
     *             </summary>
     * 
     */
    @XmlEnumValue("ReturnUndone")
    RETURN_UNDONE("ReturnUndone"),

    /**
     * <summary>
     *             Either the original transaction was a standalone return, or a successfully captured transaction was subsequently returned for the full amount. The return has been captured.
     *             </summary>
     * 
     */
    @XmlEnumValue("Returned")
    RETURNED("Returned"),

    /**
     * <summary>
     *             A successfully captured transaction was returned for less than the captured amount. The return has been captured.
     *             </summary>
     * 
     */
    @XmlEnumValue("PartiallyReturned")
    PARTIALLY_RETURNED("PartiallyReturned"),

    /**
     * <summary>
     *             Transaction is in process.
     *             </summary>
     * 
     */
    @XmlEnumValue("InProcess")
    IN_PROCESS("InProcess"),

    /**
     * <summary>
     *             There was a validation error on the transaction.
     *             </summary>
     * 
     */
    @XmlEnumValue("ErrorValidation")
    ERROR_VALIDATION("ErrorValidation"),

    /**
     * <summary>
     *             An unknown error occured during the processing of this error.
     *             </summary>
     * 
     */
    @XmlEnumValue("ErrorUnknown")
    ERROR_UNKNOWN("ErrorUnknown"),

    /**
     * <summary>
     *             There was a connection error during the processing of this transaction.
     *             </summary>
     * 
     */
    @XmlEnumValue("ErrorConnecting")
    ERROR_CONNECTING("ErrorConnecting"),

    /**
     * <summary>
     *             Indicated funds have been requested for Disburse transaction.
     *             </summary>
     * 
     */
    @XmlEnumValue("FundsRequested")
    FUNDS_REQUESTED("FundsRequested"),

    /**
     * <summary>
     *             Indicated funds have been transferred for Disburse transaction.
     *             </summary>
     * 
     */
    @XmlEnumValue("FundsTransferred")
    FUNDS_TRANSFERRED("FundsTransferred");
    private final String value;

    TransactionState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionState fromValue(String v) {
        for (TransactionState c: TransactionState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
