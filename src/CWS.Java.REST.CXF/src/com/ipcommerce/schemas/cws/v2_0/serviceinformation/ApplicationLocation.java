
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationLocation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApplicationLocation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="OnPremises"/>
 *     &lt;enumeration value="OffPremises"/>
 *     &lt;enumeration value="HomeInternet"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ApplicationLocation")
@XmlEnum
public enum ApplicationLocation {


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
     *             Unknown.
     *             </summary>
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * <summary>
     *             On premises.
     *             </summary>
     * 
     */
    @XmlEnumValue("OnPremises")
    ON_PREMISES("OnPremises"),

    /**
     * <summary>
     *             Off premises.
     *             </summary>
     * 
     */
    @XmlEnumValue("OffPremises")
    OFF_PREMISES("OffPremises"),

    /**
     * <summary>
     *             Home/Internet.
     *             </summary>
     * 
     */
    @XmlEnumValue("HomeInternet")
    HOME_INTERNET("HomeInternet");
    private final String value;

    ApplicationLocation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApplicationLocation fromValue(String v) {
        for (ApplicationLocation c: ApplicationLocation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
