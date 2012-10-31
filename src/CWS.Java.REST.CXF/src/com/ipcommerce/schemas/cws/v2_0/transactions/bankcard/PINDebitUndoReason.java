
package com.ipcommerce.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PINDebitUndoReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PINDebitUndoReason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="NotApplicable"/>
 *     &lt;enumeration value="NoResponse"/>
 *     &lt;enumeration value="LateResponse"/>
 *     &lt;enumeration value="UnableToDeliverToPOS"/>
 *     &lt;enumeration value="CustomerCancellation"/>
 *     &lt;enumeration value="SuspectMalfunction"/>
 *     &lt;enumeration value="PartiallyCompleted"/>
 *     &lt;enumeration value="OriginalAmountIncorrect"/>
 *     &lt;enumeration value="ResponseIncomplete"/>
 *     &lt;enumeration value="CADFailure"/>
 *     &lt;enumeration value="UnableToDeliverResponse"/>
 *     &lt;enumeration value="ResponseTimeout"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PINDebitUndoReason")
@XmlEnum
public enum PINDebitUndoReason {


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
     *             Not applicable.
     *             </summary>
     * 
     */
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable"),

    /**
     * <summary>
     *             No response.
     *             </summary>
     * 
     */
    @XmlEnumValue("NoResponse")
    NO_RESPONSE("NoResponse"),

    /**
     * <summary>
     *             Late response.
     *             </summary>
     * 
     */
    @XmlEnumValue("LateResponse")
    LATE_RESPONSE("LateResponse"),

    /**
     * <summary>
     *             Unable to deliver to POS.
     *             </summary>
     * 
     */
    @XmlEnumValue("UnableToDeliverToPOS")
    UNABLE_TO_DELIVER_TO_POS("UnableToDeliverToPOS"),

    /**
     * <summary>
     *             Customer cancellation.
     *             </summary>
     * 
     */
    @XmlEnumValue("CustomerCancellation")
    CUSTOMER_CANCELLATION("CustomerCancellation"),

    /**
     * <summary>
     *             Suspect malfunction.
     *             </summary>
     * 
     */
    @XmlEnumValue("SuspectMalfunction")
    SUSPECT_MALFUNCTION("SuspectMalfunction"),

    /**
     * <summary>
     *             Partially completed.
     *             </summary>
     * 
     */
    @XmlEnumValue("PartiallyCompleted")
    PARTIALLY_COMPLETED("PartiallyCompleted"),

    /**
     * <summary>
     *             Original amount incorrect.
     *             </summary>
     * 
     */
    @XmlEnumValue("OriginalAmountIncorrect")
    ORIGINAL_AMOUNT_INCORRECT("OriginalAmountIncorrect"),

    /**
     * <summary>
     *             Response incomplete.
     *             </summary>
     * 
     */
    @XmlEnumValue("ResponseIncomplete")
    RESPONSE_INCOMPLETE("ResponseIncomplete"),

    /**
     * <summary>
     *             CAD failure.
     *             </summary>
     * 
     */
    @XmlEnumValue("CADFailure")
    CAD_FAILURE("CADFailure"),

    /**
     * <summary>
     *             Unable to deliver response.
     *             </summary>
     * 
     */
    @XmlEnumValue("UnableToDeliverResponse")
    UNABLE_TO_DELIVER_RESPONSE("UnableToDeliverResponse"),

    /**
     * <summary>
     *             Response timeout.
     *             </summary>
     * 
     */
    @XmlEnumValue("ResponseTimeout")
    RESPONSE_TIMEOUT("ResponseTimeout");
    private final String value;

    PINDebitUndoReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PINDebitUndoReason fromValue(String v) {
        for (PINDebitUndoReason c: PINDebitUndoReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
