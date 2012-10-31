
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackDataSupportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrackDataSupportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="NotSupported"/>
 *     &lt;enumeration value="Track1"/>
 *     &lt;enumeration value="Track2"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrackDataSupportType")
@XmlEnum
public enum TrackDataSupportType {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),

    /**
     * <summary>
     *             Neither Track1 or Track2 is supported
     *             </summary>
     * 
     */
    @XmlEnumValue("NotSupported")
    NOT_SUPPORTED("NotSupported"),

    /**
     * <summary>
     *             Track1 is supported
     *             </summary>
     * 
     */
    @XmlEnumValue("Track1")
    TRACK_1("Track1"),

    /**
     * <summary>
     *             Track2 is supported
     *             </summary>
     * 
     */
    @XmlEnumValue("Track2")
    TRACK_2("Track2"),

    /**
     * <summary>
     *             Both Track1 and Track2 are supported
     *             </summary>
     * 
     */
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    TrackDataSupportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrackDataSupportType fromValue(String v) {
        for (TrackDataSupportType c: TrackDataSupportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
