
package com.ipcommerce.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommercialCardResponse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommercialCardResponse">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="NotImplemented"/>
 *     &lt;enumeration value="PurchaseCard"/>
 *     &lt;enumeration value="CorporateCard"/>
 *     &lt;enumeration value="BusinessCard"/>
 *     &lt;enumeration value="NonCommercialCard"/>
 *     &lt;enumeration value="PurchaseCardDataUnsupported"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommercialCardResponse")
@XmlEnum
public enum CommercialCardResponse {


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
     *             Not implemented.
     *             </summary>
     * 
     */
    @XmlEnumValue("NotImplemented")
    NOT_IMPLEMENTED("NotImplemented"),

    /**
     * <summary>
     *             Purchase Card.
     *             </summary>
     * 
     */
    @XmlEnumValue("PurchaseCard")
    PURCHASE_CARD("PurchaseCard"),

    /**
     * <summary>
     *             Corporate Card.
     *             </summary>
     * 
     */
    @XmlEnumValue("CorporateCard")
    CORPORATE_CARD("CorporateCard"),

    /**
     * <summary>
     *             Business Card.
     *             </summary>
     * 
     */
    @XmlEnumValue("BusinessCard")
    BUSINESS_CARD("BusinessCard"),

    /**
     * <summary>
     *             Not a commercial card.
     *             </summary>
     * 
     */
    @XmlEnumValue("NonCommercialCard")
    NON_COMMERCIAL_CARD("NonCommercialCard"),

    /**
     * <summary>
     *             Commercial card does not support purchase card data.
     *             </summary>
     * 
     */
    @XmlEnumValue("PurchaseCardDataUnsupported")
    PURCHASE_CARD_DATA_UNSUPPORTED("PurchaseCardDataUnsupported"),

    /**
     * <summary>
     *             Unknown.
     *             </summary>
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    CommercialCardResponse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommercialCardResponse fromValue(String v) {
        for (CommercialCardResponse c: CommercialCardResponse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
