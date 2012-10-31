
package com.ipcommerce.schemas.cws.v2_0.transactions;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeISOCurrencyCodeA3.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeISOCurrencyCodeA3">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="AFN"/>
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="DZD"/>
 *     &lt;enumeration value="USD"/>
 *     &lt;enumeration value="EUR"/>
 *     &lt;enumeration value="AOA"/>
 *     &lt;enumeration value="XCD"/>
 *     &lt;enumeration value="ARS"/>
 *     &lt;enumeration value="AMD"/>
 *     &lt;enumeration value="AWG"/>
 *     &lt;enumeration value="AUD"/>
 *     &lt;enumeration value="AZN"/>
 *     &lt;enumeration value="BSD"/>
 *     &lt;enumeration value="BHD"/>
 *     &lt;enumeration value="BDT"/>
 *     &lt;enumeration value="BBD"/>
 *     &lt;enumeration value="BYR"/>
 *     &lt;enumeration value="BZD"/>
 *     &lt;enumeration value="BMD"/>
 *     &lt;enumeration value="BTN"/>
 *     &lt;enumeration value="BOB"/>
 *     &lt;enumeration value="BOV"/>
 *     &lt;enumeration value="BAM"/>
 *     &lt;enumeration value="BWP"/>
 *     &lt;enumeration value="BRL"/>
 *     &lt;enumeration value="BND"/>
 *     &lt;enumeration value="BGN"/>
 *     &lt;enumeration value="XOF"/>
 *     &lt;enumeration value="BIF"/>
 *     &lt;enumeration value="KHR"/>
 *     &lt;enumeration value="CAD"/>
 *     &lt;enumeration value="CVE"/>
 *     &lt;enumeration value="KYD"/>
 *     &lt;enumeration value="CLP"/>
 *     &lt;enumeration value="CLF"/>
 *     &lt;enumeration value="CNY"/>
 *     &lt;enumeration value="COP"/>
 *     &lt;enumeration value="COU"/>
 *     &lt;enumeration value="KMF"/>
 *     &lt;enumeration value="XAF"/>
 *     &lt;enumeration value="CDF"/>
 *     &lt;enumeration value="CRC"/>
 *     &lt;enumeration value="HRK"/>
 *     &lt;enumeration value="CUP"/>
 *     &lt;enumeration value="CYP"/>
 *     &lt;enumeration value="CZK"/>
 *     &lt;enumeration value="DKK"/>
 *     &lt;enumeration value="DJF"/>
 *     &lt;enumeration value="DOP"/>
 *     &lt;enumeration value="EGP"/>
 *     &lt;enumeration value="SVC"/>
 *     &lt;enumeration value="ERN"/>
 *     &lt;enumeration value="EEK"/>
 *     &lt;enumeration value="ETB"/>
 *     &lt;enumeration value="FKP"/>
 *     &lt;enumeration value="FJD"/>
 *     &lt;enumeration value="GMD"/>
 *     &lt;enumeration value="GEL"/>
 *     &lt;enumeration value="GHS"/>
 *     &lt;enumeration value="GIP"/>
 *     &lt;enumeration value="GTQ"/>
 *     &lt;enumeration value="GNF"/>
 *     &lt;enumeration value="GWP"/>
 *     &lt;enumeration value="GYD"/>
 *     &lt;enumeration value="HTG"/>
 *     &lt;enumeration value="HNL"/>
 *     &lt;enumeration value="HKD"/>
 *     &lt;enumeration value="HUF"/>
 *     &lt;enumeration value="ISK"/>
 *     &lt;enumeration value="INR"/>
 *     &lt;enumeration value="IDR"/>
 *     &lt;enumeration value="XDR"/>
 *     &lt;enumeration value="IRR"/>
 *     &lt;enumeration value="IQD"/>
 *     &lt;enumeration value="ILS"/>
 *     &lt;enumeration value="JMD"/>
 *     &lt;enumeration value="JPY"/>
 *     &lt;enumeration value="JOD"/>
 *     &lt;enumeration value="KZT"/>
 *     &lt;enumeration value="KES"/>
 *     &lt;enumeration value="KPW"/>
 *     &lt;enumeration value="KRW"/>
 *     &lt;enumeration value="KWD"/>
 *     &lt;enumeration value="KGS"/>
 *     &lt;enumeration value="LAK"/>
 *     &lt;enumeration value="LVL"/>
 *     &lt;enumeration value="LBP"/>
 *     &lt;enumeration value="LSL"/>
 *     &lt;enumeration value="LRD"/>
 *     &lt;enumeration value="LYD"/>
 *     &lt;enumeration value="LTL"/>
 *     &lt;enumeration value="MOP"/>
 *     &lt;enumeration value="MKD"/>
 *     &lt;enumeration value="MGA"/>
 *     &lt;enumeration value="MWK"/>
 *     &lt;enumeration value="MYR"/>
 *     &lt;enumeration value="MVR"/>
 *     &lt;enumeration value="MTL"/>
 *     &lt;enumeration value="MRO"/>
 *     &lt;enumeration value="MUR"/>
 *     &lt;enumeration value="MXN"/>
 *     &lt;enumeration value="MXV"/>
 *     &lt;enumeration value="MDL"/>
 *     &lt;enumeration value="MNT"/>
 *     &lt;enumeration value="MAD"/>
 *     &lt;enumeration value="MZN"/>
 *     &lt;enumeration value="MMK"/>
 *     &lt;enumeration value="NAD"/>
 *     &lt;enumeration value="NPR"/>
 *     &lt;enumeration value="ANG"/>
 *     &lt;enumeration value="XPF"/>
 *     &lt;enumeration value="NZD"/>
 *     &lt;enumeration value="NIO"/>
 *     &lt;enumeration value="NGN"/>
 *     &lt;enumeration value="NOK"/>
 *     &lt;enumeration value="OMR"/>
 *     &lt;enumeration value="PKR"/>
 *     &lt;enumeration value="PAB"/>
 *     &lt;enumeration value="PGK"/>
 *     &lt;enumeration value="PYG"/>
 *     &lt;enumeration value="PEN"/>
 *     &lt;enumeration value="PHP"/>
 *     &lt;enumeration value="PLN"/>
 *     &lt;enumeration value="QAR"/>
 *     &lt;enumeration value="RON"/>
 *     &lt;enumeration value="RUB"/>
 *     &lt;enumeration value="RWF"/>
 *     &lt;enumeration value="SHP"/>
 *     &lt;enumeration value="WST"/>
 *     &lt;enumeration value="STD"/>
 *     &lt;enumeration value="SAR"/>
 *     &lt;enumeration value="RSD"/>
 *     &lt;enumeration value="SCR"/>
 *     &lt;enumeration value="SLL"/>
 *     &lt;enumeration value="SGD"/>
 *     &lt;enumeration value="SKK"/>
 *     &lt;enumeration value="SBD"/>
 *     &lt;enumeration value="SOS"/>
 *     &lt;enumeration value="ZAR"/>
 *     &lt;enumeration value="LKR"/>
 *     &lt;enumeration value="SDG"/>
 *     &lt;enumeration value="SRD"/>
 *     &lt;enumeration value="SZL"/>
 *     &lt;enumeration value="SEK"/>
 *     &lt;enumeration value="CHF"/>
 *     &lt;enumeration value="CHW"/>
 *     &lt;enumeration value="CHE"/>
 *     &lt;enumeration value="SYP"/>
 *     &lt;enumeration value="TWD"/>
 *     &lt;enumeration value="TJS"/>
 *     &lt;enumeration value="TZS"/>
 *     &lt;enumeration value="THB"/>
 *     &lt;enumeration value="TOP"/>
 *     &lt;enumeration value="TTD"/>
 *     &lt;enumeration value="TND"/>
 *     &lt;enumeration value="TRY"/>
 *     &lt;enumeration value="TMM"/>
 *     &lt;enumeration value="UGX"/>
 *     &lt;enumeration value="UAH"/>
 *     &lt;enumeration value="AED"/>
 *     &lt;enumeration value="GBP"/>
 *     &lt;enumeration value="USS"/>
 *     &lt;enumeration value="USN"/>
 *     &lt;enumeration value="UYU"/>
 *     &lt;enumeration value="UYI"/>
 *     &lt;enumeration value="UZS"/>
 *     &lt;enumeration value="VUV"/>
 *     &lt;enumeration value="VEF"/>
 *     &lt;enumeration value="VND"/>
 *     &lt;enumeration value="YER"/>
 *     &lt;enumeration value="ZMK"/>
 *     &lt;enumeration value="ZWD"/>
 *     &lt;enumeration value="XBA"/>
 *     &lt;enumeration value="XBB"/>
 *     &lt;enumeration value="XBC"/>
 *     &lt;enumeration value="XBD"/>
 *     &lt;enumeration value="XPD"/>
 *     &lt;enumeration value="XPT"/>
 *     &lt;enumeration value="XAG"/>
 *     &lt;enumeration value="XAU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeISOCurrencyCodeA3")
