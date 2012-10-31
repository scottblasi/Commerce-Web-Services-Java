
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditAuthorizeSupportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditAuthorizeSupportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AuthorizeOnly"/>
 *     &lt;enumeration value="AuthorizeAndCaptureOnly"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditAuthorizeSupportType")
@XmlEnum
public enum CreditAuthorizeSupportType {


    /**
     * <summary>
     *             AuthorizeOnly is supported.
     *             </summary>
     * 
     */
    @XmlEnumValue("AuthorizeOnly")
    AUTHORIZE_ONLY("AuthorizeOnly"),

    /**
     * <summary>
     *             AuthorizeAndCaptureOnly is supported.
     *             </summary>
     * 
     */
    @XmlEnumValue("AuthorizeAndCaptureOnly")
    AUTHORIZE_AND_CAPTURE_ONLY("AuthorizeAndCaptureOnly"),

    /**
     * <summary>
     *             AuthorizeOnly and AuthorizeAndCaptureOnly are supported.
     *             </summary>
     * 
     */
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    CreditAuthorizeSupportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditAuthorizeSupportType fromValue(String v) {
        for (CreditAuthorizeSupportType c: CreditAuthorizeSupportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
