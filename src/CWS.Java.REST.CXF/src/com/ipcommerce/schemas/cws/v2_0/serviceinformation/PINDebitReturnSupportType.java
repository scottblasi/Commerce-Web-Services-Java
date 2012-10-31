
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PINDebitReturnSupportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PINDebitReturnSupportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unsupported"/>
 *     &lt;enumeration value="Standalone"/>
 *     &lt;enumeration value="Linked"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PINDebitReturnSupportType")
@XmlEnum
public enum PINDebitReturnSupportType {


    /**
     * <summary>
     *             PIN Debit returns are not supported.
     *             </summary>
     * 
     */
    @XmlEnumValue("Unsupported")
    UNSUPPORTED("Unsupported"),

    /**
     * <summary>
     *             Standalone PIN Debit returns are supported.
     *             </summary>
     * 
     */
    @XmlEnumValue("Standalone")
    STANDALONE("Standalone"),

    /**
     * <summary>
     *             Linked PIN Debit returns are supported.
     *             </summary>
     * 
     */
    @XmlEnumValue("Linked")
    LINKED("Linked"),

    /**
     * <summary>
     *             Both PIN Debit linked and standalone returns are supported.
     *             </summary>
     * 
     */
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    PINDebitReturnSupportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PINDebitReturnSupportType fromValue(String v) {
        for (PINDebitReturnSupportType c: PINDebitReturnSupportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
