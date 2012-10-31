
package com.ipcommerce.schemas.cws.v2_0.transactions.storedvalue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Lost"/>
 *     &lt;enumeration value="Stolen"/>
 *     &lt;enumeration value="Suspended"/>
 *     &lt;enumeration value="RemoveStatus"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CardStatus")
@XmlEnum
public enum CardStatus {


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
     *             Lost
     *             </summary>
     * 
     */
    @XmlEnumValue("Lost")
    LOST("Lost"),

    /**
     * <summary>
     *             Stolen
     *             </summary>
     * 
     */
    @XmlEnumValue("Stolen")
    STOLEN("Stolen"),

    /**
     * <summary>
     *             Suspended
     *             </summary>
     * 
     */
    @XmlEnumValue("Suspended")
    SUSPENDED("Suspended"),

    /**
     * <summary>
     *             RemoveStatus
     *             </summary>
     * 
     */
    @XmlEnumValue("RemoveStatus")
    REMOVE_STATUS("RemoveStatus");
    private final String value;

    CardStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardStatus fromValue(String v) {
        for (CardStatus c: CardStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
