
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HardwareType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HardwareType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="PC"/>
 *     &lt;enumeration value="DialTerminal"/>
 *     &lt;enumeration value="ElectronicCashRegister"/>
 *     &lt;enumeration value="InStoreController"/>
 *     &lt;enumeration value="Mainframe"/>
 *     &lt;enumeration value="ThirdPartyDeveloper"/>
 *     &lt;enumeration value="POSPort"/>
 *     &lt;enumeration value="POSPartner"/>
 *     &lt;enumeration value="TicketMachine"/>
 *     &lt;enumeration value="ATM"/>
 *     &lt;enumeration value="ScripDevice"/>
 *     &lt;enumeration value="Telephone"/>
 *     &lt;enumeration value="InitiatedCAT"/>
 *     &lt;enumeration value="VirtualTerminal"/>
 *     &lt;enumeration value="MobileBanking"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HardwareType")
@XmlEnum
public enum HardwareType {


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
     *             Unknown.
     *             </summary>
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * <summary>
     *             PC.
     *             </summary>
     * 
     */
    PC("PC"),

    /**
     * <summary>
     *             Dial Terminal.
     *             </summary>
     * 
     */
    @XmlEnumValue("DialTerminal")
    DIAL_TERMINAL("DialTerminal"),

    /**
     * <summary>
     *             Electronic Cash Register.
     *             </summary>
     * 
     */
    @XmlEnumValue("ElectronicCashRegister")
    ELECTRONIC_CASH_REGISTER("ElectronicCashRegister"),

    /**
     * <summary>
     *             In-Store Controller.
     *             </summary>
     * 
     */
    @XmlEnumValue("InStoreController")
    IN_STORE_CONTROLLER("InStoreController"),

    /**
     * <summary>
     *             Mainframe.
     *             </summary>
     * 
     */
    @XmlEnumValue("Mainframe")
    MAINFRAME("Mainframe"),

    /**
     * <summary>
     *             Third-party Developer.
     *             </summary>
     * 
     */
    @XmlEnumValue("ThirdPartyDeveloper")
    THIRD_PARTY_DEVELOPER("ThirdPartyDeveloper"),

    /**
     * <summary>
     *             POS Port.
     *             </summary>
     * 
     */
    @XmlEnumValue("POSPort")
    POS_PORT("POSPort"),

    /**
     * <summary>
     *             POS Partner.
     *             </summary>
     * 
     */
    @XmlEnumValue("POSPartner")
    POS_PARTNER("POSPartner"),

    /**
     * <summary>
     *             Ticket Machine/Kiosk.
     *             </summary>
     * 
     */
    @XmlEnumValue("TicketMachine")
    TICKET_MACHINE("TicketMachine"),

    /**
     * <summary>
     *             ATM
     *             </summary>
     * 
     */
    ATM("ATM"),

    /**
     * <summary>
     *             Scrip Device
     *             </summary>
     * 
     */
    @XmlEnumValue("ScripDevice")
    SCRIP_DEVICE("ScripDevice"),

    /**
     * <summary>
     *             Telephone
     *             </summary>
     * 
     */
    @XmlEnumValue("Telephone")
    TELEPHONE("Telephone"),

    /**
     * <summary>
     *             Initiated CAT
     *             </summary>
     * 
     */
    @XmlEnumValue("InitiatedCAT")
    INITIATED_CAT("InitiatedCAT"),

    /**
     * <summary>
     *             Virtual Terminal
     *             </summary>
     * 
     */
    @XmlEnumValue("VirtualTerminal")
    VIRTUAL_TERMINAL("VirtualTerminal"),

    /**
     * <summary>
     *             Mobile Banking
     *             </summary>
     * 
     */
    @XmlEnumValue("MobileBanking")
    MOBILE_BANKING("MobileBanking");
    private final String value;

    HardwareType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HardwareType fromValue(String v) {
        for (HardwareType c: HardwareType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
