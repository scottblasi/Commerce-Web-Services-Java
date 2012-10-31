
package com.ipcommerce.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GoodsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GoodsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="DigitalGoods"/>
 *     &lt;enumeration value="PhysicalGoods"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GoodsType")
@XmlEnum
public enum GoodsType {


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
     *             Digital Goods.
     *             </summary>
     * 
     */
    @XmlEnumValue("DigitalGoods")
    DIGITAL_GOODS("DigitalGoods"),

    /**
     * <summary>
     *             Physical Goods.
     *             </summary>
     * 
     */
    @XmlEnumValue("PhysicalGoods")
    PHYSICAL_GOODS("PhysicalGoods");
    private final String value;

    GoodsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GoodsType fromValue(String v) {
        for (GoodsType c: GoodsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