@XmlEnum
public enum TypeISOCurrencyCodeA3 {


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
     *             AFN - 971 - Afghani
     *             </summary>
     * 
     */
    AFN("AFN"),

    /**
     * <summary>
     *             ALL - 008 - Lek
     *             </summary>
     * 
     */
    ALL("ALL"),

    /**
     * <summary>
     *             DZD - 012 - Algerian Dinar
     *             </summary>
     * 
     */
    DZD("DZD"),

    /**
     * <summary>
     *             USD - 840 - US Dollar
     *             </summary>
     * 
     */
    USD("USD"),

    /**
     * <summary>
     *             EUR - 978 - Euro
     *             </summary>
     * 
     */
    EUR("EUR"),

    /**
     * <summary>
     *             AOA - 973 - Kwanza
     *             </summary>
     * 
     */
    AOA("AOA"),

    /**
     * <summary>
     *             XCD - 951 - East Caribbean Dollar
     *             </summary>
     * 
     */
    XCD("XCD"),

    /**
     * <summary>
     *             ARS - 032 - Argentine Peso
     *             </summary>
     * 
     */
    ARS("ARS"),

    /**
     * <summary>
     *             AMD - 051 - Armenian Dram
     *             </summary>
     * 
     */
    AMD("AMD"),

    /**
     * <summary>
     *             AWG - 533 - Aruban Guilder
     *             </summary>
     * 
     */
    AWG("AWG"),

