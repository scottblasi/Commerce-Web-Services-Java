
package com.ipcommerce.schemas.cws.v2_0.transactions;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CVDataProvided.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CVDataProvided">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="DeliberatelyBypass"/>
 *     &lt;enumeration value="Provided"/>
 *     &lt;enumeration value="ValueIllegible"/>
 *     &lt;enumeration value="CardholderStatesNotAvailable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CVDataProvided")
@XmlEnum
public enum CVDataProvided {


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
     *             Deliberately bypass.
     *             </summary>
     * 
     */
    @XmlEnumValue("DeliberatelyBypass")
    DELIBERATELY_BYPASS("DeliberatelyBypass"),

    /**
     * <summary>
     *             Provided.
     *             </summary>
     * 
     */
    @XmlEnumValue("Provided")
    PROVIDED("Provided"),

    /**
     * <summary>
     *             Value illegible.
     *             </summary>
     * 
     */
    @XmlEnumValue("ValueIllegible")
    VALUE_ILLEGIBLE("ValueIllegible"),

    /**
     * <summary>
     *             Cardholder states not available.
     *             </summary>
     * 
     */
    @XmlEnumValue("CardholderStatesNotAvailable")
    CARDHOLDER_STATES_NOT_AVAILABLE("CardholderStatesNotAvailable");
    private final String value;

    CVDataProvided(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CVDataProvided fromValue(String v) {
        for (CVDataProvided c: CVDataProvided.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
