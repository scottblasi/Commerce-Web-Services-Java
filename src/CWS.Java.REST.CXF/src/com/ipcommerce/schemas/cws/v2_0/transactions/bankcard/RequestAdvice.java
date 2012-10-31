
package com.ipcommerce.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestAdvice.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestAdvice">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="NotCapable"/>
 *     &lt;enumeration value="Capable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequestAdvice")
@XmlEnum
public enum RequestAdvice {


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
     *             Not capable.
     *             </summary>
     * 
     */
    @XmlEnumValue("NotCapable")
    NOT_CAPABLE("NotCapable"),

    /**
     * <summary>
     *             Capable.
     *             </summary>
     * 
     */
    @XmlEnumValue("Capable")
    CAPABLE("Capable");
    private final String value;

    RequestAdvice(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestAdvice fromValue(String v) {
        for (RequestAdvice c: RequestAdvice.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
