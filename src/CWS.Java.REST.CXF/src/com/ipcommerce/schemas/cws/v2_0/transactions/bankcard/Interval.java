
package com.ipcommerce.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Interval.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Interval">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Day"/>
 *     &lt;enumeration value="Week"/>
 *     &lt;enumeration value="Month"/>
 *     &lt;enumeration value="Year"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Interval")
@XmlEnum
public enum Interval {


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
     *             Day.
     *             </summary>
     * 
     */
    @XmlEnumValue("Day")
    DAY("Day"),

    /**
     * <summary>
     *             Week.
     *             </summary>
     * 
     */
    @XmlEnumValue("Week")
    WEEK("Week"),

    /**
     * <summary>
     *             Month.
     *             </summary>
     * 
     */
    @XmlEnumValue("Month")
    MONTH("Month"),

    /**
     * <summary>
     *             Year.
     *             </summary>
     * 
     */
    @XmlEnumValue("Year")
    YEAR("Year");
    private final String value;

    Interval(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Interval fromValue(String v) {
        for (Interval c: Interval.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
