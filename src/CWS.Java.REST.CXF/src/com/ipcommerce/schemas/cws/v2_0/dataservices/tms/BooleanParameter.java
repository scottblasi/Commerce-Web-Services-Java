
package com.ipcommerce.schemas.cws.v2_0.dataservices.tms;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BooleanParameter.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BooleanParameter">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="True"/>
 *     &lt;enumeration value="False"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BooleanParameter")
@XmlEnum
public enum BooleanParameter {


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
     *             True.
     *             </summary>
     * 
     */
    @XmlEnumValue("True")
    TRUE("True"),

    /**
     * <summary>
     *             False.
     *             </summary>
     * 
     */
    @XmlEnumValue("False")
    FALSE("False");
    private final String value;

    BooleanParameter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BooleanParameter fromValue(String v) {
        for (BooleanParameter c: BooleanParameter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
