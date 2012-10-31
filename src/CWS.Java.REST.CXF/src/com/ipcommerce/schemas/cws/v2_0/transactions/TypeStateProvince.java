
package com.ipcommerce.schemas.cws.v2_0.transactions;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeStateProvince.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeStateProvince">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="AL"/>
 *     &lt;enumeration value="AK"/>
 *     &lt;enumeration value="AS"/>
 *     &lt;enumeration value="AZ"/>
 *     &lt;enumeration value="AR"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="CT"/>
 *     &lt;enumeration value="DE"/>
 *     &lt;enumeration value="DC"/>
 *     &lt;enumeration value="FM"/>
 *     &lt;enumeration value="FL"/>
 *     &lt;enumeration value="GA"/>
 *     &lt;enumeration value="GU"/>
 *     &lt;enumeration value="HI"/>
 *     &lt;enumeration value="ID"/>
 *     &lt;enumeration value="IL"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="IA"/>
 *     &lt;enumeration value="KS"/>
 *     &lt;enumeration value="KY"/>
 *     &lt;enumeration value="LA"/>
 *     &lt;enumeration value="ME"/>
 *     &lt;enumeration value="MH"/>
 *     &lt;enumeration value="MD"/>
 *     &lt;enumeration value="MA"/>
 *     &lt;enumeration value="MI"/>
 *     &lt;enumeration value="MN"/>
 *     &lt;enumeration value="MS"/>
 *     &lt;enumeration value="MO"/>
 *     &lt;enumeration value="MT"/>
 *     &lt;enumeration value="NE"/>
 *     &lt;enumeration value="NV"/>
 *     &lt;enumeration value="NH"/>
 *     &lt;enumeration value="NJ"/>
 *     &lt;enumeration value="NM"/>
 *     &lt;enumeration value="NY"/>
 *     &lt;enumeration value="NC"/>
 *     &lt;enumeration value="ND"/>
 *     &lt;enumeration value="MP"/>
 *     &lt;enumeration value="OH"/>
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="OR"/>
 *     &lt;enumeration value="PW"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="RI"/>
 *     &lt;enumeration value="SC"/>
 *     &lt;enumeration value="SD"/>
 *     &lt;enumeration value="TN"/>
 *     &lt;enumeration value="TX"/>
 *     &lt;enumeration value="UT"/>
 *     &lt;enumeration value="VT"/>
 *     &lt;enumeration value="VI"/>
 *     &lt;enumeration value="VA"/>
 *     &lt;enumeration value="WA"/>
 *     &lt;enumeration value="WV"/>
 *     &lt;enumeration value="WI"/>
 *     &lt;enumeration value="WY"/>
 *     &lt;enumeration value="AA"/>
 *     &lt;enumeration value="AE"/>
 *     &lt;enumeration value="AP"/>
 *     &lt;enumeration value="AB"/>
 *     &lt;enumeration value="BC"/>
 *     &lt;enumeration value="MB"/>
 *     &lt;enumeration value="NB"/>
 *     &lt;enumeration value="NF"/>
 *     &lt;enumeration value="NT"/>
 *     &lt;enumeration value="NS"/>
 *     &lt;enumeration value="NU"/>
 *     &lt;enumeration value="ON"/>
 *     &lt;enumeration value="PE"/>
 *     &lt;enumeration value="QC"/>
 *     &lt;enumeration value="SK"/>
 *     &lt;enumeration value="YK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeStateProvince")
@XmlEnum
public enum TypeStateProvince {


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
     *             Alabama
     *             </summary>
     * 
     */
    AL("AL"),

    /**
     * <summary>
     *             Alaska
     *             </summary>
     * 
     */
    AK("AK"),

    /**
     * <summary>
     *             American Samoa
     *             </summary>
     * 
     */
    AS("AS"),

    /**
     * <summary>
     *             Arizona
     *             </summary>
     * 
     */
    AZ("AZ"),

    /**
     * <summary>
     *             Arkansas
     *             </summary>
     * 
     */
    AR("AR"),

