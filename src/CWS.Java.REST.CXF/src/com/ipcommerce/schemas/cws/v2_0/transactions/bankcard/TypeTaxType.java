
package com.ipcommerce.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeTaxType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeTaxType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="CityTax"/>
 *     &lt;enumeration value="CountyTax"/>
 *     &lt;enumeration value="CountyParishTax"/>
 *     &lt;enumeration value="EnergyTax"/>
 *     &lt;enumeration value="FederalTax"/>
 *     &lt;enumeration value="EnvironmentalTax"/>
 *     &lt;enumeration value="GoodsServicesTax"/>
 *     &lt;enumeration value="HarmonizedTax"/>
 *     &lt;enumeration value="LuxuryTax"/>
 *     &lt;enumeration value="LocalSalesTax"/>
 *     &lt;enumeration value="MunicipalTax"/>
 *     &lt;enumeration value="OccupancyTax"/>
 *     &lt;enumeration value="OtherTax"/>
 *     &lt;enumeration value="QuebecSalesTax"/>
 *     &lt;enumeration value="RoomTax"/>
 *     &lt;enumeration value="StateLocalSalesTax"/>
 *     &lt;enumeration value="StateProvincialGoodsTax"/>
 *     &lt;enumeration value="StateSalesTax"/>
 *     &lt;enumeration value="StateProvincialTax"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="VAT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeTaxType")
@XmlEnum
public enum TypeTaxType {


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
     *             City Tax.
     *             </summary>
     * 
     */
    @XmlEnumValue("CityTax")
    CITY_TAX("CityTax"),

    /**
     * <summary>
     *             County Tax.
     *             </summary>
     * 
     */
    @XmlEnumValue("CountyTax")
    COUNTY_TAX("CountyTax"),

    /**
     * <summary>
     *             County/Parish Sales Tax.
     *             </summary>
     * 
     */
    @XmlEnumValue("CountyParishTax")
    COUNTY_PARISH_TAX("CountyParishTax"),

    /**
     * <summary>
     *             Energy Tax.
     *             </summary>
     * 
     */
    @XmlEnumValue("EnergyTax")
    ENERGY_TAX("EnergyTax"),

    /**
     * <summary>
     *             Federal Tax.
     *             </summary>
     * 
     */
    @XmlEnumValue("FederalTax")
    FEDERAL_TAX("FederalTax"),

    /**
     * <summary>
     *             Environmental Tax.
     *             </summary>
     * 
     */
    @XmlEnumValue("EnvironmentalTax")
    ENVIRONMENTAL_TAX("EnvironmentalTax"),

    /**
     * <summary>
     *             Goods and Services Tax.
     *             </summary>
     * 
     */
    @XmlEnumValue("GoodsServicesTax")
    GOODS_SERVICES_TAX("GoodsServicesTax"),

    /**
     * <summary>
     *             Harmonized Tax (HST).
     *             </summary>
     * 
     */
    @XmlEnumValue("HarmonizedTax")
    HARMONIZED_TAX("HarmonizedTax"),

    /**
     * <summary>
     *             Luxury Tax.
     *             </summary>
     * 
     */
    @XmlEnumValue("LuxuryTax")
    LUXURY_TAX("LuxuryTax"),

    /**
     * <summary>
     *             Local Sales Tax.
     *             </summary>
     * 
     */
    @XmlEnumValue("LocalSalesTax")
    LOCAL_SALES_TAX("LocalSalesTax"),

    /**
     * <summary>
     *             Municipal Tax.
     *             </summary>
     * 
     */
    @XmlEnumValue("MunicipalTax")
    MUNICIPAL_TAX("MunicipalTax"),

    /**
     * <summary>
     *             Occupancy Tax.
     *             </summary>
     * 
     */
    @XmlEnumValue("OccupancyTax")
    OCCUPANCY_TAX("OccupancyTax"),

    /**
     * <summary>
     *             Other Not Specified Tax.
     *             </summary>
     * 
     */
    @XmlEnumValue("OtherTax")
    OTHER_TAX("OtherTax"),

    /**
     * <summary>
     *             Quebec Sales Tax (QST).
     *             </summary>
     * 
     */
    @XmlEnumValue("QuebecSalesTax")
    QUEBEC_SALES_TAX("QuebecSalesTax"),

    /**
     * <summary>
     *             Room Tax.
     *             </summary>
     * 
     */
    @XmlEnumValue("RoomTax")
    ROOM_TAX("RoomTax"),

    /**
     * <summary>
     *             State and Local Sales Tax.
     *             </summary>
     * 
     */
    @XmlEnumValue("StateLocalSalesTax")
    STATE_LOCAL_SALES_TAX("StateLocalSalesTax"),

    /**
     * <summary>
     *             State or Provincial Tax on Goods.
     *             </summary>
     * 
     */
    @XmlEnumValue("StateProvincialGoodsTax")
    STATE_PROVINCIAL_GOODS_TAX("StateProvincialGoodsTax"),

    /**
     * <summary>
     *             State Sales Tax.
     *             </summary>
     * 
     */
    @XmlEnumValue("StateSalesTax")
    STATE_SALES_TAX("StateSalesTax"),

    /**
     * <summary>
     *             State/Provincial Tax.
     *             </summary>
     * 
     */
    @XmlEnumValue("StateProvincialTax")
    STATE_PROVINCIAL_TAX("StateProvincialTax"),

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
     *             Value Added Tax.
     *             </summary>
     * 
     */
    VAT("VAT");
    private final String value;

    TypeTaxType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeTaxType fromValue(String v) {
        for (TypeTaxType c: TypeTaxType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
