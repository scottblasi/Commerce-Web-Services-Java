
package com.ipcommerce.schemas.cws.v2_0.transactions;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeISOCountryCodeA3.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeISOCountryCodeA3">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="AFG"/>
 *     &lt;enumeration value="ALA"/>
 *     &lt;enumeration value="ALB"/>
 *     &lt;enumeration value="DZA"/>
 *     &lt;enumeration value="ASM"/>
 *     &lt;enumeration value="AND"/>
 *     &lt;enumeration value="AGO"/>
 *     &lt;enumeration value="AIA"/>
 *     &lt;enumeration value="ATA"/>
 *     &lt;enumeration value="ATG"/>
 *     &lt;enumeration value="ARG"/>
 *     &lt;enumeration value="ARM"/>
 *     &lt;enumeration value="ABW"/>
 *     &lt;enumeration value="AUS"/>
 *     &lt;enumeration value="AUT"/>
 *     &lt;enumeration value="AZE"/>
 *     &lt;enumeration value="BHS"/>
 *     &lt;enumeration value="BHR"/>
 *     &lt;enumeration value="BGD"/>
 *     &lt;enumeration value="BRB"/>
 *     &lt;enumeration value="BLR"/>
 *     &lt;enumeration value="BEL"/>
 *     &lt;enumeration value="BLZ"/>
 *     &lt;enumeration value="BEN"/>
 *     &lt;enumeration value="BMU"/>
 *     &lt;enumeration value="BTN"/>
 *     &lt;enumeration value="BOL"/>
 *     &lt;enumeration value="BIH"/>
 *     &lt;enumeration value="BWA"/>
 *     &lt;enumeration value="BVT"/>
 *     &lt;enumeration value="BRA"/>
 *     &lt;enumeration value="IOT"/>
 *     &lt;enumeration value="BRN"/>
 *     &lt;enumeration value="BGR"/>
 *     &lt;enumeration value="BFA"/>
 *     &lt;enumeration value="BDI"/>
 *     &lt;enumeration value="KHM"/>
 *     &lt;enumeration value="CMR"/>
 *     &lt;enumeration value="CAN"/>
 *     &lt;enumeration value="CPV"/>
 *     &lt;enumeration value="CYM"/>
 *     &lt;enumeration value="CAF"/>
 *     &lt;enumeration value="TCD"/>
 *     &lt;enumeration value="CHL"/>
 *     &lt;enumeration value="CHN"/>
 *     &lt;enumeration value="CXR"/>
 *     &lt;enumeration value="CCK"/>
 *     &lt;enumeration value="COL"/>
 *     &lt;enumeration value="COM"/>
 *     &lt;enumeration value="COG"/>
 *     &lt;enumeration value="COD"/>
 *     &lt;enumeration value="COK"/>
 *     &lt;enumeration value="CRI"/>
 *     &lt;enumeration value="CIV"/>
 *     &lt;enumeration value="HRV"/>
 *     &lt;enumeration value="CUB"/>
 *     &lt;enumeration value="CYP"/>
 *     &lt;enumeration value="CZE"/>
 *     &lt;enumeration value="DNK"/>
 *     &lt;enumeration value="DJI"/>
 *     &lt;enumeration value="DMA"/>
 *     &lt;enumeration value="DOM"/>
 *     &lt;enumeration value="ECU"/>
 *     &lt;enumeration value="EGY"/>
 *     &lt;enumeration value="SLV"/>
 *     &lt;enumeration value="GNQ"/>
 *     &lt;enumeration value="ERI"/>
 *     &lt;enumeration value="EST"/>
 *     &lt;enumeration value="ETH"/>
 *     &lt;enumeration value="FLK"/>
 *     &lt;enumeration value="FRO"/>
 *     &lt;enumeration value="FJI"/>
 *     &lt;enumeration value="FIN"/>
 *     &lt;enumeration value="FRA"/>
 *     &lt;enumeration value="FXX"/>
 *     &lt;enumeration value="GUF"/>
 *     &lt;enumeration value="PYF"/>
 *     &lt;enumeration value="ATF"/>
 *     &lt;enumeration value="GAB"/>
 *     &lt;enumeration value="GMB"/>
 *     &lt;enumeration value="GEO"/>
 *     &lt;enumeration value="DEU"/>
 *     &lt;enumeration value="GHA"/>
 *     &lt;enumeration value="GIB"/>
 *     &lt;enumeration value="GRC"/>
 *     &lt;enumeration value="GRL"/>
 *     &lt;enumeration value="GRD"/>
 *     &lt;enumeration value="GLP"/>
 *     &lt;enumeration value="GUM"/>
 *     &lt;enumeration value="GTM"/>
 *     &lt;enumeration value="GGY"/>
 *     &lt;enumeration value="GIN"/>
 *     &lt;enumeration value="GNB"/>
 *     &lt;enumeration value="GUY"/>
 *     &lt;enumeration value="HTI"/>
 *     &lt;enumeration value="HMD"/>
 *     &lt;enumeration value="VAT"/>
 *     &lt;enumeration value="HND"/>
 *     &lt;enumeration value="HKG"/>
 *     &lt;enumeration value="HUN"/>
 *     &lt;enumeration value="ISL"/>
 *     &lt;enumeration value="IND"/>
 *     &lt;enumeration value="IDN"/>
 *     &lt;enumeration value="IRN"/>
 *     &lt;enumeration value="IRQ"/>
 *     &lt;enumeration value="IRL"/>
 *     &lt;enumeration value="IMN"/>
 *     &lt;enumeration value="ISR"/>
 *     &lt;enumeration value="ITA"/>
 *     &lt;enumeration value="JAM"/>
 *     &lt;enumeration value="JPN"/>
 *     &lt;enumeration value="JEY"/>
 *     &lt;enumeration value="JOR"/>
 *     &lt;enumeration value="KAZ"/>
 *     &lt;enumeration value="KEN"/>
 *     &lt;enumeration value="KIR"/>
 *     &lt;enumeration value="PRK"/>
 *     &lt;enumeration value="KOR"/>
 *     &lt;enumeration value="KWT"/>
 *     &lt;enumeration value="KGZ"/>
 *     &lt;enumeration value="LAO"/>
 *     &lt;enumeration value="LVA"/>
 *     &lt;enumeration value="LBN"/>
 *     &lt;enumeration value="LSO"/>
 *     &lt;enumeration value="LBR"/>
 *     &lt;enumeration value="LBY"/>
 *     &lt;enumeration value="LIE"/>
 *     &lt;enumeration value="LTU"/>
 *     &lt;enumeration value="LUX"/>
 *     &lt;enumeration value="MAC"/>
 *     &lt;enumeration value="MKD"/>
 *     &lt;enumeration value="MDG"/>
 *     &lt;enumeration value="MWI"/>
 *     &lt;enumeration value="MYS"/>
 *     &lt;enumeration value="MDV"/>
 *     &lt;enumeration value="MLI"/>
 *     &lt;enumeration value="MLT"/>
 *     &lt;enumeration value="MHL"/>
 *     &lt;enumeration value="MTQ"/>
 *     &lt;enumeration value="MRT"/>
 *     &lt;enumeration value="MUS"/>
 *     &lt;enumeration value="MYT"/>
 *     &lt;enumeration value="MEX"/>
 *     &lt;enumeration value="FSM"/>
 *     &lt;enumeration value="MDA"/>
 *     &lt;enumeration value="MCO"/>
 *     &lt;enumeration value="MNG"/>
 *     &lt;enumeration value="MNE"/>
 *     &lt;enumeration value="MSR"/>
 *     &lt;enumeration value="MAR"/>
 *     &lt;enumeration value="MOZ"/>
 *     &lt;enumeration value="MMR"/>
 *     &lt;enumeration value="NAM"/>
 *     &lt;enumeration value="NRU"/>
 *     &lt;enumeration value="NPL"/>
 *     &lt;enumeration value="NLD"/>
 *     &lt;enumeration value="ANT"/>
 *     &lt;enumeration value="NCL"/>
 *     &lt;enumeration value="NZL"/>
 *     &lt;enumeration value="NIC"/>
 *     &lt;enumeration value="NER"/>
 *     &lt;enumeration value="NGA"/>
 *     &lt;enumeration value="NIU"/>
 *     &lt;enumeration value="NFK"/>
 *     &lt;enumeration value="MNP"/>
 *     &lt;enumeration value="NOR"/>
 *     &lt;enumeration value="OMN"/>
 *     &lt;enumeration value="PAK"/>
 *     &lt;enumeration value="PLW"/>
 *     &lt;enumeration value="PSE"/>
 *     &lt;enumeration value="PAN"/>
 *     &lt;enumeration value="PNG"/>
 *     &lt;enumeration value="PRY"/>
 *     &lt;enumeration value="PER"/>
 *     &lt;enumeration value="PHL"/>
 *     &lt;enumeration value="PCN"/>
 *     &lt;enumeration value="POL"/>
 *     &lt;enumeration value="PRT"/>
 *     &lt;enumeration value="PRI"/>
 *     &lt;enumeration value="QAT"/>
 *     &lt;enumeration value="REU"/>
 *     &lt;enumeration value="ROU"/>
 *     &lt;enumeration value="RUS"/>
 *     &lt;enumeration value="RWA"/>
 *     &lt;enumeration value="SHN"/>
 *     &lt;enumeration value="KNA"/>
 *     &lt;enumeration value="LCA"/>
 *     &lt;enumeration value="SPM"/>
 *     &lt;enumeration value="VCT"/>
 *     &lt;enumeration value="WSM"/>
 *     &lt;enumeration value="SMR"/>
 *     &lt;enumeration value="STP"/>
 *     &lt;enumeration value="SAU"/>
 *     &lt;enumeration value="SEN"/>
 *     &lt;enumeration value="SRB"/>
 *     &lt;enumeration value="SCG"/>
 *     &lt;enumeration value="SYC"/>
 *     &lt;enumeration value="SLE"/>
 *     &lt;enumeration value="SGP"/>
 *     &lt;enumeration value="SVK"/>
 *     &lt;enumeration value="SVN"/>
 *     &lt;enumeration value="SLB"/>
 *     &lt;enumeration value="SOM"/>
 *     &lt;enumeration value="ZAF"/>
 *     &lt;enumeration value="SGS"/>
 *     &lt;enumeration value="ESP"/>
 *     &lt;enumeration value="LKA"/>
 *     &lt;enumeration value="SDN"/>
 *     &lt;enumeration value="SUR"/>
 *     &lt;enumeration value="SJM"/>
 *     &lt;enumeration value="SWZ"/>
 *     &lt;enumeration value="SWE"/>
 *     &lt;enumeration value="CHE"/>
 *     &lt;enumeration value="SYR"/>
 *     &lt;enumeration value="TWN"/>
 *     &lt;enumeration value="TJK"/>
 *     &lt;enumeration value="TZA"/>
 *     &lt;enumeration value="THA"/>
 *     &lt;enumeration value="TLS"/>
 *     &lt;enumeration value="TGO"/>
 *     &lt;enumeration value="TKL"/>
 *     &lt;enumeration value="TMP"/>
 *     &lt;enumeration value="TON"/>
 *     &lt;enumeration value="TTO"/>
 *     &lt;enumeration value="TUN"/>
 *     &lt;enumeration value="TUR"/>
 *     &lt;enumeration value="TKM"/>
 *     &lt;enumeration value="TCA"/>
 *     &lt;enumeration value="TUV"/>
 *     &lt;enumeration value="UGA"/>
 *     &lt;enumeration value="UKR"/>
 *     &lt;enumeration value="ARE"/>
 *     &lt;enumeration value="GBR"/>
 *     &lt;enumeration value="USA"/>
 *     &lt;enumeration value="UMI"/>
 *     &lt;enumeration value="URY"/>
 *     &lt;enumeration value="UZB"/>
 *     &lt;enumeration value="VUT"/>
 *     &lt;enumeration value="VEN"/>
 *     &lt;enumeration value="VNM"/>
 *     &lt;enumeration value="VGB"/>
 *     &lt;enumeration value="VIR"/>
 *     &lt;enumeration value="WLF"/>
 *     &lt;enumeration value="ESH"/>
 *     &lt;enumeration value="YEM"/>
 *     &lt;enumeration value="YUG"/>
 *     &lt;enumeration value="ZMB"/>
 *     &lt;enumeration value="ZWE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeISOCountryCodeA3")