    /**
     * <summary>
     *             AUD - 036 - Australian Dollar
     *             </summary>
     * 
     */
    AUD("AUD"),

    /**
     * <summary>
     *             AZN - 944 - Azerbaijanian Manat
     *             </summary>
     * 
     */
    AZN("AZN"),

    /**
     * <summary>
     *             BSD - 044 - Bahamian Dollar
     *             </summary>
     * 
     */
    BSD("BSD"),

    /**
     * <summary>
     *             BHD - 048 - Bahraini Dinar
     *             </summary>
     * 
     */
    BHD("BHD"),

    /**
     * <summary>
     *             BDT - 050 - Taka
     *             </summary>
     * 
     */
    BDT("BDT"),

    /**
     * <summary>
     *             BBD - 052 - Barbados Dollar
     *             </summary>
     * 
     */
    BBD("BBD"),

    /**
     * <summary>
     *             BYR - 974 - Belarussian Ruble
     *             </summary>
     * 
     */
    BYR("BYR"),

    /**
     * <summary>
     *             BZD - 084 - Belize Dollar
     *             </summary>
     * 
     */
    BZD("BZD"),

    /**
     * <summary>
     *             BMD - 060 - Bermudian Dollar (customarily known as Bermuda Dollar)
     *             </summary>
     * 
     */
    BMD("BMD"),

    /**
     * <summary>
     *             BTN - 064 - Ngultrum
     *             </summary>
     * 
     */
    BTN("BTN"),

    /**
     * <summary>
     *             BOB - 068 - Boliviano
     *             </summary>
     * 
     */
    BOB("BOB"),

    /**
     * <summary>
     *             BOV - 984 - Mvdol
     *             </summary>
     * 
     */
    BOV("BOV"),

    /**
     * <summary>
     *             BAM - 977 - Convertible Marks
     *             </summary>
     * 
     */
    BAM("BAM"),

    /**
     * <summary>
     *             BWP - 072 - Pula
     *             </summary>
     * 
     */
    BWP("BWP"),

    /**
     * <summary>
     *             BRL - 986 - Brazilian Real
     *             </summary>
     * 
     */
    BRL("BRL"),

    /**
     * <summary>
     *             BND - 096 - Brunei Dollar
     *             </summary>
     * 
     */
    BND("BND"),

    /**
     * <summary>
     *             BGN - 975 - Bulgarian Lev
     *             </summary>
     * 
     */
    BGN("BGN"),

    /**
     * <summary>
     *             XOF - 952 - CFA Franc BCEAO
     *             </summary>
     * 
     */
    XOF("XOF"),

