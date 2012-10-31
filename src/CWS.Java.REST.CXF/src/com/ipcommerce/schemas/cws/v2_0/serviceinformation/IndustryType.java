
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndustryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IndustryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="MOTO"/>
 *     &lt;enumeration value="Ecommerce"/>
 *     &lt;enumeration value="Restaurant"/>
 *     &lt;enumeration value="Retail"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IndustryType")
@XmlEnum
public enum IndustryType {


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
     *             Mail Order/Telephone Order. Also referred to as Direct Marketing.
     *             </summary>
     * 
     */
    MOTO("MOTO"),

    /**
     * <summary>
     *             Electronic Commerce.
     *             </summary>
     * 
     */
    @XmlEnumValue("Ecommerce")
    ECOMMERCE("Ecommerce"),

    /**
     * <summary>
     *             Restaurant.
     *             </summary>
     * 
     */
    @XmlEnumValue("Restaurant")
    RESTAURANT("Restaurant"),

    /**
     * <summary>
     *             Retail.
     *             </summary>
     * 
     */
    @XmlEnumValue("Retail")
    RETAIL("Retail");
    private final String value;

    IndustryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IndustryType fromValue(String v) {
        for (IndustryType c: IndustryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