@XmlEnum
public enum TypeISOCountryCodeA3 {


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
     *             AFG - AF - 004 - Afghanistan
     *             </summary>
     * 
     */
    AFG("AFG"),

    /**
     * <summary>
     *             ALA - AX - 248 - Åland Islands
     *             </summary>
     * 
     */
    ALA("ALA"),

    /**
     * <summary>
     *             ALB - AL - 008 - Albania
     *             </summary>
     * 
     */
    ALB("ALB"),

    /**
     * <summary>
     *             DZA - DZ - 012 - Algeria
     *             </summary>
     * 
     */
    DZA("DZA"),

    /**
     * <summary>
     *             ASM - AS - 016 - American Samoa
     *             </summary>
     * 
     */
    ASM("ASM"),

    /**
     * <summary>
     *             AND - AD - 020 - Andorra
     *             </summary>
     * 
     */
    AND("AND"),

    /**
     * <summary>
     *             AGO - AO - 024 - Angola
     *             </summary>
     * 
     */
    AGO("AGO"),

    /**
     * <summary>
     *             AIA - AI - 660 - Anguilla
     *             </summary>
     * 
     */
    AIA("AIA"),

    /**
     * <summary>
     *             ATA - AQ - 010 - Antarctica
     *             </summary>
     * 
     */
    ATA("ATA"),