    /**
     * <summary>
     *             BIF - 108 - Burundi Franc
     *             </summary>
     * 
     */
    BIF("BIF"),

    /**
     * <summary>
     *             KHR - 116 - Riel
     *             </summary>
     * 
     */
    KHR("KHR"),

    /**
     * <summary>
     *             CAD - 124 - Canadian Dollar
     *             </summary>
     * 
     */
    CAD("CAD"),

    /**
     * <summary>
     *             CVE - 132 - Cape Verde Escudo
     *             </summary>
     * 
     */
    CVE("CVE"),

    /**
     * <summary>
     *             KYD - 136 - Cayman Islands Dollar
     *             </summary>
     * 
     */
    KYD("KYD"),

    /**
     * <summary>
     *             CLP - 152 - Chilean Peso
     *             </summary>
     * 
     */
    CLP("CLP"),

    /**
     * <summary>
     *             CLF - 990 - Unidades de fomento
     *             </summary>
     * 
     */
    CLF("CLF"),

    /**
     * <summary>
     *             CNY - 156 - Yuan Renminbi
     *             </summary>
     * 
     */
    CNY("CNY"),

    /**
     * <summary>
     *             COP - 170 - Colombian Peso
     *             </summary>
     * 
     */
    COP("COP"),

    /**
     * <summary>
     *             COU - 970 - Unidad de Valor Real
     *             </summary>
     * 
     */
    COU("COU"),

    /**
     * <summary>
     *             KMF - 174 - Comoro Franc
     *             </summary>
     * 
     */
    KMF("KMF"),

    /**
     * <summary>
     *             XAF - 950 - CFA Franc BEAC
     *             </summary>
     * 
     */
    XAF("XAF"),

    /**
     * <summary>
     *             CDF - 976 - Franc Congolais
     *             </summary>
     * 
     */
    CDF("CDF"),

    /**
     * <summary>
     *             CRC - 188 - Costa Rican Colon
     *             </summary>
     * 
     */
    CRC("CRC"),

    /**
     * <summary>
     *             HRK - 191 - Croatian Kuna
     *             </summary>
     * 
     */
    HRK("HRK"),

    /**
     * <summary>
     *             CUP - 192 - Cuban Peso
     *             </summary>
     * 
     */
    CUP("CUP"),

    /**
     * <summary>
     *             CYP - 196 - Cyprus Pound
     *             </summary>
     * 
     */
    CYP("CYP"),

    /**
     * <summary>
     *             CZK - 203 - Czech Koruna
     *             </summary>
     * 
     */
    CZK("CZK"),

    /**
     * <summary>
     *             DKK - 208 - Danish Krone
     *             </summary>
     * 
     */
    DKK("DKK"),

    /**
     * <summary>
     *             DJF - 262 - Djibouti Franc
     *             </summary>
     * 
     */
    DJF("DJF"),

    /**
     * <summary>
     *             DOP - 214 - Dominican Peso
     *             </summary>
     * 
     */
    DOP("DOP"),

    /**
     * <summary>
     *             EGP - 818 - Egyptian Pound
     *             </summary>
     * 
     */
    EGP("EGP"),

    /**
     * <summary>
     *             SVC - 222 - El Salvador Colon
     *             </summary>
     * 
     */
    SVC("SVC"),

    /**
     * <summary>
     *             ERN - 232 - Nakfa
     *             </summary>
     * 
     */
    ERN("ERN"),

    /**
     * <summary>
     *             EEK - 233 - Kroon
     *             </summary>
     * 
     */
    EEK("EEK"),

    /**
     * <summary>
     *             ETB - 230 - Ethiopian Birr
     *             </summary>
     * 
     */
    ETB("ETB"),

    /**
     * <summary>
     *             FKP - 238 - Falkland Islands Pound
     *             </summary>
     * 
     */
    FKP("FKP"),

    /**
     * <summary>
     *             FJD - 242 - Fiji Dollar
     *             </summary>
     * 
     */
    FJD("FJD"),

    /**
     * <summary>
     *             GMD - 270 - Dalasi
     *             </summary>
     * 
     */
    GMD("GMD"),

    /**
     * <summary>
     *             GEL - 981 - Lari
     *             </summary>
     * 
     */
    GEL("GEL"),

