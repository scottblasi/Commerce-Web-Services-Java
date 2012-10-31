
package com.ipcommerce.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdviceResponse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdviceResponse">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Unsupported"/>
 *     &lt;enumeration value="NewAccountInfoAvailable"/>
 *     &lt;enumeration value="TryAgainLater"/>
 *     &lt;enumeration value="DoNotTryAgainLater"/>
 *     &lt;enumeration value="DoNotHonor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdviceResponse")
@XmlEnum
public enum AdviceResponse {


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
     *             Not supported.
     *             </summary>
     * 
     */
    @XmlEnumValue("Unsupported")
    UNSUPPORTED("Unsupported"),

    /**
     * <summary>
     *             New account info available.
     *             </summary>
     * 
     */
    @XmlEnumValue("NewAccountInfoAvailable")
    NEW_ACCOUNT_INFO_AVAILABLE("NewAccountInfoAvailable"),

    /**
     * <summary>
     *             Try again later.
     *             </summary>
     * 
     */
    @XmlEnumValue("TryAgainLater")
    TRY_AGAIN_LATER("TryAgainLater"),

    /**
     * <summary>
     *             Do not try again later.
     *             </summary>
     * 
     */
    @XmlEnumValue("DoNotTryAgainLater")
    DO_NOT_TRY_AGAIN_LATER("DoNotTryAgainLater"),

    /**
     * <summary>
     *             Service provider recommends the merchant not honor the card.
     *             </summary>
     * 
     */
    @XmlEnumValue("DoNotHonor")
    DO_NOT_HONOR("DoNotHonor");
    private final String value;

    AdviceResponse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdviceResponse fromValue(String v) {
        for (AdviceResponse c: AdviceResponse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
