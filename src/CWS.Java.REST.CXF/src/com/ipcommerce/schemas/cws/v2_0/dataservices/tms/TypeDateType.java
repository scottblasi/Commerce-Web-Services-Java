
package com.ipcommerce.schemas.cws.v2_0.dataservices.tms;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeDateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeDateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SubmitDate"/>
 *     &lt;enumeration value="ReturnDate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeDateType")
@XmlEnum
public enum TypeDateType {


    /**
     * <summary>
     *             Submit Date.
     *             </summary>
     * 
     */
    @XmlEnumValue("SubmitDate")
    SUBMIT_DATE("SubmitDate"),

    /**
     * <summary>
     *             Return Date.
     *             </summary>
     * 
     */
    @XmlEnumValue("ReturnDate")
    RETURN_DATE("ReturnDate");
    private final String value;

    TypeDateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeDateType fromValue(String v) {
        for (TypeDateType c: TypeDateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
