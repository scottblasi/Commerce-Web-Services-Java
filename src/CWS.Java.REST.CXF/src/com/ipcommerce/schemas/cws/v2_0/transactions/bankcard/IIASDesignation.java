
package com.ipcommerce.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IIASDesignation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IIASDesignation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="IIASVerified"/>
 *     &lt;enumeration value="IIASExempt"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IIASDesignation")
@XmlEnum
public enum IIASDesignation {


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
     *             IIASVerified
     *             </summary>
     * 
     */
    @XmlEnumValue("IIASVerified")
    IIAS_VERIFIED("IIASVerified"),

    /**
     * <summary>
     *             IIASExempt
     *             </summary>
     * 
     */
    @XmlEnumValue("IIASExempt")
    IIAS_EXEMPT("IIASExempt");
    private final String value;

    IIASDesignation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IIASDesignation fromValue(String v) {
        for (IIASDesignation c: IIASDesignation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
