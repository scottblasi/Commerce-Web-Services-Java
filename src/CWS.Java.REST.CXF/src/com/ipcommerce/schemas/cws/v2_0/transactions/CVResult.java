
package com.ipcommerce.schemas.cws.v2_0.transactions;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CVResult.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CVResult">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Match"/>
 *     &lt;enumeration value="NoMatch"/>
 *     &lt;enumeration value="NotProcessed"/>
 *     &lt;enumeration value="NoCodePresent"/>
 *     &lt;enumeration value="ShouldHaveBeenPresent"/>
 *     &lt;enumeration value="IssuerNotCertified"/>
 *     &lt;enumeration value="Invalid"/>
 *     &lt;enumeration value="NoResponse"/>
 *     &lt;enumeration value="NotApplicable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CVResult")
@XmlEnum
public enum CVResult {


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
     *             CVV2/CVC2/CID match.
     *             </summary>
     * 
     */
    @XmlEnumValue("Match")
    MATCH("Match"),

    /**
     * <summary>
     *             CVV2/CVC2/CID do not match.
     *             </summary>
     * 
     */
    @XmlEnumValue("NoMatch")
    NO_MATCH("NoMatch"),

    /**
     * <summary>
     *             Not processed.
     *             </summary>
     * 
     */
    @XmlEnumValue("NotProcessed")
    NOT_PROCESSED("NotProcessed"),

    /**
     * <summary>
     *             Merchant has indicated that code is not present on card.
     *             </summary>
     * 
     */
    @XmlEnumValue("NoCodePresent")
    NO_CODE_PRESENT("NoCodePresent"),

    /**
     * <summary>
     *             CVV2 should have been present.
     *             </summary>
     * 
     */
    @XmlEnumValue("ShouldHaveBeenPresent")
    SHOULD_HAVE_BEEN_PRESENT("ShouldHaveBeenPresent"),

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
     *             CVV2/CVC2/CID is invalid.
     *             </summary>
     * 
     */
    @XmlEnumValue("Invalid")
    INVALID("Invalid"),

    /**
     * <summary>
     *             No response from card association.
     *             </summary>
     * 
     */
    @XmlEnumValue("NoResponse")
    NO_RESPONSE("NoResponse"),

    /**
     * <summary>
     *             CVV2/CVC2/CID is not applicable.
     *             </summary>
     * 
     */
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable");
    private final String value;

    CVResult(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CVResult fromValue(String v) {
        for (CVResult c: CVResult.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