    /**
     * <summary>
     *             GHS - 936 - Ghana Cedi
     *             </summary>
     * 
     */
    GHS("GHS"),

    /**
     * <summary>
     *             GIP - 292 - Gibraltar Pound
     *             </summary>
     * 
     */
    GIP("GIP"),

    /**
     * <summary>
     *             GTQ - 320 - Quetzal
     *             </summary>
     * 
     */
    GTQ("GTQ"),

    /**
     * <summary>
     *             GNF - 324 - Guinea Franc
     *             </summary>
     * 
     */
    GNF("GNF"),

    /**
     * <summary>
     *             GWP - 624 - Guinea-Bissau Peso
     *             </summary>
     * 
     */
    GWP("GWP"),

    /**
     * <summary>
     *             GYD - 328 - Guyana Dollar
     *             </summary>
     * 
     */
    GYD("GYD"),

    /**
     * <summary>
     *             HTG - 332 - Gourde
     *             </summary>
     * 
     */
    HTG("HTG"),

    /**
     * <summary>
     *             HNL - 340 - Lempira
     *             </summary>
     * 
     */
    HNL("HNL"),

    /**
     * <summary>
     *             HKD - 344 - Hong Kong Dollar
     *             </summary>
     * 
     */
    HKD("HKD"),

    /**
     * <summary>
     *             HUF - 348 - Forint
     *             </summary>
     * 
     */
    HUF("HUF"),

    /**
     * <summary>
     *             ISK - 352 - Iceland Krona
     *             </summary>
     * 
     */
    ISK("ISK"),

    /**
     * <summary>
     *             INR - 356 - Indian Rupee
     *             </summary>
     * 
     */
    INR("INR"),

    /**
     * <summary>
     *             IDR - 360 - Rupiah
     *             </summary>
     * 
     */
    IDR("IDR"),

    /**
     * <summary>
     *             XDR - 960 - SDR - International Monetary Fund (IMF)
     *             </summary>
     * 
     */
    XDR("XDR"),

    /**
     * <summary>
     *             IRR - 364 - Iranian Rial
     *             </summary>
     * 
     */
    IRR("IRR"),

    /**
     * <summary>
     *             IQD - 368 - Iraqi Dinar
     *             </summary>
     * 
     */
    IQD("IQD"),

    /**
     * <summary>
     *             ILS - 376 - New Israeli Sheqel
     *             </summary>
     * 
     */
    ILS("ILS"),

    /**
     * <summary>
     *             JMD - 388 - Jamaican Dollar
     *             </summary>
     * 
     */
    JMD("JMD"),

    /**
     * <summary>
     *             JPY - 392 - Yen
     *             </summary>
     * 
     */
    JPY("JPY"),

    /**
     * <summary>
     *             JOD - 400 - Jordanian Dinar
     *             </summary>
     * 
     */
    JOD("JOD"),

    /**
     * <summary>
     *             KZT - 398 - Tenge
     *             </summary>
     * 
     */
    KZT("KZT"),

    /**
     * <summary>
     *             KES - 404 - Kenyan Shilling
     *             </summary>
     * 
     */
    KES("KES"),

    /**
     * <summary>
     *             KPW - 408 - North Korean Won
     *             </summary>
     * 
     */
    KPW("KPW"),

    /**
     * <summary>
     *             KRW - 410 - Won
     *             </summary>
     * 
     */
    KRW("KRW"),

    /**
     * <summary>
     *             KWD - 414 - Kuwaiti Dinar
     *             </summary>
     * 
     */
    KWD("KWD"),

    /**
     * <summary>
     *             KGS - 417 - Som
     *             </summary>
     * 
     */
    KGS("KGS"),

    /**
     * <summary>
     *             LAK - 418 - Kip
     *             </summary>
     * 
     */
    LAK("LAK"),

    /**
     * <summary>
     *             LVL - 428 - Latvian Lats
     *             </summary>
     * 
     */
    LVL("LVL"),

    /**
     * <summary>
     *             LBP - 422 - Lebanese Pound
     *             </summary>
     * 
     */
    LBP("LBP"),

    /**
     * <summary>
     *             LSL - 426 - Loti
     *             </summary>
     * 
     */
    LSL("LSL"),

    /**
     * <summary>
     *             LRD - 430 - Liberian Dollar
     *             </summary>
     * 
     */
    LRD("LRD"),

    /**
     * <summary>
     *             LYD - 434 - Libyan Dinar
     *             </summary>
     * 
     */
    LYD("LYD"),

