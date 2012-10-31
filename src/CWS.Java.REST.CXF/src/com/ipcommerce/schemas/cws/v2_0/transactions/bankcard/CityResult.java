
package com.ipcommerce.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CityResult.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CityResult">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="NotIncluded"/>
 *     &lt;enumeration value="Match"/>
 *     &lt;enumeration value="NoMatch"/>
 *     &lt;enumeration value="IssuerNotCertified"/>
 *     &lt;enumeration value="NoResponseFromCardAssociation"/>
 *     &lt;enumeration value="UnknownResponseFromCardAssociation"/>
 *     &lt;enumeration value="NotVerified"/>
 *     &lt;enumeration value="BadFormat"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CityResult")
@XmlEnum
public enum CityResult {


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
     *             Not included.
     *             </summary>
     * 
     */
    @XmlEnumValue("NotIncluded")
    NOT_INCLUDED("NotIncluded"),

    /**
     * <summary>
     *             Match.
     *             </summary>
     * 
     */
    @XmlEnumValue("Match")
    MATCH("Match"),

    /**
     * <summary>
     *             No match.
     *             </summary>
     * 
     */
    @XmlEnumValue("NoMatch")
    NO_MATCH("NoMatch"),

    /**
     * <summary>
     *             Issuer is not certified.
     *             </summary>
     * 
     */
    @XmlEnumValue("IssuerNotCertified")
    ISSUER_NOT_CERTIFIED("IssuerNotCertified"),

    /**
     * <summary>
     *             No response from card association.
     *             </summary>
     * 
     */
    @XmlEnumValue("NoResponseFromCardAssociation")
    NO_RESPONSE_FROM_CARD_ASSOCIATION("NoResponseFromCardAssociation"),

    /**
     * <summary>
     *             The response code from the card association was not recognized.
     *             </summary>
     * 
     */
    @XmlEnumValue("UnknownResponseFromCardAssociation")
    UNKNOWN_RESPONSE_FROM_CARD_ASSOCIATION("UnknownResponseFromCardAssociation"),

    /**
     * <summary>
     *             AVS data was not verified.
     *             </summary>
     * 
     */
    @XmlEnumValue("NotVerified")
    NOT_VERIFIED("NotVerified"),

    /**
     * <summary>
     *             Supplied AVS data was incorrectly formatted.
     *             </summary>
     * 
     */
    @XmlEnumValue("BadFormat")
    BAD_FORMAT("BadFormat");
    private final String value;

    CityResult(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CityResult fromValue(String v) {
        for (CityResult c: CityResult.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
