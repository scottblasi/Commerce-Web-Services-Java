
package com.ipcommerce.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExistingDebt.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExistingDebt">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="NotExistingDebt"/>
 *     &lt;enumeration value="IsExistingDebt"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExistingDebt")
@XmlEnum
public enum ExistingDebt {


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
     *             Not existing debt.
     *             </summary>
     * 
     */
    @XmlEnumValue("NotExistingDebt")
    NOT_EXISTING_DEBT("NotExistingDebt"),

    /**
     * <summary>
     *             Is existing debt.
     *             </summary>
     * 
     */
    @XmlEnumValue("IsExistingDebt")
    IS_EXISTING_DEBT("IsExistingDebt");
    private final String value;

    ExistingDebt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExistingDebt fromValue(String v) {
        for (ExistingDebt c: ExistingDebt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