    /**
     * <summary>
     *             LTL - 440 - Lithuanian Litas
     *             </summary>
     * 
     */
    LTL("LTL"),

    /**
     * <summary>
     *             MOP - 446 - Pataca
     *             </summary>
     * 
     */
    MOP("MOP"),

    /**
     * <summary>
     *             MKD - 807 - Denar
     *             </summary>
     * 
     */
    MKD("MKD"),

    /**
     * <summary>
     *             MGA - 969 - Malagasy Ariary
     *             </summary>
     * 
     */
    MGA("MGA"),

    /**
     * <summary>
     *             MWK - 454 - Kwacha
     *             </summary>
     * 
     */
    MWK("MWK"),

    /**
     * <summary>
     *             MYR - 458 - Malaysian Ringgit
     *             </summary>
     * 
     */
    MYR("MYR"),

    /**
     * <summary>
     *             MVR - 462 - Rufiyaa
     *             </summary>
     * 
     */
    MVR("MVR"),

    /**
     * <summary>
     *             MTL - 470 - Maltese Lira
     *             </summary>
     * 
     */
    MTL("MTL"),

    /**
     * <summary>
     *             MRO - 478 - Ouguiya
     *             </summary>
     * 
     */
    MRO("MRO"),

    /**
     * <summary>
     *             MUR - 480 - Mauritius Rupee
     *             </summary>
     * 
     */
    MUR("MUR"),

    /**
     * <summary>
     *             MXN - 484 - Mexican Peso
     *             </summary>
     * 
     */
    MXN("MXN"),

    /**
     * <summary>
     *             MXV - 979 - Mexican Unidad de Inversion (UDI)
     *             </summary>
     * 
     */
    MXV("MXV"),

    /**
     * <summary>
     *             MDL - 498 - Moldovan Leu
     *             </summary>
     * 
     */
    MDL("MDL"),

    /**
     * <summary>
     *             MNT - 496 - Tugrik
     *             </summary>
     * 
     */
    MNT("MNT"),

    /**
     * <summary>
     *             MAD - 504 - Moroccan Dirham
     *             </summary>
     * 
     */
    MAD("MAD"),

    /**
     * <summary>
     *             MZN - 943 - Metical
     *             </summary>
     * 
     */
    MZN("MZN"),

    /**
     * <summary>
     *             MMK - 104 - Kyat
     *             </summary>
     * 
     */
    MMK("MMK"),

    /**
     * <summary>
     *             NAD - 516 - Namibia Dollar
     *             </summary>
     * 
     */
    NAD("NAD"),

    /**
     * <summary>
     *             NPR - 524 - Nepalese Rupee
     *             </summary>
     * 
     */
    NPR("NPR"),

    /**
     * <summary>
     *             ANG - 532 - Netherlands Antillian Guilder
     *             </summary>
     * 
     */
    ANG("ANG"),

    /**
     * <summary>
     *             XPF - 953 - CFP Franc
     *             </summary>
     * 
     */
    XPF("XPF"),

    /**
     * <summary>
     *             NZD - 554 - New Zealand Dollar
     *             </summary>
     * 
     */
    NZD("NZD"),

    /**
     * <summary>
     *             NIO - 558 - Cordoba Oro
     *             </summary>
     * 
     */
    NIO("NIO"),

    /**
     * <summary>
     *             NGN - 566 - Naira
     *             </summary>
     * 
     */
    NGN("NGN"),

    /**
     * <summary>
     *             NOK - 578 - Norwegian Krone
     *             </summary>
     * 
     */
    NOK("NOK"),

    /**
     * <summary>
     *             OMR - 512 - Rial Omani
     *             </summary>
     * 
     */
    OMR("OMR"),

    /**
     * <summary>
     *             PKR - 586 - Pakistan Rupee
     *             </summary>
     * 
     */
    PKR("PKR"),

    /**
     * <summary>
     *             PAB - 590 - Balboa
     *             </summary>
     * 
     */
    PAB("PAB"),

    /**
     * <summary>
     *             PGK - 598 - Kina
     *             </summary>
     * 
     */
    PGK("PGK"),

    /**
     * <summary>
     *             PYG - 600 - Guarani
     *             </summary>
     * 
     */
    PYG("PYG"),

