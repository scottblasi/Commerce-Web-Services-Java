
package com.ipcommerce.schemas.cws.v2_0.transactions.storedvalue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Activate"/>
 *     &lt;enumeration value="BalanceTransfer"/>
 *     &lt;enumeration value="Deactivate"/>
 *     &lt;enumeration value="Reload"/>
 *     &lt;enumeration value="UpdateStatus"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperationType")
@XmlEnum
public enum OperationType {


    /**
     * <summary>
     *             Value has not been explicitly set.
     *             </summary>
     * 
     */
    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    @XmlEnumValue("Activate")
    ACTIVATE("Activate"),
    @XmlEnumValue("BalanceTransfer")
    BALANCE_TRANSFER("BalanceTransfer"),
    @XmlEnumValue("Deactivate")
    DEACTIVATE("Deactivate"),
    @XmlEnumValue("Reload")
    RELOAD("Reload"),
    @XmlEnumValue("UpdateStatus")
    UPDATE_STATUS("UpdateStatus");
    private final String value;

    OperationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperationType fromValue(String v) {
        for (OperationType c: OperationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
