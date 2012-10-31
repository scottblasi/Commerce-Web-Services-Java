
package com.ipcommerce.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IsTaxExempt.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IsTaxExempt">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Exempt"/>
 *     &lt;enumeration value="NotExemptTaxInfoNotProvided"/>
 *     &lt;enumeration value="NotExemptTaxInfoProvided"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IsTaxExempt")
@XmlEnum
public enum IsTaxExempt {


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
     *             Exempt.
     *             </summary>
     * 
     */
    @XmlEnumValue("Exempt")
    EXEMPT("Exempt"),

    /**
     * <summary>
     *             Not exempt but tax information not provided.
     *             </summary>
     * 
     */
    @XmlEnumValue("NotExemptTaxInfoNotProvided")
    NOT_EXEMPT_TAX_INFO_NOT_PROVIDED("NotExemptTaxInfoNotProvided"),

    /**
     * <summary>
     *             Not exempt tax information is provided.
     *             </summary>
     * 
     */
    @XmlEnumValue("NotExemptTaxInfoProvided")
    NOT_EXEMPT_TAX_INFO_PROVIDED("NotExemptTaxInfoProvided");
    private final String value;

    IsTaxExempt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IsTaxExempt fromValue(String v) {
        for (IsTaxExempt c: IsTaxExempt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
