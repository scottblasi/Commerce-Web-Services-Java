
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchAssignmentSupport.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BatchAssignmentSupport">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Supported"/>
 *     &lt;enumeration value="NotSupported"/>
 *     &lt;enumeration value="SupportedWithCaptureAll"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BatchAssignmentSupport")
@XmlEnum
public enum BatchAssignmentSupport {


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
     *             Indicates that batch assignment is supported.
     *             </summary>
     * 
     */
    @XmlEnumValue("Supported")
    SUPPORTED("Supported"),

    /**
     * <summary>
     *             Indicates that batch assignment is not supported.
     *             </summary>
     * 
     */
    @XmlEnumValue("NotSupported")
    NOT_SUPPORTED("NotSupported"),

    /**
     * <summary>
     *             Indicates that batch assignment is supported with CaptureAll.
     *             </summary>
     * 
     */
    @XmlEnumValue("SupportedWithCaptureAll")
    SUPPORTED_WITH_CAPTURE_ALL("SupportedWithCaptureAll");
    private final String value;

    BatchAssignmentSupport(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BatchAssignmentSupport fromValue(String v) {
        for (BatchAssignmentSupport c: BatchAssignmentSupport.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
