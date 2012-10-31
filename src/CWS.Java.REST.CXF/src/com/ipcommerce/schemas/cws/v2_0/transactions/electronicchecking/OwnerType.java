
package com.ipcommerce.schemas.cws.v2_0.transactions.electronicchecking;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OwnerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OwnerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Personal"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OwnerType")
@XmlEnum
public enum OwnerType {


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
     *             Personal.
     *             </summary>
     * 
     */
    @XmlEnumValue("Personal")
    PERSONAL("Personal"),

    /**
     * <summary>
     *             Business.
     *             </summary>
     * 
     */
    @XmlEnumValue("Business")
    BUSINESS("Business"),

    /**
     * <summary>
     *             Unknown.
     *             </summary>
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    OwnerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OwnerType fromValue(String v) {
        for (OwnerType c: OwnerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
