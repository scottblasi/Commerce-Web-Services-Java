
package com.ipcommerce.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerPresent.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerPresent">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Present"/>
 *     &lt;enumeration value="Suspicious"/>
 *     &lt;enumeration value="BillPayment"/>
 *     &lt;enumeration value="Transponder"/>
 *     &lt;enumeration value="MOTO"/>
 *     &lt;enumeration value="VisaOpenNetworkTransaction"/>
 *     &lt;enumeration value="VisaCardPresentStripeUnreadable"/>
 *     &lt;enumeration value="MailFax"/>
 *     &lt;enumeration value="Ecommerce"/>
 *     &lt;enumeration value="TelARU"/>
 *     &lt;enumeration value="MOTOCC"/>
 *     &lt;enumeration value="VoiceResponse"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerPresent")
@XmlEnum
public enum CustomerPresent {


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
     *             Cardholder and card present.
     *             </summary>
     * 
     */
    @XmlEnumValue("Present")
    PRESENT("Present"),

    /**
     * <summary>
     *             Suspicious.
     *             </summary>
     * 
     */
    @XmlEnumValue("Suspicious")
    SUSPICIOUS("Suspicious"),

    /**
     * <summary>
     *             Bill payment transaction.
     *             </summary>
     * 
     */
    @XmlEnumValue("BillPayment")
    BILL_PAYMENT("BillPayment"),

    /**
     * <summary>
     *             Transponder.
     *             </summary>
     * 
     */
    @XmlEnumValue("Transponder")
    TRANSPONDER("Transponder"),

    /**
     * <summary>
     *             MOTO.
     *             </summary>
     * 
     */
    MOTO("MOTO"),

    /**
     * <summary>
     *             Open network transaction (Visa only).
     *             </summary>
     * 
     */
    @XmlEnumValue("VisaOpenNetworkTransaction")
    VISA_OPEN_NETWORK_TRANSACTION("VisaOpenNetworkTransaction"),

    /**
     * <summary>
     *             Card present, stripe can't be read (Visa only).
     *             </summary>
     * 
     */
    @XmlEnumValue("VisaCardPresentStripeUnreadable")
    VISA_CARD_PRESENT_STRIPE_UNREADABLE("VisaCardPresentStripeUnreadable"),

    /**
     * <summary>
     *             Mail/fax.
     *             </summary>
     * 
     */
    @XmlEnumValue("MailFax")
    MAIL_FAX("MailFax"),

    /**
     * <summary>
     *             Ecommerce.
     *             </summary>
     * 
     */
    @XmlEnumValue("Ecommerce")
    ECOMMERCE("Ecommerce"),

    /**
     * <summary>
     *             Telephone ARU (Automated Response Unit).
     *             </summary>
     * 
     */
    @XmlEnumValue("TelARU")
    TEL_ARU("TelARU"),

    /**
     * <summary>
     *             MOTO call center.
     *             </summary>
     * 
     */
    MOTOCC("MOTOCC"),

    /**
     * <summary>
     *             Voice response system.
     *             </summary>
     * 
     */
    @XmlEnumValue("VoiceResponse")
    VOICE_RESPONSE("VoiceResponse");
    private final String value;

    CustomerPresent(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerPresent fromValue(String v) {
        for (CustomerPresent c: CustomerPresent.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