    /**
     * <summary>
     *             PEN - 604 - Nuevo Sol
     *             </summary>
     * 
     */
    PEN("PEN"),

    /**
     * <summary>
     *             PHP - 608 - Philippine Peso
     *             </summary>
     * 
     */
    PHP("PHP"),

    /**
     * <summary>
     *             PLN - 985 - Zloty
     *             </summary>
     * 
     */
    PLN("PLN"),

    /**
     * <summary>
     *             QAR - 634 - Qatari Rial
     *             </summary>
     * 
     */
    QAR("QAR"),

    /**
     * <summary>
     *             RON - 946 - New Leu
     *             </summary>
     * 
     */
    RON("RON"),

    /**
     * <summary>
     *             RUB - 643 - Russian Ruble
     *             </summary>
     * 
     */
    RUB("RUB"),

    /**
     * <summary>
     *             RWF - 646 - Rwanda Franc
     *             </summary>
     * 
     */
    RWF("RWF"),

    /**
     * <summary>
     *             SHP - 654 - Saint Helena Pound
     *             </summary>
     * 
     */
    SHP("SHP"),

    /**
     * <summary>
     *             WST - 882 - Tala
     *             </summary>
     * 
     */
    WST("WST"),

    /**
     * <summary>
     *             STD - 678 - Dobra
     *             </summary>
     * 
     */
    STD("STD"),

    /**
     * <summary>
     *             SAR - 682 - Saudi Riyal
     *             </summary>
     * 
     */
    SAR("SAR"),

    /**
     * <summary>
     *             RSD - 941 - Serbian Dinar
     *             </summary>
     * 
     */
    RSD("RSD"),

    /**
     * <summary>
     *             SCR - 690 - Seychelles Rupee
     *             </summary>
     * 
     */
    SCR("SCR"),

    /**
     * <summary>
     *             SLL - 694 - Leone
     *             </summary>
     * 
     */
    SLL("SLL"),

    /**
     * <summary>
     *             SGD - 702 - Singapore Dollar
     *             </summary>
     * 
     */
    SGD("SGD"),

    /**
     * <summary>
     *             SKK - 703 - Slovak Koruna
     *             </summary>
     * 
     */
    SKK("SKK"),

    /**
     * <summary>
     *             SBD - 090 - Solomon Islands Dollar
     *             </summary>
     * 
     */
    SBD("SBD"),

    /**
     * <summary>
     *             SOS - 706 - Somali Shilling
     *             </summary>
     * 
     */
    SOS("SOS"),

    /**
     * <summary>
     *             ZAR - 710 - Rand
     *             </summary>
     * 
     */
    ZAR("ZAR"),

    /**
     * <summary>
     *             LKR - 144 - Sri Lanka Rupee
     *             </summary>
     * 
     */
    LKR("LKR"),

    /**
     * <summary>
     *             SDG - 938 - Sudanese Pound
     *             </summary>
     * 
     */
    SDG("SDG"),

    /**
     * <summary>
     *             SRD - 968 - Surinam Dollar
     *             </summary>
     * 
     */
    SRD("SRD"),

    /**
     * <summary>
     *             SZL - 748 - Lilangeni
     *             </summary>
     * 
     */
    SZL("SZL"),

    /**
     * <summary>
     *             SEK - 752 - Swedish Krona
     *             </summary>
     * 
     */
    SEK("SEK"),

    /**
     * <summary>
     *             CHF - 756 - Swiss Franc
     *             </summary>
     * 
     */
    CHF("CHF"),

    /**
     * <summary>
     *             CHW - 948 - WIR Franc
     *             </summary>
     * 
     */
    CHW("CHW"),

    /**
     * <summary>
     *             CHE - 947 - WIR Euro
     *             </summary>
     * 
     */
    CHE("CHE"),

    /**
     * <summary>
     *             SYP - 760 - Syrian Pound
     *             </summary>
     * 
     */
    SYP("SYP"),

    /**
     * <summary>
     *             TWD - 901 - New Taiwan Dollar
     *             </summary>
     * 
     */
    TWD("TWD"),

    /**
     * <summary>
     *             TJS - 972 - Somoni
     *             </summary>
     * 
     */
    TJS("TJS"),

    /**
     * <summary>
     *             TZS - 834 - Tanzanian Shilling
     *             </summary>
     * 
     */
    TZS("TZS"),

    /**
     * <summary>
     *             THB - 764 - Baht
     *             </summary>
     * 
     */
    THB("THB"),