    /**
     * <summary>
     *             ATG - AG - 028 - Antigua and Barbuda
     *             </summary>
     * 
     */
    ATG("ATG"),

    /**
     * <summary>
     *             ARG - AR - 032 - Argentina
     *             </summary>
     * 
     */
    ARG("ARG"),

    /**
     * <summary>
     *             ARM - AM - 051 - Armenia
     *             </summary>
     * 
     */
    ARM("ARM"),

    /**
     * <summary>
     *             ABW - AW - 533 - Aruba
     *             </summary>
     * 
     */
    ABW("ABW"),

    /**
     * <summary>
     *             AUS - AU - 036 - Australia
     *             </summary>
     * 
     */
    AUS("AUS"),

    /**
     * <summary>
     *             AUT - AT - 040 - Austria
     *             </summary>
     * 
     */
    AUT("AUT"),

    /**
     * <summary>
     *             AZE - AZ - 031 - Azerbaijan
     *             </summary>
     * 
     */
    AZE("AZE"),

    /**
     * <summary>
     *             BHS - BS - 044 - Bahamas
     *             </summary>
     * 
     */
    BHS("BHS"),

    /**
     * <summary>
     *             BHR - BH - 048 - Bahrain
     *             </summary>
     * 
     */
    BHR("BHR"),

    /**
     * <summary>
     *             BGD - BD - 050 - Bangladesh
     *             </summary>
     * 
     */
    BGD("BGD"),

    /**
     * <summary>
     *             BRB - BB - 052 - Barbados
     *             </summary>
     * 
     */
    BRB("BRB"),

    /**
     * <summary>
     *             BLR - BY - 112 - Belarus
     *             </summary>
     * 
     */
    BLR("BLR"),

    /**
     * <summary>
     *             BEL - BE - 056 - Belgium
     *             </summary>
     * 
     */
    BEL("BEL"),

    /**
     * <summary>
     *             BLZ - BZ - 084 - Belize
     *             </summary>
     * 
     */
    BLZ("BLZ"),

    /**
     * <summary>
     *             BEN - BJ - 204 - Benin
     *             </summary>
     * 
     */
    BEN("BEN"),

    /**
     * <summary>
     *             BMU - BM - 060 - Bermuda
     *             </summary>
     * 
     */
    BMU("BMU"),

    /**
     * <summary>
     *             BTN - BT - 064 - Bhutan
     *             </summary>
     * 
     */
    BTN("BTN"),

    /**
     * <summary>
     *             BOL - BO - 068 - Bolivia
     *             </summary>
     * 
     */
    BOL("BOL"),

    /**
     * <summary>
     *             BIH - BA - 070 - Bosnia and Herzegovina
     *             </summary>
     * 
     */
    BIH("BIH"),

    /**
     * <summary>
     *             BWA - BW - 072 - Botswana
     *             </summary>
     * 
     */
    BWA("BWA"),

    /**
     * <summary>
     *             BVT - BV - 074 - Bouvet Island
     *             </summary>
     * 
     */
    BVT("BVT"),

    /**
     * <summary>
     *             BRA - BR - 076 - Brazil
     *             </summary>
     * 
     */
    BRA("BRA"),

    /**
     * <summary>
     *             IOT - IO - 086 - British Indian Ocean Territory
     *             </summary>
     * 
     */
    IOT("IOT"),

    /**
     * <summary>
     *             BRN - BN - 096 - Brunei Darussalam
     *             </summary>
     * 
     */
    BRN("BRN"),

    /**
     * <summary>
     *             BGR - BG - 100 - Bulgaria
     *             </summary>
     * 
     */
    BGR("BGR"),

    /**
     * <summary>
     *             BFA - BF - 854 - Burkina Faso
     *             </summary>
     * 
     */
    BFA("BFA"),

    /**
     * <summary>
     *             BDI - BI - 108 - Burundi
     *             </summary>
     * 
     */
    BDI("BDI"),

    /**
     * <summary>
     *             KHM - KH - 116 - Cambodia
     *             </summary>
     * 
     */
    KHM("KHM"),

    /**
     * <summary>
     *             CMR - CM - 120 - Cameroon
     *             </summary>
     * 
     */
    CMR("CMR"),

    /**
     * <summary>
     *             CAN - CA - 124 - Canada
     *             </summary>
     * 
     */
    CAN("CAN"),

