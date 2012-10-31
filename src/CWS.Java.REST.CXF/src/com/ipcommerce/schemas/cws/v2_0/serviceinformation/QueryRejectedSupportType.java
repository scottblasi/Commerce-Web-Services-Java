
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryRejectedSupportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryRejectedSupportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSupported"/>
 *     &lt;enumeration value="SupportedWithDateRange"/>
 *     &lt;enumeration value="SupportedWithSpecificDate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueryRejectedSupportType")
@XmlEnum
public enum QueryRejectedSupportType {


    /**
     * <summary>
     *             Date ranges are not supported.
     *             </summary>
     * 
     */
    @XmlEnumValue("NotSupported")
    NOT_SUPPORTED("NotSupported"),

    /**
     * <summary>
     *             Date ranges are supported.
     *             </summary>
     * 
     */
    @XmlEnumValue("SupportedWithDateRange")
    SUPPORTED_WITH_DATE_RANGE("SupportedWithDateRange"),

    /**
     * <summary>
     *             Date ranges are supported with specific dates.
     *             </summary>
     * 
     */
    @XmlEnumValue("SupportedWithSpecificDate")
    SUPPORTED_WITH_SPECIFIC_DATE("SupportedWithSpecificDate");
    private final String value;

    QueryRejectedSupportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QueryRejectedSupportType fromValue(String v) {
        for (QueryRejectedSupportType c: QueryRejectedSupportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