    /**
     * <summary>
     *             California
     *             </summary>
     * 
     */
    CA("CA"),

    /**
     * <summary>
     *             Colorado
     *             </summary>
     * 
     */
    CO("CO"),

    /**
     * <summary>
     *             Connecticut
     *             </summary>
     * 
     */
    CT("CT"),

    /**
     * <summary>
     *             Delaware
     *             </summary>
     * 
     */
    DE("DE"),

    /**
     * <summary>
     *             District Of Columbia
     *             </summary>
     * 
     */
    DC("DC"),

    /**
     * <summary>
     *             Federated States Of Micronesia
     *             </summary>
     * 
     */
    FM("FM"),

    /**
     * <summary>
     *             Florida
     *             </summary>
     * 
     */
    FL("FL"),

    /**
     * <summary>
     *             Georgia
     *             </summary>
     * 
     */
    GA("GA"),

    /**
     * <summary>
     *             Guam
     *             </summary>
     * 
     */
    GU("GU"),

    /**
     * <summary>
     *             Hawaii
     *             </summary>
     * 
     */
    HI("HI"),

    /**
     * <summary>
     *             Idaho
     *             </summary>
     * 
     */
    ID("ID"),

    /**
     * <summary>
     *             Illinois
     *             </summary>
     * 
     */
    IL("IL"),

    /**
     * <summary>
     *             Indiana
     *             </summary>
     * 
     */
    IN("IN"),

    /**
     * <summary>
     *             Iowa
     *             </summary>
     * 
     */
    IA("IA"),

    /**
     * <summary>
     *             Kansas
     *             </summary>
     * 
     */
    KS("KS"),

    /**
     * <summary>
     *             Kentucky
     *             </summary>
     * 
     */
    KY("KY"),

    /**
     * <summary>
     *             Louisiana
     *             </summary>
     * 
     */
    LA("LA"),

    /**
     * <summary>
     *             Maine
     *             </summary>
     * 
     */
    ME("ME"),

    /**
     * <summary>
     *             Marshall Islands
     *             </summary>
     * 
     */
    MH("MH"),

    /**
     * <summary>
     *             Maryland
     *             </summary>
     * 
     */
    MD("MD"),

    /**
     * <summary>
     *             Massachusetts
     *             </summary>
     * 
     */
    MA("MA"),

    /**
     * <summary>
     *             Michigan
     *             </summary>
     * 
     */
    MI("MI"),

    /**
     * <summary>
     *             Minnesota
     *             </summary>
     * 
     */
    MN("MN"),

    /**
     * <summary>
     *             Mississippi
     *             </summary>
     * 
     */
    MS("MS"),

    /**
     * <summary>
     *             Missouri
     *             </summary>
     * 
     */
    MO("MO"),

    /**
     * <summary>
     *             Montana
     *             </summary>
     * 
     */
    MT("MT"),

    /**
     * <summary>
     *             Nebraska
     *             </summary>
     * 
     */
    NE("NE"),

    /**
     * <summary>
     *             Nevada
     *             </summary>
     * 
     */
    NV("NV"),

    /**
     * <summary>
     *             New Hampshire
     *             </summary>
     * 
     */
    NH("NH"),

    /**
     * <summary>
     *             New Jersey
     *             </summary>
     * 
     */
    NJ("NJ"),

    /**
     * <summary>
     *             New Mexico
     *             </summary>
     * 
     */
    NM("NM"),

    /**
     * <summary>
     *             New York
     *             </summary>
     * 
     */
    NY("NY"),

    /**
     * <summary>
     *             North Carolina
     *             </summary>
     * 
     */
    NC("NC"),

    /**
     * <summary>
     *             North Dakota
     *             </summary>
     * 
     */
    ND("ND"),

    /**
     * <summary>
     *             Northern Mariana Islands
     *             </summary>
     * 
     */
    MP("MP"),

    /**
     * <summary>
     *             Ohio
     *             </summary>
     * 
     */
    OH("OH"),