    /**
     * <summary>
     *             CPV - CV - 132 - Cape Verde
     *             </summary>
     * 
     */
    CPV("CPV"),

    /**
     * <summary>
     *             CYM - KY - 136 - Cayman Islands
     *             </summary>
     * 
     */
    CYM("CYM"),

    /**
     * <summary>
     *             CAF - CF - 140 - Central African Republic
     *             </summary>
     * 
     */
    CAF("CAF"),

    /**
     * <summary>
     *             TCD - TD - 148 - Chad
     *             </summary>
     * 
     */
    TCD("TCD"),

    /**
     * <summary>
     *             CHL - CL - 152 - Chile
     *             </summary>
     * 
     */
    CHL("CHL"),

    /**
     * <summary>
     *             CHN - CN - 156 - China
     *             </summary>
     * 
     */
    CHN("CHN"),

    /**
     * <summary>
     *             CXR - CX - 162 - Christmas Island
     *             </summary>
     * 
     */
    CXR("CXR"),

    /**
     * <summary>
     *             CCK - CC - 166 - Cocos (Keeling) Islands
     *             </summary>
     * 
     */
    CCK("CCK"),

    /**
     * <summary>
     *             COL - CO - 170 - Colombia
     *             </summary>
     * 
     */
    COL("COL"),

    /**
     * <summary>
     *             COM - KM - 174 - Comoros
     *             </summary>
     * 
     */
    COM("COM"),

    /**
     * <summary>
     *             COG - CG - 178 - Congo
     *             </summary>
     * 
     */
    COG("COG"),

    /**
     * <summary>
     *             COD - CD - 180 - Congo, Democratic Republic of the
     *             </summary>
     * 
     */
    COD("COD"),

    /**
     * <summary>
     *             COK - CK - 184 - Cook Islands
     *             </summary>
     * 
     */
    COK("COK"),

    /**
     * <summary>
     *             CRI - CR - 188 - Costa Rica
     *             </summary>
     * 
     */
    CRI("CRI"),

    /**
     * <summary>
     *             CIV - CI - 384 - Côte d'Ivoire
     *             </summary>
     * 
     */
    CIV("CIV"),

    /**
     * <summary>
     *             HRV - HR - 191 - Croatia
     *             </summary>
     * 
     */
    HRV("HRV"),

    /**
     * <summary>
     *             CUB - CU - 192 - Cuba
     *             </summary>
     * 
     */
    CUB("CUB"),

    /**
     * <summary>
     *             CYP - CY - 196 - Cyprus
     *             </summary>
     * 
     */
    CYP("CYP"),

    /**
     * <summary>
     *             CZE - CZ - 203 - Czech Republic
     *             </summary>
     * 
     */
    CZE("CZE"),

    /**
     * <summary>
     *             DNK - DK - 208 - Denmark
     *             </summary>
     * 
     */
    DNK("DNK"),

    /**
     * <summary>
     *             DJI - DJ - 262 - Djibouti
     *             </summary>
     * 
     */
    DJI("DJI"),

    /**
     * <summary>
     *             DMA - DM - 212 - Dominica
     *             </summary>
     * 
     */
    DMA("DMA"),

    /**
     * <summary>
     *             DOM - DO - 214 - Dominican Republic
     *             </summary>
     * 
     */
    DOM("DOM"),

    /**
     * <summary>
     *             ECU - EC - 218 - Ecuador
     *             </summary>
     * 
     */
    ECU("ECU"),

    /**
     * <summary>
     *             EGY - EG - 818 - Egypt
     *             </summary>
     * 
     */
    EGY("EGY"),

    /**
     * <summary>
     *             SLV - SV - 222 - El Salvador
     *             </summary>
     * 
     */
    SLV("SLV"),

    /**
     * <summary>
     *             GNQ - GQ - 226 - Equatorial Guinea
     *             </summary>
     * 
     */
    GNQ("GNQ"),

    /**
     * <summary>
     *             ERI - ER - 232 - Eritrea
     *             </summary>
     * 
     */
    ERI("ERI"),

    /**
     * <summary>
     *             EST - EE - 233 - Estonia
     *             </summary>
     * 
     */
    EST("EST"),

    /**
     * <summary>
     *             ETH - ET - 231 - Ethiopia
     *             </summary>
     * 
     */
    ETH("ETH"),

    /**
     * <summary>
     *             FLK - FK - 238 - Falkland Islands (Malvinas)
     *             </summary>
     * 
     */
    FLK("FLK"),

    /**
     * <summary>
     *             FRO - FO - 234 - Faroe Islands
     *             </summary>
     * 
     */
    FRO("FRO"),

    /**
     * <summary>
     *             FJI - FJ - 242 - Fiji
     *             </summary>
     * 
     */
    FJI("FJI"),

    /**
     * <summary>
     *             FIN - FI - 246 - Finland
     *             </summary>
     * 
     */
    FIN("FIN"),

    /**
     * <summary>
     *             FRA - FR - 250 - France
     *             </summary>
     * 
     */
    FRA("FRA"),

    /**
     * <summary>
     *             FXX - FX - 249 - France, Metropolitan
     *             </summary>
     * 
     */
    FXX("FXX"),

    /**
     * <summary>
     *             GUF - GF - 254 - French Guiana
     *             </summary>
     * 
     */
    GUF("GUF"),

    /**
     * <summary>
     *             PYF - PF - 258 - French Polynesia
     *             </summary>
     * 
     */
    PYF("PYF"),

    /**
     * <summary>
     *             ATF - TF - 260 - French Southern Territories
     *             </summary>
     * 
     */
    ATF("ATF"),

    /**
     * <summary>
     *             GAB - GA - 266 - Gabon
     *             </summary>
     * 
     */
    GAB("GAB"),

    /**
     * <summary>
     *             GMB - GM - 270 - Gambia
     *             </summary>
     * 
     */
    GMB("GMB"),

    /**
     * <summary>
     *             GEO - GE - 268 - Georgia
     *             </summary>
     * 
     */
    GEO("GEO"),

    /**
     * <summary>
     *             DEU - DE - 276 - Germany
     *             </summary>
     * 
     */
    DEU("DEU"),

