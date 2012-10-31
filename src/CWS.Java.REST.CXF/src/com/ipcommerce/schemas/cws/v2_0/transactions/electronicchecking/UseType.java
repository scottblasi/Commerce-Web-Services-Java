
package com.ipcommerce.schemas.cws.v2_0.transactions.electronicchecking;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Savings"/>
 *     &lt;enumeration value="Checking"/>
 *     &lt;enumeration value="Travelers"/>
 *     &lt;enumeration value="Payroll"/>
 *     &lt;enumeration value="Cash"/>
 *     &lt;enumeration value="TwoParty"/>
 *     &lt;enumeration value="Government"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UseType")
@XmlEnum
public enum UseType {


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
     *             Savings.
     *             </summary>
     * 
     */
    @XmlEnumValue("Savings")
    SAVINGS("Savings"),

    /**
     * <summary>
     *             Checking.
     *             </summary>
     * 
     */
    @XmlEnumValue("Checking")
    CHECKING("Checking"),

    /**
     * <summary>
     *             Travelers.
     *             </summary>
     * 
     */
    @XmlEnumValue("Travelers")
    TRAVELERS("Travelers"),

    /**
     * <summary>
     *             Payroll.
     *             </summary>
     * 
     */
    @XmlEnumValue("Payroll")
    PAYROLL("Payroll"),

    /**
     * <summary>
     *             Cash.
     *             </summary>
     * 
     */
    @XmlEnumValue("Cash")
    CASH("Cash"),

    /**
     * <summary>
     *             Two Party.
     *             </summary>
     * 
     */
    @XmlEnumValue("TwoParty")
    TWO_PARTY("TwoParty"),

    /**
     * <summary>
     *             Government.
     *             </summary>
     * 
     */
    @XmlEnumValue("Government")
    GOVERNMENT("Government");
    private final String value;

    UseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UseType fromValue(String v) {
        for (UseType c: UseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
