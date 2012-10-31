
package com.ipcommerce.schemas.cws.v2_0.transactions;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaptureState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CaptureState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="CannotCapture"/>
 *     &lt;enumeration value="ReadyForCapture"/>
 *     &lt;enumeration value="CapturePending"/>
 *     &lt;enumeration value="Captured"/>
 *     &lt;enumeration value="CaptureDeclined"/>
 *     &lt;enumeration value="InProcess"/>
 *     &lt;enumeration value="CapturedUndoPermitted"/>
 *     &lt;enumeration value="CapturePendingUndoPermitted"/>
 *     &lt;enumeration value="CaptureError"/>
 *     &lt;enumeration value="CaptureUnknown"/>
 *     &lt;enumeration value="BatchSent"/>
 *     &lt;enumeration value="BatchSentUndoPermitted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CaptureState")
@XmlEnum
public enum CaptureState {


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
     *             Transaction cannot be captured due to declined authorization or subsequent undoing of successful authorization.
     *             </summary>
     * 
     */
    @XmlEnumValue("CannotCapture")
    CANNOT_CAPTURE("CannotCapture"),

    /**
     * <summary>
     *             Successfully authorized but capture not requested.
     *             </summary>
     * 
     */
    @XmlEnumValue("ReadyForCapture")
    READY_FOR_CAPTURE("ReadyForCapture"),

    /**
     * <summary>
     *             Successfully transmitted capture but it is not yet known whether the processor accepted it.
     *             </summary>
     * 
     */
    @XmlEnumValue("CapturePending")
    CAPTURE_PENDING("CapturePending"),

    /**
     * <summary>
     *             Successfully captured.
     *             </summary>
     * 
     */
    @XmlEnumValue("Captured")
    CAPTURED("Captured"),

    /**
     * <summary>
     *             Capture was successfully submitted but declined by the service.
     *             </summary>
     * 
     */
    @XmlEnumValue("CaptureDeclined")
    CAPTURE_DECLINED("CaptureDeclined"),

    /**
     * <summary>
     *             The capture is in process.
     *             </summary>
     * 
     */
    @XmlEnumValue("InProcess")
    IN_PROCESS("InProcess"),

    /**
     * <summary>
     *             Indicates if an Undo is permitted for the Captured state.
     *             </summary>
     * 
     */
    @XmlEnumValue("CapturedUndoPermitted")
    CAPTURED_UNDO_PERMITTED("CapturedUndoPermitted"),

    /**
     * <summary>
     *             Indicates if an Undo is permitted for the CapturePending state.
     *             </summary>
     * 
     */
    @XmlEnumValue("CapturePendingUndoPermitted")
    CAPTURE_PENDING_UNDO_PERMITTED("CapturePendingUndoPermitted"),

    /**
     * <summary>
     *             Indicates an error state during capture.
     *             </summary>
     * 
     */
    @XmlEnumValue("CaptureError")
    CAPTURE_ERROR("CaptureError"),

    /**
     * <summary>
     *             Unknow capture state.
     *             </summary>
     * 
     */
    @XmlEnumValue("CaptureUnknown")
    CAPTURE_UNKNOWN("CaptureUnknown"),

    /**
     * <summary>
     *             Batch has been sent, response is out of band.
     *             </summary>
     * 
     */
    @XmlEnumValue("BatchSent")
    BATCH_SENT("BatchSent"),

    /**
     * <summary>
     *             Batch has been sent, an Undo operation is allowed.
     *             </summary>
     * 
     */
    @XmlEnumValue("BatchSentUndoPermitted")
    BATCH_SENT_UNDO_PERMITTED("BatchSentUndoPermitted");
    private final String value;

    CaptureState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CaptureState fromValue(String v) {
        for (CaptureState c: CaptureState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