    /**
     * <summary>
     *             GHA - GH - 288 - Ghana
     *             </summary>
     * 
     */
    GHA("GHA"),

    /**
     * <summary>
     *             GIB - GI - 292 - Gibraltar
     *             </summary>
     * 
     */
    GIB("GIB"),

    /**
     * <summary>
     *             GRC - GR - 300 - Greece
     *             </summary>
     * 
     */
    GRC("GRC"),

    /**
     * <summary>
     *             GRL - GL - 304 - Greenland
     *             </summary>
     * 
     */
    GRL("GRL"),

    /**
     * <summary>
     *             GRD - GD - 308 - Grenada
     *             </summary>
     * 
     */
    GRD("GRD"),

    /**
     * <summary>
     *             GLP - GP - 312 - Guadeloupe
     *             </summary>
     * 
     */
    GLP("GLP"),

    /**
     * <summary>
     *             GUM - GU - 316 - Guam
     *             </summary>
     * 
     */
    GUM("GUM"),

    /**
     * <summary>
     *             GTM - GT - 320 - Guatemala
     *             </summary>
     * 
     */
    GTM("GTM"),

    /**
     * <summary>
     *             GGY - GG - 831 - Guernsey
     *             </summary>
     * 
     */
    GGY("GGY"),

    /**
     * <summary>
     *             GIN - GN - 324 - Guinea
     *             </summary>
     * 
     */
    GIN("GIN"),

    /**
     * <summary>
     *             GNB - GW - 624 - Guinea-Bissau
     *             </summary>
     * 
     */
    GNB("GNB"),

    /**
     * <summary>
     *             GUY - GY - 328 - Guyana
     *             </summary>
     * 
     */
    GUY("GUY"),

    /**
     * <summary>
     *             HTI - HT - 332 - Haiti
     *             </summary>
     * 
     */
    HTI("HTI"),

    /**
     * <summary>
     *             HMD - HM - 334 - Heard Island and McDonald Islands
     *             </summary>
     * 
     */
    HMD("HMD"),

    /**
     * <summary>
     *             VAT - VA - 336 - Holy See (Vatican City State)
     *             </summary>
     * 
     */
    VAT("VAT"),

    /**
     * <summary>
     *             HND - HN - 340 - Honduras
     *             </summary>
     * 
     */
    HND("HND"),

    /**
     * <summary>
     *             HKG - HK - 344 - Hong Kong
     *             </summary>
     * 
     */
    HKG("HKG"),

    /**
     * <summary>
     *             HUN - HU - 348 - Hungary
     *             </summary>
     * 
     */
    HUN("HUN"),

    /**
     * <summary>
     *             ISL - IS - 352 - Iceland
     *             </summary>
     * 
     */
    ISL("ISL"),

    /**
     * <summary>
     *             IND - IN - 356 - India
     *             </summary>
     * 
     */
    IND("IND"),

    /**
     * <summary>
     *             IDN - ID - 360 - Indonesia
     *             </summary>
     * 
     */
    IDN("IDN"),

    /**
     * <summary>
     *             IRN - IR - 364 - Iran, Islamic Republic of
     *             </summary>
     * 
     */
    IRN("IRN"),

    /**
     * <summary>
     *             IRQ - IQ - 368 - Iraq
     *             </summary>
     * 
     */
    IRQ("IRQ"),

    /**
     * <summary>
     *             IRL - IE - 372 - Ireland
     *             </summary>
     * 
     */
    IRL("IRL"),

    /**
     * <summary>
     *             IMN - IM - 833 - Isle of Man
     *             </summary>
     * 
     */
    IMN("IMN"),

    /**
     * <summary>
     *             ISR - IL - 376 - Israel
     *             </summary>
     * 
     */
    ISR("ISR"),

    /**
     * <summary>
     *             ITA - IT - 380 - Italy
     *             </summary>
     * 
     */
    ITA("ITA"),

    /**
     * <summary>
     *             JAM - JM - 388 - Jamaica
     *             </summary>
     * 
     */
    JAM("JAM"),

    /**
     * <summary>
     *             JPN - JP - 392 - Japan
     *             </summary>
     * 
     */
    JPN("JPN"),

    /**
     * <summary>
     *             JEY - JE - 832 - Jersey
     *             </summary>
     * 
     */
    JEY("JEY"),

    /**
     * <summary>
     *             JOR - JO - 400 - Jordan
     *             </summary>
     * 
     */
    JOR("JOR"),

    /**
     * <summary>
     *             KAZ - KZ - 398 - Kazakhstan
     *             </summary>
     * 
     */
    KAZ("KAZ"),

    /**
     * <summary>
     *             KEN - KE - 404 - Kenya
     *             </summary>
     * 
     */
    KEN("KEN"),

    /**
     * <summary>
     *             KIR - KI - 296 - Kiribati
     *             </summary>
     * 
     */
    KIR("KIR"),

    /**
     * <summary>
     *             PRK - KP - 408 - Korea, Democratic People's Republic of
     *             </summary>
     * 
     */
    PRK("PRK"),

    /**
     * <summary>
     *             KOR - KR - 410 - Korea, Republic of
     *             </summary>
     * 
     */
    KOR("KOR"),

    /**
     * <summary>
     *             KWT - KW - 414 - Kuwait
     *             </summary>
     * 
     */
    KWT("KWT"),

    /**
     * <summary>
     *             KGZ - KG - 417 - Kyrgyzstan
     *             </summary>
     * 
     */
    KGZ("KGZ"),

    /**
     * <summary>
     *             LAO - LA - 418 - Lao People's Democratic Republic
     *             </summary>
     * 
     */
    LAO("LAO"),

    /**
     * <summary>
     *             LVA - LV - 428 - Latvia
     *             </summary>
     * 
     */
    LVA("LVA"),

    /**
     * <summary>
     *             LBN - LB - 422 - Lebanon
     *             </summary>
     * 
     */
    LBN("LBN"),

    /**
     * <summary>
     *             LSO - LS - 426 - Lesotho
     *             </summary>
     * 
     */
    LSO("LSO"),

