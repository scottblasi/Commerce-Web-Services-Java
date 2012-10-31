
package com.ipcommerce.schemas.cws.v2_0.transactions.bankcard;

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
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Capable"/>
 *     &lt;enumeration value="NotCapable"/>
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
     *             Value has not been explicitly set.
     *             </summary>
     * 
     */
    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),

    /**
     * <summary>
     *             Merchant is capable of handling partial approval
     *             </summary>
     * 
     */
    @XmlEnumValue("Capable")
    CAPABLE("Capable"),

    /**
     * <summary>
     *             Merchant is not capable of handling partial approval
     *             </summary>
     * 
     */
    @XmlEnumValue("NotCapable")
    NOT_CAPABLE("NotCapable");
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