    /**
     * <summary>
     *             Oklahoma
     *             </summary>
     * 
     */
    OK("OK"),

    /**
     * <summary>
     *             Oregon
     *             </summary>
     * 
     */
    OR("OR"),

    /**
     * <summary>
     *             Palau
     *             </summary>
     * 
     */
    PW("PW"),

    /**
     * <summary>
     *             Pennsylvania
     *             </summary>
     * 
     */
    PA("PA"),

    /**
     * <summary>
     *             Puerto Rico
     *             </summary>
     * 
     */
    PR("PR"),

    /**
     * <summary>
     *             Rhode Island
     *             </summary>
     * 
     */
    RI("RI"),

    /**
     * <summary>
     *             South Carolina
     *             </summary>
     * 
     */
    SC("SC"),

    /**
     * <summary>
     *             South Dakota
     *             </summary>
     * 
     */
    SD("SD"),

    /**
     * <summary>
     *             Tennessee
     *             </summary>
     * 
     */
    TN("TN"),

    /**
     * <summary>
     *             Texas
     *             </summary>
     * 
     */
    TX("TX"),

    /**
     * <summary>
     *             Utah
     *             </summary>
     * 
     */
    UT("UT"),

    /**
     * <summary>
     *             Vermont
     *             </summary>
     * 
     */
    VT("VT"),

    /**
     * <summary>
     *             Virgin Islands
     *             </summary>
     * 
     */
    VI("VI"),

    /**
     * <summary>
     *             Virginia
     *             </summary>
     * 
     */
    VA("VA"),

    /**
     * <summary>
     *             Washington
     *             </summary>
     * 
     */
    WA("WA"),

    /**
     * <summary>
     *             West Virginia
     *             </summary>
     * 
     */
    WV("WV"),

    /**
     * <summary>
     *             Wisconsin
     *             </summary>
     * 
     */
    WI("WI"),

    /**
     * <summary>
     *             Wyoming
     *             </summary>
     * 
     */
    WY("WY"),

    /**
     * <summary>
     *             Armed Forces Americas
     *             </summary>
     * 
     */
    AA("AA"),

    /**
     * <summary>
     *             Armed Forces
     *             </summary>
     * 
     */
    AE("AE"),

    /**
     * <summary>
     *             Armed Forces Pacific
     *             </summary>
     * 
     */
    AP("AP"),

    /**
     * <summary>
     *             Alberta
     *             </summary>
     * 
     */
    AB("AB"),

    /**
     * <summary>
     *             British Columbia
     *             </summary>
     * 
     */
    BC("BC"),

    /**
     * <summary>
     *             Manitoba
     *             </summary>
     * 
     */
    MB("MB"),

    /**
     * <summary>
     *             New Brunswick
     *             </summary>
     * 
     */
    NB("NB"),

    /**
     * <summary>
     *             Newfoundland
     *             </summary>
     * 
     */
    NF("NF"),

    /**
     * <summary>
     *             Northwest Territories
     *             </summary>
     * 
     */
    NT("NT"),

    /**
     * <summary>
     *             Nova Scotia
     *             </summary>
     * 
     */
    NS("NS"),

    /**
     * <summary>
     *             Nunavut
     *             </summary>
     * 
     */
    NU("NU"),

    /**
     * <summary>
     *             Ontario
     *             </summary>
     * 
     */
    ON("ON"),

    /**
     * <summary>
     *             Prince Edward Island
     *             </summary>
     * 
     */
    PE("PE"),

    /**
     * <summary>
     *             Quebec
     *             </summary>
     * 
     */
    QC("QC"),

    /**
     * <summary>
     *             Saskatchewan
     *             </summary>
     * 
     */
    SK("SK"),

    /**
     * <summary>
     *             Yukon
     *             </summary>
     * 
     */
    YK("YK");
    private final String value;

    TypeStateProvince(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeStateProvince fromValue(String v) {
        for (TypeStateProvince c: TypeStateProvince.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
