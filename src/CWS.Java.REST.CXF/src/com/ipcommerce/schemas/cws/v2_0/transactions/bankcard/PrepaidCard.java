
package com.ipcommerce.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrepaidCard.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrepaidCard">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Yes"/>
 *     &lt;enumeration value="No"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrepaidCard")
@XmlEnum
public enum PrepaidCard {


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
     *             Card is a prepaid card.
     *             </summary>
     * 
     */
    @XmlEnumValue("Yes")
    YES("Yes"),

    /**
     * <summary>
     *             Card is not a prepaid card.
     *             </summary>
     * 
     */
    @XmlEnumValue("No")
    NO("No");
    private final String value;

    PrepaidCard(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrepaidCard fromValue(String v) {
        for (PrepaidCard c: PrepaidCard.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