    /**
     * <summary>
     *             LBR - LR - 430 - Liberia
     *             </summary>
     * 
     */
    LBR("LBR"),

    /**
     * <summary>
     *             LBY - LY - 434 - Libyan Arab Jamahiriya
     *             </summary>
     * 
     */
    LBY("LBY"),

    /**
     * <summary>
     *             LIE - LI - 438 - Liechtenstein
     *             </summary>
     * 
     */
    LIE("LIE"),

    /**
     * <summary>
     *             LTU - LT - 440 - Lithuania
     *             </summary>
     * 
     */
    LTU("LTU"),

    /**
     * <summary>
     *             LUX - LU - 442 - Luxembourg
     *             </summary>
     * 
     */
    LUX("LUX"),

    /**
     * <summary>
     *             MAC - MO - 446 - Macao
     *             </summary>
     * 
     */
    MAC("MAC"),

    /**
     * <summary>
     *             MKD - MK - 807 - Macedonia, the former Yugoslav Republic of
     *             </summary>
     * 
     */
    MKD("MKD"),

    /**
     * <summary>
     *             MDG - MG - 450 - Madagascar
     *             </summary>
     * 
     */
    MDG("MDG"),

    /**
     * <summary>
     *             MWI - MW - 454 - Malawi
     *             </summary>
     * 
     */
    MWI("MWI"),

    /**
     * <summary>
     *             MYS - MY - 458 - Malaysia
     *             </summary>
     * 
     */
    MYS("MYS"),

    /**
     * <summary>
     *             MDV - MV - 462 - Maldives
     *             </summary>
     * 
     */
    MDV("MDV"),

    /**
     * <summary>
     *             MLI - ML - 466 - Mali
     *             </summary>
     * 
     */
    MLI("MLI"),

    /**
     * <summary>
     *             MLT - MT - 470 - Malta
     *             </summary>
     * 
     */
    MLT("MLT"),

    /**
     * <summary>
     *             MHL - MH - 584 - Marshall Islands
     *             </summary>
     * 
     */
    MHL("MHL"),

    /**
     * <summary>
     *             MTQ - MQ - 474 - Martinique
     *             </summary>
     * 
     */
    MTQ("MTQ"),

    /**
     * <summary>
     *             MRT - MR - 478 - Mauritania
     *             </summary>
     * 
     */
    MRT("MRT"),

    /**
     * <summary>
     *             MUS - MU - 480 - Mauritius
     *             </summary>
     * 
     */
    MUS("MUS"),

    /**
     * <summary>
     *             MYT - YT - 175 - Mayotte
     *             </summary>
     * 
     */
    MYT("MYT"),

    /**
     * <summary>
     *             MEX - MX - 484 - Mexico
     *             </summary>
     * 
     */
    MEX("MEX"),

    /**
     * <summary>
     *             FSM - FM - 583 - Micronesia, Federated States of
     *             </summary>
     * 
     */
    FSM("FSM"),

    /**
     * <summary>
     *             MDA - MD - 498 - Moldova, Republic of
     *             </summary>
     * 
     */
    MDA("MDA"),

    /**
     * <summary>
     *             MCO - MC - 492 - Monaco
     *             </summary>
     * 
     */
    MCO("MCO"),

    /**
     * <summary>
     *             MNG - MN - 496 - Mongolia
     *             </summary>
     * 
     */
    MNG("MNG"),

    /**
     * <summary>
     *             MNE - ME - 499 - Montenegro
     *             </summary>
     * 
     */
    MNE("MNE"),

    /**
     * <summary>
     *             MSR - MS - 500 - Montserrat
     *             </summary>
     * 
     */
    MSR("MSR"),

    /**
     * <summary>
     *             MAR - MA - 504 - Morocco
     *             </summary>
     * 
     */
    MAR("MAR"),

    /**
     * <summary>
     *             MOZ - MZ - 508 - Mozambique
     *             </summary>
     * 
     */
    MOZ("MOZ"),

    /**
     * <summary>
     *             MMR - MM - 104 - Myanmar
     *             </summary>
     * 
     */
    MMR("MMR"),

    /**
     * <summary>
     *             NAM - NA - 516 - Namibia
     *             </summary>
     * 
     */
    NAM("NAM"),

    /**
     * <summary>
     *             NRU - NR - 520 - Nauru
     *             </summary>
     * 
     */
    NRU("NRU"),

    /**
     * <summary>
     *             NPL - NP - 524 - Nepal
     *             </summary>
     * 
     */
    NPL("NPL"),

    /**
     * <summary>
     *             NLD - NL - 528 - Netherlands
     *             </summary>
     * 
     */
    NLD("NLD"),

    /**
     * <summary>
     *             ANT - AN - 530 - Netherlands Antilles
     *             </summary>
     * 
     */
    ANT("ANT"),

    /**
     * <summary>
     *             NCL - NC - 540 - New Caledonia
     *             </summary>
     * 
     */
    NCL("NCL"),

    /**
     * <summary>
     *             NZL - NZ - 554 - New Zealand
     *             </summary>
     * 
     */
    NZL("NZL"),

    /**
     * <summary>
     *             NIC - NI - 558 - Nicaragua
     *             </summary>
     * 
     */
    NIC("NIC"),

    /**
     * <summary>
     *             NER - NE - 562 - Niger
     *             </summary>
     * 
     */
    NER("NER"),

    /**
     * <summary>
     *             NGA - NG - 566 - Nigeria
     *             </summary>
     * 
     */
    NGA("NGA"),

    /**
     * <summary>
     *             NIU - NU - 570 - Niue
     *             </summary>
     * 
     */
    NIU("NIU"),

    /**
     * <summary>
     *             NFK - NF - 574 - Norfolk Island
     *             </summary>
     * 
     */
    NFK("NFK"),

    /**
     * <summary>
     *             MNP - MP - 580 - Northern Mariana Islands
     *             </summary>
     * 
     */
    MNP("MNP"),

    /**
     * <summary>
     *             NOR - NO - 578 - Norway
     *             </summary>
     * 
     */
    NOR("NOR"),

