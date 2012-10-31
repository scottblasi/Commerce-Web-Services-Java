
package com.ipcommerce.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChargeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Lodging"/>
 *     &lt;enumeration value="Restaurant"/>
 *     &lt;enumeration value="GiftShop"/>
 *     &lt;enumeration value="HealthSpa"/>
 *     &lt;enumeration value="BeautyShop"/>
 *     &lt;enumeration value="ConventionFee"/>
 *     &lt;enumeration value="TennisProShop"/>
 *     &lt;enumeration value="GolfProShop"/>
 *     &lt;enumeration value="RetailOther"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChargeType")
@XmlEnum
public enum ChargeType {


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
     *             Lodging.
     *             </summary>
     * 
     */
    @XmlEnumValue("Lodging")
    LODGING("Lodging"),

    /**
     * <summary>
     *             Restaurant.
     *             </summary>
     * 
     */
    @XmlEnumValue("Restaurant")
    RESTAURANT("Restaurant"),

    /**
     * <summary>
     *             Gift Shop.
     *             </summary>
     * 
     */
    @XmlEnumValue("GiftShop")
    GIFT_SHOP("GiftShop"),

    /**
     * <summary>
     *             Health Spa.
     *             </summary>
     * 
     */
    @XmlEnumValue("HealthSpa")
    HEALTH_SPA("HealthSpa"),

    /**
     * <summary>
     *             Beauty Shop.
     *             </summary>
     * 
     */
    @XmlEnumValue("BeautyShop")
    BEAUTY_SHOP("BeautyShop"),

    /**
     * <summary>
     *             Convention Fee.
     *             </summary>
     * 
     */
    @XmlEnumValue("ConventionFee")
    CONVENTION_FEE("ConventionFee"),

    /**
     * <summary>
     *             Tennis/Pro Shop.
     *             </summary>
     * 
     */
    @XmlEnumValue("TennisProShop")
    TENNIS_PRO_SHOP("TennisProShop"),

    /**
     * <summary>
     *             Golf/Pro Shop.
     *             </summary>
     * 
     */
    @XmlEnumValue("GolfProShop")
    GOLF_PRO_SHOP("GolfProShop"),

    /**
     * <summary>
     *             Retail/Other.
     *             </summary>
     * 
     */
    @XmlEnumValue("RetailOther")
    RETAIL_OTHER("RetailOther");
    private final String value;

    ChargeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChargeType fromValue(String v) {
        for (ChargeType c: ChargeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
