
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseCardLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PurchaseCardLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Level1"/>
 *     &lt;enumeration value="Level2"/>
 *     &lt;enumeration value="Level3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PurchaseCardLevel")
@XmlEnum
public enum PurchaseCardLevel {


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
     *             Level 1 only.
     *             </summary>
     * 
     */
    @XmlEnumValue("Level1")
    LEVEL_1("Level1"),

    /**
     * <summary>
     *             Level 2 is supported.
     *             </summary>
     * 
     */
    @XmlEnumValue("Level2")
    LEVEL_2("Level2"),

    /**
     * <summary>
     *             Level 3 line item data is supported.
     *             </summary>
     * 
     */
    @XmlEnumValue("Level3")
    LEVEL_3("Level3");
    private final String value;

    PurchaseCardLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PurchaseCardLevel fromValue(String v) {
        for (PurchaseCardLevel c: PurchaseCardLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
