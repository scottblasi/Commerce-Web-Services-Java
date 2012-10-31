
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PINCapability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PINCapability">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="PINSupported"/>
 *     &lt;enumeration value="PINNotSupported"/>
 *     &lt;enumeration value="PINVerifiedByDevice"/>
 *     &lt;enumeration value="PINPadInoperative"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PINCapability")
@XmlEnum
public enum PINCapability {


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
     *             Unknown.
     *             </summary>
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * <summary>
     *             Supports PIN.
     *             </summary>
     * 
     */
    @XmlEnumValue("PINSupported")
    PIN_SUPPORTED("PINSupported"),

    /**
     * <summary>
     *             Does not support PIN.
     *             </summary>
     * 
     */
    @XmlEnumValue("PINNotSupported")
    PIN_NOT_SUPPORTED("PINNotSupported"),

    /**
     * <summary>
     *             PIN verified by device.
     *             </summary>
     * 
     */
    @XmlEnumValue("PINVerifiedByDevice")
    PIN_VERIFIED_BY_DEVICE("PINVerifiedByDevice"),

    /**
     * <summary>
     *             PIN pad inoperative.
     *             </summary>
     * 
     */
    @XmlEnumValue("PINPadInoperative")
    PIN_PAD_INOPERATIVE("PINPadInoperative");
    private final String value;

    PINCapability(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PINCapability fromValue(String v) {
        for (PINCapability c: PINCapability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
