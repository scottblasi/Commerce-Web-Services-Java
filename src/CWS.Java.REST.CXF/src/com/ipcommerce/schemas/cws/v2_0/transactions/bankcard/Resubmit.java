
package com.ipcommerce.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Resubmit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Resubmit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Unspecified"/>
 *     &lt;enumeration value="Permitted"/>
 *     &lt;enumeration value="NotPermitted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Resubmit")
@XmlEnum
public enum Resubmit {


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
     *             Unspecified.
     *             </summary>
     * 
     */
    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),

    /**
     * <summary>
     *             Permitted.
     *             </summary>
     * 
     */
    @XmlEnumValue("Permitted")
    PERMITTED("Permitted"),

    /**
     * <summary>
     *             Not permitted.
     *             </summary>
     * 
     */
    @XmlEnumValue("NotPermitted")
    NOT_PERMITTED("NotPermitted");
    private final String value;

    Resubmit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Resubmit fromValue(String v) {
        for (Resubmit c: Resubmit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
