
package com.ipcommerce.schemas.cws.v2_0.transactions.storedvalue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IdType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="PIN"/>
 *     &lt;enumeration value="PINEncrypted"/>
 *     &lt;enumeration value="PINEncryptedKeySerialNumber"/>
 *     &lt;enumeration value="PhoneNumber"/>
 *     &lt;enumeration value="DriversLicenseNumber"/>
 *     &lt;enumeration value="EmailAddress"/>
 *     &lt;enumeration value="BiometricAlgorithm"/>
 *     &lt;enumeration value="BiometricMap"/>
 *     &lt;enumeration value="X509Certificate"/>
 *     &lt;enumeration value="Passphrase"/>
 *     &lt;enumeration value="Hash"/>
 *     &lt;enumeration value="PublicKey"/>
 *     &lt;enumeration value="RetinaAlg"/>
 *     &lt;enumeration value="RetinaMap"/>
 *     &lt;enumeration value="BarCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IdType")
@XmlEnum
public enum IdType {


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
     *             PIN
     *             </summary>
     * 
     */
    PIN("PIN"),

    /**
     * <summary>
     *             PIN Encrypted
     *             </summary>
     * 
     */
    @XmlEnumValue("PINEncrypted")
    PIN_ENCRYPTED("PINEncrypted"),

    /**
     * <summary>
     *             PIN Encrypted - Key Serial Number
     *             </summary>
     * 
     */
    @XmlEnumValue("PINEncryptedKeySerialNumber")
    PIN_ENCRYPTED_KEY_SERIAL_NUMBER("PINEncryptedKeySerialNumber"),

    /**
     * <summary>
     *             Phone Number
     *             </summary>
     * 
     */
    @XmlEnumValue("PhoneNumber")
    PHONE_NUMBER("PhoneNumber"),

    /**
     * <summary>
     *             Drivers License Number
     *             </summary>
     * 
     */
    @XmlEnumValue("DriversLicenseNumber")
    DRIVERS_LICENSE_NUMBER("DriversLicenseNumber"),

    /**
     * <summary>
     *             Email Address
     *             </summary>
     * 
     */
    @XmlEnumValue("EmailAddress")
    EMAIL_ADDRESS("EmailAddress"),

    /**
     * <summary>
     *             Biometric - Algorithm
     *             </summary>
     * 
     */
    @XmlEnumValue("BiometricAlgorithm")
    BIOMETRIC_ALGORITHM("BiometricAlgorithm"),

    /**
     * <summary>
     *             Biometric - Map
     *             </summary>
     * 
     */
    @XmlEnumValue("BiometricMap")
    BIOMETRIC_MAP("BiometricMap"),

    /**
     * <summary>
     *             x.509 Certificate
     *             </summary>
     * 
     */
    @XmlEnumValue("X509Certificate")
    X_509_CERTIFICATE("X509Certificate"),

    /**
     * <summary>
     *             Passphrase
     *             </summary>
     * 
     */
    @XmlEnumValue("Passphrase")
    PASSPHRASE("Passphrase"),

    /**
     * <summary>
     *             Hash
     *             </summary>
     * 
     */
    @XmlEnumValue("Hash")
    HASH("Hash"),

    /**
     * <summary>
     *             Public Key
     *             </summary>
     * 
     */
    @XmlEnumValue("PublicKey")
    PUBLIC_KEY("PublicKey"),

    /**
     * <summary>
     *             Retina Algorithm
     *             </summary>
     * 
     */
    @XmlEnumValue("RetinaAlg")
    RETINA_ALG("RetinaAlg"),

    /**
     * <summary>
     *             Retina Map
     *             </summary>
     * 
     */
    @XmlEnumValue("RetinaMap")
    RETINA_MAP("RetinaMap"),

    /**
     * <summary>
     *             Bar code
     *             </summary>
     * 
     */
    @XmlEnumValue("BarCode")
    BAR_CODE("BarCode");
    private final String value;

    IdType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IdType fromValue(String v) {
        for (IdType c: IdType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