    /**
     * <summary>
     *             TOP - 776 - Pa'anga
     *             </summary>
     * 
     */
    TOP("TOP"),

    /**
     * <summary>
     *             TTD - 780 - Trinidad and Tobago Dollar
     *             </summary>
     * 
     */
    TTD("TTD"),

    /**
     * <summary>
     *             TND - 788 - Tunisian Dinar
     *             </summary>
     * 
     */
    TND("TND"),

    /**
     * <summary>
     *             TRY - 949 - New Turkish Lira
     *             </summary>
     * 
     */
    TRY("TRY"),

    /**
     * <summary>
     *             TMM - 795 - Manat
     *             </summary>
     * 
     */
    TMM("TMM"),

    /**
     * <summary>
     *             UGX - 800 - Uganda Shilling
     *             </summary>
     * 
     */
    UGX("UGX"),

    /**
     * <summary>
     *             UAH - 980 - Hryvnia
     *             </summary>
     * 
     */
    UAH("UAH"),

    /**
     * <summary>
     *             AED - 784 - UAE Dirham
     *             </summary>
     * 
     */
    AED("AED"),

    /**
     * <summary>
     *             GBP - 826 - Pound Sterling
     *             </summary>
     * 
     */
    GBP("GBP"),

    /**
     * <summary>
     *             USS - 998 - US Dollar(Same day)
     *             </summary>
     * 
     */
    USS("USS"),

    /**
     * <summary>
     *             USN - 997 - US Dollar(Next day)
     *             </summary>
     * 
     */
    USN("USN"),

    /**
     * <summary>
     *             UYU - 858 - Peso Uruguayo
     *             </summary>
     * 
     */
    UYU("UYU"),

    /**
     * <summary>
     *             UYI - 940 - Uruguay Peso en Unidades Indexadas
     *             </summary>
     * 
     */
    UYI("UYI"),

    /**
     * <summary>
     *             UZS - 860 - Uzbekistan Sum
     *             </summary>
     * 
     */
    UZS("UZS"),

    /**
     * <summary>
     *             VUV - 548 - Vatu
     *             </summary>
     * 
     */
    VUV("VUV"),

    /**
     * <summary>
     *             VEF - 937 - Bolivar Fuerte
     *             </summary>
     * 
     */
    VEF("VEF"),

    /**
     * <summary>
     *             VND - 704 - Dong
     *             </summary>
     * 
     */
    VND("VND"),

    /**
     * <summary>
     *             YER - 886 - Yemeni Rial
     *             </summary>
     * 
     */
    YER("YER"),

    /**
     * <summary>
     *             ZMK - 894 - Kwacha
     *             </summary>
     * 
     */
    ZMK("ZMK"),

    /**
     * <summary>
     *             ZWD - 716 - Zimbabwe Dollar
     *             </summary>
     * 
     */
    ZWD("ZWD"),

    /**
     * <summary>
     *             XBA - 955 - Bond Markets Units European Composite Unit (EURCO) 
     *             </summary>
     * 
     */
    XBA("XBA"),

    /**
     * <summary>
     *             XBB - 956 - European Monetary Unit (E.M.U.-6) 
     *             </summary>
     * 
     */
    XBB("XBB"),

    /**
     * <summary>
     *             XBC - 957 - European Unit of Account 9(E.U.A.-9) 
     *             </summary>
     * 
     */
    XBC("XBC"),

    /**
     * <summary>
     *             XBD - 958 - European Unit of Account 17(E.U.A.-17) 
     *             </summary>
     * 
     */
    XBD("XBD"),

    /**
     * <summary>
     *             XPD - 964 - Palladium 
     *             </summary>
     * 
     */
    XPD("XPD"),

    /**
     * <summary>
     *             XPT - 962 - Platinum 
     *             </summary>
     * 
     */
    XPT("XPT"),

    /**
     * <summary>
     *             XAG - 961 - Silver 
     *             </summary>
     * 
     */
    XAG("XAG"),

    /**
     * <summary>
     *             XAU - 959 - Gold 
     *             </summary>
     * 
     */
    XAU("XAU");
    private final String value;

    TypeISOCurrencyCodeA3(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeISOCurrencyCodeA3 fromValue(String v) {
        for (TypeISOCurrencyCodeA3 c: TypeISOCurrencyCodeA3 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
