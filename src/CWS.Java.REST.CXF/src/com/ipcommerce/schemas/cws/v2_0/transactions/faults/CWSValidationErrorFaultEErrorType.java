
package com.ipcommerce.schemas.cws.v2_0.transactions.faults;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CWSValidationErrorFault.EErrorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CWSValidationErrorFault.EErrorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Validation"/>
 *     &lt;enumeration value="Processing"/>
 *     &lt;enumeration value="System"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CWSValidationErrorFault.EErrorType")
@XmlEnum
public enum CWSValidationErrorFaultEErrorType {


    /**
     * <summary>
     *             Rule failed validation.
     *             </summary>
     * 
     */
    @XmlEnumValue("Validation")
    VALIDATION("Validation"),

    /**
     * <summary>
     *             Processing error.  An error that
     *             has nothing to do with the message nor
     *             with the validator engine.
     *             </summary>
     * 
     */
    @XmlEnumValue("Processing")
    PROCESSING("Processing"),

    /**
     * <summary>
     *             Systems error.  An error that
     *             has nothing to do with the message
     *             and indicates that something failed in
     *             the validator engine.
     *             </summary>
     * 
     */
    @XmlEnumValue("System")
    SYSTEM("System");
    private final String value;

    CWSValidationErrorFaultEErrorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CWSValidationErrorFaultEErrorType fromValue(String v) {
        for (CWSValidationErrorFaultEErrorType c: CWSValidationErrorFaultEErrorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
