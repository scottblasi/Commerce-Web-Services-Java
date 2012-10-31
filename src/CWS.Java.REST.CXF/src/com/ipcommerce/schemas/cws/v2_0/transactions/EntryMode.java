
package com.ipcommerce.schemas.cws.v2_0.transactions;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntryMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntryMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Keyed"/>
 *     &lt;enumeration value="KeyedBadMagRead"/>
 *     &lt;enumeration value="TrackDataFromMSR"/>
 *     &lt;enumeration value="ChipReliable"/>
 *     &lt;enumeration value="ChipUnreliable"/>
 *     &lt;enumeration value="ContactlessMChipOrSmartCard"/>
 *     &lt;enumeration value="ContactlessStripe"/>
 *     &lt;enumeration value="TerminalNotUsed"/>
 *     &lt;enumeration value="BarCode"/>
 *     &lt;enumeration value="OCRReader"/>
 *     &lt;enumeration value="VSCCapable"/>
 *     &lt;enumeration value="ChipTrackDataFromRFID"/>
 *     &lt;enumeration value="MSRTrackDataFromRFID"/>
 *     &lt;enumeration value="NFCCapable"/>
 *     &lt;enumeration value="Track2DataFromMSR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntryMode")
@XmlEnum
public enum EntryMode {


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
     *             Keyed.
     *             </summary>
     * 
     */
    @XmlEnumValue("Keyed")
    KEYED("Keyed"),

    /**
     * <summary>
     *             Keyed after bad magnetic stripe read.
     *             </summary>
     * 
     */
    @XmlEnumValue("KeyedBadMagRead")
    KEYED_BAD_MAG_READ("KeyedBadMagRead"),

    /**
     * <summary>
     *             Track data read from MSR.
     *             </summary>
     * 
     */
    @XmlEnumValue("TrackDataFromMSR")
    TRACK_DATA_FROM_MSR("TrackDataFromMSR"),

    /**
     * <summary>
     *             Chip, reliable.
     *             </summary>
     * 
     */
    @XmlEnumValue("ChipReliable")
    CHIP_RELIABLE("ChipReliable"),

    /**
     * <summary>
     *             Chip, unreliable.
     *             </summary>
     * 
     */
    @XmlEnumValue("ChipUnreliable")
    CHIP_UNRELIABLE("ChipUnreliable"),

    /**
     * <summary>
     *             Contactless M/Chip or smart card.
     *             </summary>
     * 
     */
    @XmlEnumValue("ContactlessMChipOrSmartCard")
    CONTACTLESS_M_CHIP_OR_SMART_CARD("ContactlessMChipOrSmartCard"),

    /**
     * <summary>
     *             Contactless stripe.
     *             </summary>
     * 
     */
    @XmlEnumValue("ContactlessStripe")
    CONTACTLESS_STRIPE("ContactlessStripe"),

    /**
     * <summary>
     *             Terminal not used.
     *             </summary>
     * 
     */
    @XmlEnumValue("TerminalNotUsed")
    TERMINAL_NOT_USED("TerminalNotUsed"),

    /**
     * <summary>
     *             Bar code.
     *             </summary>
     * 
     */
    @XmlEnumValue("BarCode")
    BAR_CODE("BarCode"),

    /**
     * <summary>
     *             OCR reader.
     *             </summary>
     * 
     */
    @XmlEnumValue("OCRReader")
    OCR_READER("OCRReader"),

    /**
     * <summary>
     *             VSC capable.
     *             </summary>
     * 
     */
    @XmlEnumValue("VSCCapable")
    VSC_CAPABLE("VSCCapable"),

    /**
     * <summary>
     *             Chip track data read from RFID.
     *             </summary>
     * 
     */
    @XmlEnumValue("ChipTrackDataFromRFID")
    CHIP_TRACK_DATA_FROM_RFID("ChipTrackDataFromRFID"),

    /**
     * <summary>
     *             MSR track data read from RFID.
     *             </summary>
     * 
     */
    @XmlEnumValue("MSRTrackDataFromRFID")
    MSR_TRACK_DATA_FROM_RFID("MSRTrackDataFromRFID"),

    /**
     * <summary>
     *             NFC capable.
     *             </summary>
     * 
     */
    @XmlEnumValue("NFCCapable")
    NFC_CAPABLE("NFCCapable"),

    /**
     * <summary>
     *             Track data read from MSR.
     *             </summary>
     * 
     */
    @XmlEnumValue("Track2DataFromMSR")
    TRACK_2_DATA_FROM_MSR("Track2DataFromMSR");
    private final String value;

    EntryMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntryMode fromValue(String v) {
        for (EntryMode c: EntryMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
