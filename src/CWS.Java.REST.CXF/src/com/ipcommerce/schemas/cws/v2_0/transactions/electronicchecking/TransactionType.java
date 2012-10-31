
package com.ipcommerce.schemas.cws.v2_0.transactions.electronicchecking;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Credit"/>
 *     &lt;enumeration value="Debit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionType")
@XmlEnum
public enum TransactionType {


    /**
     * <summary>
     *             Credit.
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
    @XmlEnumValue("Debit")
    DEBIT("Debit");
    private final String value;

    TransactionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionType fromValue(String v) {
        for (TransactionType c: TransactionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
