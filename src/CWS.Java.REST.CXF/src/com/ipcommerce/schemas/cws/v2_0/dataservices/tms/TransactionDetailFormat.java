
package com.ipcommerce.schemas.cws.v2_0.dataservices.tms;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionDetailFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionDetailFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CWSTransaction"/>
 *     &lt;enumeration value="SerializedCWS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionDetailFormat")
@XmlEnum
public enum TransactionDetailFormat {


    /**
     * <summary>
     *             Response should be in the CWS object model.
     *             </summary>
     * 
     */
    @XmlEnumValue("CWSTransaction")
    CWS_TRANSACTION("CWSTransaction"),

    /**
     * <summary>
     *             Response should be in a serialized XML representation of the CWS object model.
     *             </summary>
     * 
     */
    @XmlEnumValue("SerializedCWS")
    SERIALIZED_CWS("SerializedCWS");
    private final String value;

    TransactionDetailFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionDetailFormat fromValue(String v) {
        for (TransactionDetailFormat c: TransactionDetailFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
