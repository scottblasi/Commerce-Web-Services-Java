
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartialApprovalSupportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartialApprovalSupportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DisabledAlwaysSupported"/>
 *     &lt;enumeration value="DisabledNotSupported"/>
 *     &lt;enumeration value="Enabled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PartialApprovalSupportType")
@XmlEnum
public enum PartialApprovalSupportType {


    /**
     * <summary>
     *             Service does not support setting partial approval capability at the transaction level. 
     *             Partial approvals are always supported and are set at the merchant account level.
     *              </summary>
     * 
     */
    @XmlEnumValue("DisabledAlwaysSupported")
    DISABLED_ALWAYS_SUPPORTED("DisabledAlwaysSupported"),

    /**
     * <summary>
     *             Service does not support setting partial approval capability at the transaction level, partial approvals are never supported.
     *              </summary>
     * 
     */
    @XmlEnumValue("DisabledNotSupported")
    DISABLED_NOT_SUPPORTED("DisabledNotSupported"),

    /**
     * <summary>
     *             Service supports setting partial approval capability at the transaction level.
     *              </summary>
     * 
     */
    @XmlEnumValue("Enabled")
    ENABLED("Enabled");
    private final String value;

    PartialApprovalSupportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PartialApprovalSupportType fromValue(String v) {
        for (PartialApprovalSupportType c: PartialApprovalSupportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