    /**
     * <summary>
     *             OMN - OM - 512 - Oman
     *             </summary>
     * 
     */
    OMN("OMN"),

    /**
     * <summary>
     *             PAK - PK - 586 - Pakistan
     *             </summary>
     * 
     */
    PAK("PAK"),

    /**
     * <summary>
     *             PLW - PW - 585 - Palau
     *             </summary>
     * 
     */
    PLW("PLW"),

    /**
     * <summary>
     *             PSE - PS - 275 - Palestinian Territory, Occupied
     *             </summary>
     * 
     */
    PSE("PSE"),

    /**
     * <summary>
     *             PAN - PA - 591 - Panama
     *             </summary>
     * 
     */
    PAN("PAN"),

    /**
     * <summary>
     *             PNG - PG - 598 - Papua New Guinea
     *             </summary>
     * 
     */
    PNG("PNG"),

    /**
     * <summary>
     *             PRY - PY - 600 - Paraguay
     *             </summary>
     * 
     */
    PRY("PRY"),

    /**
     * <summary>
     *             PER - PE - 604 - Peru
     *             </summary>
     * 
     */
    PER("PER"),

    /**
     * <summary>
     *             PHL - PH - 608 - Philippines
     *             </summary>
     * 
     */
    PHL("PHL"),

    /**
     * <summary>
     *             PCN - PN - 612 - Pitcairn
     *             </summary>
     * 
     */
    PCN("PCN"),

    /**
     * <summary>
     *             POL - PL - 616 - Poland
     *             </summary>
     * 
     */
    POL("POL"),

    /**
     * <summary>
     *             PRT - PT - 620 - Portugal
     *             </summary>
     * 
     */
    PRT("PRT"),

    /**
     * <summary>
     *             PRI - PR - 630 - Puerto Rico
     *             </summary>
     * 
     */
    PRI("PRI"),

    /**
     * <summary>
     *             QAT - QA - 634 - Qatar
     *             </summary>
     * 
     */
    QAT("QAT"),

    /**
     * <summary>
     *             REU - RE - 638 - Réunion
     *             </summary>
     * 
     */
    REU("REU"),

    /**
     * <summary>
     *             ROU - RO - 642 - Romania
     *             </summary>
     * 
     */
    ROU("ROU"),

    /**
     * <summary>
     *             RUS - RU - 643 - Russian Federation
     *             </summary>
     * 
     */
    RUS("RUS"),

    /**
     * <summary>
     *             RWA - RW - 646 - Rwanda
     *             </summary>
     * 
     */
    RWA("RWA"),

    /**
     * <summary>
     *             SHN - SH - 654 - Saint Helena
     *             </summary>
     * 
     */
    SHN("SHN"),

    /**
     * <summary>
     *             KNA - KN - 659 - Saint Kitts and Nevis
     *             </summary>
     * 
     */
    KNA("KNA"),

    /**
     * <summary>
     *             LCA - LC - 662 - Saint Lucia
     *             </summary>
     * 
     */
    LCA("LCA"),

    /**
     * <summary>
     *             SPM - PM - 666 - Saint Pierre and Miquelon
     *             </summary>
     * 
     */
    SPM("SPM"),

    /**
     * <summary>
     *             VCT - VC - 670 - Saint Vincent and the Grenadines
     *             </summary>
     * 
     */
    VCT("VCT"),

    /**
     * <summary>
     *             WSM - WS - 882 - Samoa
     *             </summary>
     * 
     */
    WSM("WSM"),

    /**
     * <summary>
     *             SMR - SM - 674 - San Marino
     *             </summary>
     * 
     */
    SMR("SMR"),

    /**
     * <summary>
     *             STP - ST - 678 - Sao Tome and Principe
     *             </summary>
     * 
     */
    STP("STP"),

    /**
     * <summary>
     *             SAU - SA - 682 - Saudi Arabia
     *             </summary>
     * 
     */
    SAU("SAU"),

    /**
     * <summary>
     *             SEN - SN - 686 - Senegal
     *             </summary>
     * 
     */
    SEN("SEN"),

    /**
     * <summary>
     *             SRB - RS - 688 - Serbia
     *             </summary>
     * 
     */
    SRB("SRB"),

    /**
     * <summary>
     *             SCG - CS - 891 - Serbia and Montenegro
     *             </summary>
     * 
     */
    SCG("SCG"),

    /**
     * <summary>
     *             SYC - SC - 690 - Seychelles
     *             </summary>
     * 
     */
    SYC("SYC"),

    /**
     * <summary>
     *             SLE - SL - 694 - Sierra Leone
     *             </summary>
     * 
     */
    SLE("SLE"),

    /**
     * <summary>
     *             SGP - SG - 702 - Singapore
     *             </summary>
     * 
     */
    SGP("SGP"),

    /**
     * <summary>
     *             SVK - SK - 703 - Slovakia
     *             </summary>
     * 
     */
    SVK("SVK"),

    /**
     * <summary>
     *             SVN - SI - 705 - Slovenia
     *             </summary>
     * 
     */
    SVN("SVN"),

    /**
     * <summary>
     *             SLB - SB - 090 - Solomon Islands
     *             </summary>
     * 
     */
    SLB("SLB"),

    /**
     * <summary>
     *             SOM - SO - 706 - Somalia
     *             </summary>
     * 
     */
    SOM("SOM"),

    /**
     * <summary>
     *             ZAF - ZA - 710 - South Africa
     *             </summary>
     * 
     */
    ZAF("ZAF"),

    /**
     * <summary>
     *             SGS - GS - 239 - South Georgia and the South Sandwich Islands
     *             </summary>
     * 
     */
    SGS("SGS"),

    /**
     * <summary>
     *             ESP - ES - 724 - Spain
     *             </summary>
     * 
     */
    ESP("ESP"),

    /**
     * <summary>
     *             LKA - LK - 144 - Sri Lanka
     *             </summary>
     * 
     */
    LKA("LKA"),

    /**
     * <summary>
     *             SDN - SD - 736 - Sudan
     *             </summary>
     * 
     */
    SDN("SDN"),

