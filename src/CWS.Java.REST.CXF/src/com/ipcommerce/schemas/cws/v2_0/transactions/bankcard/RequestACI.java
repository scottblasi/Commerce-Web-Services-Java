
package com.ipcommerce.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestACI.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestACI">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="NotCPSMeritCapable"/>
 *     &lt;enumeration value="IsCPSMeritCapable"/>
 *     &lt;enumeration value="CPSMeritCapableIncAuth"/>
 *     &lt;enumeration value="PremierCustomer"/>
 *     &lt;enumeration value="RecurringInstallment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequestACI")
@XmlEnum
public enum RequestACI {


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
     *             Not CPS/Merit capable.
     *             </summary>
     * 
     */
    @XmlEnumValue("NotCPSMeritCapable")
    NOT_CPS_MERIT_CAPABLE("NotCPSMeritCapable"),

    /**
     * <summary>
     *             Is CPS/Merit capable.
     *             </summary>
     * 
     */
    @XmlEnumValue("IsCPSMeritCapable")
    IS_CPS_MERIT_CAPABLE("IsCPSMeritCapable"),

    /**
     * <summary>
     *             CPS/Merit capable incremental authorization.
     *             </summary>
     * 
     */
    @XmlEnumValue("CPSMeritCapableIncAuth")
    CPS_MERIT_CAPABLE_INC_AUTH("CPSMeritCapableIncAuth"),

    /**
     * <summary>
     *             Premier customer.
     *             </summary>
     * 
     */
    @XmlEnumValue("PremierCustomer")
    PREMIER_CUSTOMER("PremierCustomer"),

    /**
     * <summary>
     *             Recurring/installment.
     *             </summary>
     * 
     */
    @XmlEnumValue("RecurringInstallment")
    RECURRING_INSTALLMENT("RecurringInstallment");
    private final String value;

    RequestACI(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestACI fromValue(String v) {
        for (RequestACI c: RequestACI.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
