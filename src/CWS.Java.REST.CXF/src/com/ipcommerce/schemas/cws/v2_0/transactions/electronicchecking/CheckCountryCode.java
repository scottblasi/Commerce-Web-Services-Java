
package com.ipcommerce.schemas.cws.v2_0.transactions.electronicchecking;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckCountryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CheckCountryCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="MX"/>
 *     &lt;enumeration value="CA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CheckCountryCode")
@XmlEnum
public enum CheckCountryCode {


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
     *             United States.
     *             </summary>
     * 
     */
    US("US"),

    /**
     * <summary>
     *             Mexico.
     *             </summary>
     * 
     */
    MX("MX"),

    /**
     * <summary>
     *             Canada.
     *             </summary>
     * 
     */
    CA("CA");
    private final String value;

    CheckCountryCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CheckCountryCode fromValue(String v) {
        for (CheckCountryCode c: CheckCountryCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
