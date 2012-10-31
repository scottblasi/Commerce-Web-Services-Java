
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TenderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TenderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Credit"/>
 *     &lt;enumeration value="PINDebit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TenderType")
@XmlEnum
public enum TenderType {


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
     *             Credit Card.
     *             </summary>
     * 
     */
    @XmlEnumValue("Credit")
    CREDIT("Credit"),

    /**
     * <summary>
     *             PIN Debit.
     *             </summary>
     * 
     */
    @XmlEnumValue("PINDebit")
    PIN_DEBIT("PINDebit");
    private final String value;

    TenderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TenderType fromValue(String v) {
        for (TenderType c: TenderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
