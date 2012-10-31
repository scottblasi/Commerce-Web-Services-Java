
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CloseBatch.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CloseBatch">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Supported"/>
 *     &lt;enumeration value="NotSupported"/>
 *     &lt;enumeration value="Required"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CloseBatch")
@XmlEnum
public enum CloseBatch {


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
     *             Indicates that batch release is supported.
     *             </summary>
     * 
     */
    @XmlEnumValue("Supported")
    SUPPORTED("Supported"),

    /**
     * <summary>
     *             Indicates that batch release is not supported.
     *             </summary>
     * 
     */
    @XmlEnumValue("NotSupported")
    NOT_SUPPORTED("NotSupported"),

    /**
     * <summary>
     *             Indicates that batch release is supported and is required functionality.
     *             </summary>
     * 
     */
    @XmlEnumValue("Required")
    REQUIRED("Required");
    private final String value;


    CloseBatch(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CloseBatch fromValue(String v) {    	
        for (CloseBatch c: CloseBatch.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
    
    /*
    public static CloseBatch fromValue(String v) {
        for (CloseBatch c: CloseBatch.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    } */

}
