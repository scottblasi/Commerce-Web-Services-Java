
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditReversalSupportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditReversalSupportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSupported"/>
 *     &lt;enumeration value="Captured"/>
 *     &lt;enumeration value="ReadyForCapture"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditReversalSupportType")
@XmlEnum
public enum CreditReversalSupportType {


    /**
     * <summary>
     *             Reversal not supported
     *             </summary>
     * 
     */
    @XmlEnumValue("NotSupported")
    NOT_SUPPORTED("NotSupported"),

    /**
     * <summary>
     *             Reversal supported on captured Authorization
     *             </summary>
     * 
     */
    @XmlEnumValue("Captured")
    CAPTURED("Captured"),

    /**
     * <summary>
     *             Reversal supported on ReadyForCapture Authorizations
     *             </summary>
     * 
     */
    @XmlEnumValue("ReadyForCapture")
    READY_FOR_CAPTURE("ReadyForCapture"),

    /**
     * <summary>
     *             Reversal supported on Captured and ReadyForCapture Authorizations
     *             </summary>
     * 
     */
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    CreditReversalSupportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditReversalSupportType fromValue(String v) {
        for (CreditReversalSupportType c: CreditReversalSupportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