    /**
     * <summary>
     *             SUR - SR - 740 - Suriname
     *             </summary>
     * 
     */
    SUR("SUR"),

    /**
     * <summary>
     *             SJM - SJ - 744 - Svalbard and Jan Mayen
     *             </summary>
     * 
     */
    SJM("SJM"),

    /**
     * <summary>
     *             SWZ - SZ - 748 - Swaziland
     *             </summary>
     * 
     */
    SWZ("SWZ"),

    /**
     * <summary>
     *             SWE - SE - 752 - Sweden
     *             </summary>
     * 
     */
    SWE("SWE"),

    /**
     * <summary>
     *             CHE - CH - 756 - Switzerland
     *             </summary>
     * 
     */
    CHE("CHE"),

    /**
     * <summary>
     *             SYR - SY - 760 - Syrian Arab Republic
     *             </summary>
     * 
     */
    SYR("SYR"),

    /**
     * <summary>
     *             TWN - TW - 158 - Taiwan, Province of China
     *             </summary>
     * 
     */
    TWN("TWN"),

    /**
     * <summary>
     *             TJK - TJ - 762 - Tajikistan
     *             </summary>
     * 
     */
    TJK("TJK"),

    /**
     * <summary>
     *             TZA - TZ - 834 - Tanzania, United Republic of
     *             </summary>
     * 
     */
    TZA("TZA"),

    /**
     * <summary>
     *             THA - TH - 764 - Thailand
     *             </summary>
     * 
     */
    THA("THA"),

    /**
     * <summary>
     *             TLS - TL - 626 - Timor-Leste
     *             </summary>
     * 
     */
    TLS("TLS"),

    /**
     * <summary>
     *             TGO - TG - 768 - Togo
     *             </summary>
     * 
     */
    TGO("TGO"),

    /**
     * <summary>
     *             TKL - TK - 772 - Tokelau
     *             </summary>
     * 
     */
    TKL("TKL"),

    /**
     * <summary>
     *             TMP - TP - 626 - East Timor
     *             </summary>
     * 
     */
    TMP("TMP"),

    /**
     * <summary>
     *             TON - TO - 776 - Tonga
     *             </summary>
     * 
     */
    TON("TON"),

    /**
     * <summary>
     *             TTO - TT - 780 - Trinidad and Tobago
     *             </summary>
     * 
     */
    TTO("TTO"),

    /**
     * <summary>
     *             TUN - TN - 788 - Tunisia
     *             </summary>
     * 
     */
    TUN("TUN"),

    /**
     * <summary>
     *             TUR - TR - 792 - Turkey
     *             </summary>
     * 
     */
    TUR("TUR"),

    /**
     * <summary>
     *             TKM - TM - 795 - Turkmenistan
     *             </summary>
     * 
     */
    TKM("TKM"),

    /**
     * <summary>
     *             TCA - TC - 796 - Turks and Caicos Islands
     *             </summary>
     * 
     */
    TCA("TCA"),

    /**
     * <summary>
     *             TUV - TV - 798 - Tuvalu
     *             </summary>
     * 
     */
    TUV("TUV"),

    /**
     * <summary>
     *             UGA - UG - 800 - Uganda
     *             </summary>
     * 
     */
    UGA("UGA"),

    /**
     * <summary>
     *             UKR - UA - 804 - Ukraine
     *             </summary>
     * 
     */
    UKR("UKR"),

    /**
     * <summary>
     *             ARE - AE - 784 - United Arab Emirates
     *             </summary>
     * 
     */
    ARE("ARE"),

    /**
     * <summary>
     *             GBR - GB - 826 - United Kingdom
     *             </summary>
     * 
     */
    GBR("GBR"),

    /**
     * <summary>
     *             USA - US - 840 - United States
     *             </summary>
     * 
     */
    USA("USA"),

    /**
     * <summary>
     *             UMI - UM - 581 - United States Minor Outlying Islands
     *             </summary>
     * 
     */
    UMI("UMI"),

    /**
     * <summary>
     *             URY - UY - 858 - Uruguay
     *             </summary>
     * 
     */
    URY("URY"),

    /**
     * <summary>
     *             UZB - UZ - 860 - Uzbekistan
     *             </summary>
     * 
     */
    UZB("UZB"),

    /**
     * <summary>
     *             VUT - VU - 548 - Vanuatu
     *             </summary>
     * 
     */
    VUT("VUT"),

    /**
     * <summary>
     *             VEN - VE - 862 - Venezuela
     *             </summary>
     * 
     */
    VEN("VEN"),

    /**
     * <summary>
     *             VNM - VN - 704 - Viet Nam
     *             </summary>
     * 
     */
    VNM("VNM"),

    /**
     * <summary>
     *             VGB - VG - 092 - Virgin Islands, British
     *             </summary>
     * 
     */
    VGB("VGB"),

    /**
     * <summary>
     *             VIR - VI - 850 - Virgin Islands, U.S.
     *             </summary>
     * 
     */
    VIR("VIR"),

    /**
     * <summary>
     *             WLF - WF - 876 - Wallis and Futuna
     *             </summary>
     * 
     */
    WLF("WLF"),

    /**
     * <summary>
     *             ESH - EH - 732 - Western Sahara
     *             </summary>
     * 
     */
    ESH("ESH"),

    /**
     * <summary>
     *             YEM - YE - 887 - Yemen
     *             </summary>
     * 
     */
    YEM("YEM"),

    /**
     * <summary>
     *             YUG - YU - 891 - Yugoslavia
     *             </summary>
     * 
     */
    YUG("YUG"),

    /**
     * <summary>
     *             ZMB - ZM - 894 - Zambia
     *             </summary>
     * 
     */
    ZMB("ZMB"),

    /**
     * <summary>
     *             ZWE - ZW - 716 - Zimbabwe
     *             </summary>
     * 
     */
    ZWE("ZWE");
    private final String value;

    TypeISOCountryCodeA3(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeISOCountryCodeA3 fromValue(String v) {
        for (TypeISOCountryCodeA3 c: TypeISOCountryCodeA3 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
