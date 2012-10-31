
package com.ipcommerce.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestCommercialCard.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestCommercialCard">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Disable"/>
 *     &lt;enumeration value="Enable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequestCommercialCard")
@XmlEnum
public enum RequestCommercialCard {


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
     *             Disable.
     *             </summary>
     * 
     */
    @XmlEnumValue("Disable")
    DISABLE("Disable"),

    /**
     * <summary>
     *             Enable.
     *             </summary>
     * 
     */
    @XmlEnumValue("Enable")
    ENABLE("Enable");
    private final String value;

    RequestCommercialCard(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestCommercialCard fromValue(String v) {
        for (RequestCommercialCard c: RequestCommercialCard.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
