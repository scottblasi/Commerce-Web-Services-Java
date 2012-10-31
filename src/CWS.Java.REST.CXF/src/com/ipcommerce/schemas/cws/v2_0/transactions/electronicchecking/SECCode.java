
package com.ipcommerce.schemas.cws.v2_0.transactions.electronicchecking;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SECCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SECCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="BOC"/>
 *     &lt;enumeration value="CCD"/>
 *     &lt;enumeration value="PPD"/>
 *     &lt;enumeration value="TEL"/>
 *     &lt;enumeration value="WEB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SECCode")
@XmlEnum
public enum SECCode {


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
     *             Back Office Conversion.
     *             </summary>
     * 
     */
    BOC("BOC"),

    /**
     * <summary>
     *             Corporate Cash Disbursement.
     *             </summary>
     * 
     */
    CCD("CCD"),

    /**
     * <summary>
     *             Prearranged Payment and Deposits.
     *             </summary>
     * 
     */
    PPD("PPD"),

    /**
     * <summary>
     *             Telephone-initiated Entry.
     *             </summary>
     * 
     */
    TEL("TEL"),

    /**
     * <summary>
     *             Web-initiated Entry.
     *             </summary>
     * 
     */
    WEB("WEB");
    private final String value;

    SECCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SECCode fromValue(String v) {
        for (SECCode c: SECCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
