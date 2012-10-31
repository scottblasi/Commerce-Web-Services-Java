
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadCapability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReadCapability">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="HasMSR"/>
 *     &lt;enumeration value="NoMSR"/>
 *     &lt;enumeration value="KeyOnly"/>
 *     &lt;enumeration value="Chip"/>
 *     &lt;enumeration value="ContactlessChip"/>
 *     &lt;enumeration value="ContactlessMSR"/>
 *     &lt;enumeration value="ECR"/>
 *     &lt;enumeration value="VSCCapable"/>
 *     &lt;enumeration value="RFIDCapable"/>
 *     &lt;enumeration value="EmvICC"/>
 *     &lt;enumeration value="MSREMVICC"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="OCRReader"/>
 *     &lt;enumeration value="BarCodeReader"/>
 *     &lt;enumeration value="NotSpecified"/>
 *     &lt;enumeration value="ARUIVR"/>
 *     &lt;enumeration value="NoTerminal"/>
 *     &lt;enumeration value="NFCCapable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReadCapability")
@XmlEnum
public enum ReadCapability {


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
     *             Has MSR.
     *             </summary>
     * 
     */
    @XmlEnumValue("HasMSR")
    HAS_MSR("HasMSR"),

    /**
     * <summary>
     *             No MSR.
     *             </summary>
     * 
     */
    @XmlEnumValue("NoMSR")
    NO_MSR("NoMSR"),

    /**
     * <summary>
     *             Key only.
     *             </summary>
     * 
     */
    @XmlEnumValue("KeyOnly")
    KEY_ONLY("KeyOnly"),

    /**
     * <summary>
     *             Chip.
     *             </summary>
     * 
     */
    @XmlEnumValue("Chip")
    CHIP("Chip"),

    /**
     * <summary>
     *             Contactless chip.
     *             </summary>
     * 
     */
    @XmlEnumValue("ContactlessChip")
    CONTACTLESS_CHIP("ContactlessChip"),

    /**
     * <summary>
     *             Contactless MSR.
     *             </summary>
     * 
     */
    @XmlEnumValue("ContactlessMSR")
    CONTACTLESS_MSR("ContactlessMSR"),

    /**
     * <summary>
     *             ECR.
     *             </summary>
     * 
     */
    ECR("ECR"),

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
     *             RFID capable.
     *             </summary>
     * 
     */
    @XmlEnumValue("RFIDCapable")
    RFID_CAPABLE("RFIDCapable"),

    /**
     * <summary>
     *             EMV ICC.
     *             </summary>
     * 
     */
    @XmlEnumValue("EmvICC")
    EMV_ICC("EmvICC"),

    /**
     * <summary>
     *             MSR/EMV ICC.
     *             </summary>
     * 
     */
    MSREMVICC("MSREMVICC"),

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
     *             OCR reader.
     *             </summary>
     * 
     */
    @XmlEnumValue("OCRReader")
    OCR_READER("OCRReader"),

    /**
     * <summary>
     *             Bar code reader.
     *             </summary>
     * 
     */
    @XmlEnumValue("BarCodeReader")
    BAR_CODE_READER("BarCodeReader"),

    /**
     * <summary>
     *             Not specified.
     *             </summary>
     * 
     */
    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified"),

    /**
     * <summary>
     *             ARU/IVR.
     *             </summary>
     * 
     */
    ARUIVR("ARUIVR"),

    /**
     * <summary>
     *             No terminal.
     *             </summary>
     * 
     */
    @XmlEnumValue("NoTerminal")
    NO_TERMINAL("NoTerminal"),

    /**
     * <summary>
     *             NFC capable.
     *             </summary>
     * 
     */
    @XmlEnumValue("NFCCapable")
    NFC_CAPABLE("NFCCapable");
    private final String value;

    ReadCapability(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReadCapability fromValue(String v) {
        for (ReadCapability c: ReadCapability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
