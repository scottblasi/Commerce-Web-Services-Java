
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PinDebitUndoSupportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PinDebitUndoSupportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSupported"/>
 *     &lt;enumeration value="Supported"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PinDebitUndoSupportType")
@XmlEnum
public enum PinDebitUndoSupportType {


    /**
     * <summary>
     *             PIN Debit Undo is not supported.
     *             </summary>
     * 
     */
    @XmlEnumValue("NotSupported")
    NOT_SUPPORTED("NotSupported"),

    /**
     * <summary>
     *             PIN Debit Undo is supported.
     *             </summary>
     * 
     */
    @XmlEnumValue("Supported")
    SUPPORTED("Supported");
    private final String value;

    PinDebitUndoSupportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PinDebitUndoSupportType fromValue(String v) {
        for (PinDebitUndoSupportType c: PinDebitUndoSupportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
