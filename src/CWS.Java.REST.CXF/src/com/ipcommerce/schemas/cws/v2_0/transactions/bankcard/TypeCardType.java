
package com.ipcommerce.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeCardType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeCardType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="PrivateLabel"/>
 *     &lt;enumeration value="Visa"/>
 *     &lt;enumeration value="MasterCard"/>
 *     &lt;enumeration value="AmericanExpress"/>
 *     &lt;enumeration value="DinersCartBlanche"/>
 *     &lt;enumeration value="Discover"/>
 *     &lt;enumeration value="JCB"/>
 *     &lt;enumeration value="CitibankFinancial"/>
 *     &lt;enumeration value="RevolutionCard"/>
 *     &lt;enumeration value="UnbrandedATM"/>
 *     &lt;enumeration value="Dankort"/>
 *     &lt;enumeration value="Solo"/>
 *     &lt;enumeration value="Maestro"/>
 *     &lt;enumeration value="LaserCard"/>
 *     &lt;enumeration value="Electron"/>
 *     &lt;enumeration value="Finax"/>
 *     &lt;enumeration value="Kopkort"/>
 *     &lt;enumeration value="CarteAurore"/>
 *     &lt;enumeration value="CartesBancaires"/>
 *     &lt;enumeration value="DinersClub"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeCardType")
@XmlEnum
public enum TypeCardType {


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
     *             Private Label.
     *             </summary>
     * 
     */
    @XmlEnumValue("PrivateLabel")
    PRIVATE_LABEL("PrivateLabel"),

    /**
     * <summary>
     *             Visa.
     *             </summary>
     * 
     */
    @XmlEnumValue("Visa")
    VISA("Visa"),

    /**
     * <summary>
     *             MasterCard.
     *             </summary>
     * 
     */
    @XmlEnumValue("MasterCard")
    MASTER_CARD("MasterCard"),

    /**
     * <summary>
     *             American Express.
     *             </summary>
     * 
     */
    @XmlEnumValue("AmericanExpress")
    AMERICAN_EXPRESS("AmericanExpress"),

    /**
     * <summary>
     *             Diners/Cart Blanche. DEPRECATED: Use MasterCard instead.
     *             </summary>
     * 
     */
    @XmlEnumValue("DinersCartBlanche")
    DINERS_CART_BLANCHE("DinersCartBlanche"),

    /**
     * <summary>
     *             Discover.
     *             </summary>
     * 
     */
    @XmlEnumValue("Discover")
    DISCOVER("Discover"),

    /**
     * <summary>
     *             JCB.
     *             </summary>
     * 
     */
    JCB("JCB"),

    /**
     * <summary>
     *             Citibank Financial.
     *             </summary>
     * 
     */
    @XmlEnumValue("CitibankFinancial")
    CITIBANK_FINANCIAL("CitibankFinancial"),

    /**
     * <summary>
     *             RevolutionCard.
     *             </summary>
     * 
     */
    @XmlEnumValue("RevolutionCard")
    REVOLUTION_CARD("RevolutionCard"),

    /**
     * <summary>
     *             UnbrandedATM.
     *             </summary>
     * 
     */
    @XmlEnumValue("UnbrandedATM")
    UNBRANDED_ATM("UnbrandedATM"),

    /**
     * <summary>
     *             Dankort
     *             </summary>
     * 
     */
    @XmlEnumValue("Dankort")
    DANKORT("Dankort"),

    /**
     * <summary>
     *             Solo
     *             </summary>
     * 
     */
    @XmlEnumValue("Solo")
    SOLO("Solo"),

    /**
     * <summary>
     *             Maestro
     *             </summary>
     * 
     */
    @XmlEnumValue("Maestro")
    MAESTRO("Maestro"),

    /**
     * <summary>
     *             LaserCard
     *             </summary>
     * 
     */
    @XmlEnumValue("LaserCard")
    LASER_CARD("LaserCard"),

    /**
     * <summary>
     *             Electron
     *             </summary>
     * 
     */
    @XmlEnumValue("Electron")
    ELECTRON("Electron"),

    /**
     * <summary>
     *             Finax
     *             </summary>
     * 
     */
    @XmlEnumValue("Finax")
    FINAX("Finax"),

    /**
     * <summary>
     *             Köpkort
     *             </summary>
     * 
     */
    @XmlEnumValue("Kopkort")
    KOPKORT("Kopkort"),

    /**
     * <summary>
     *             Carte Aurore
     *             </summary>
     * 
     */
    @XmlEnumValue("CarteAurore")
    CARTE_AURORE("CarteAurore"),

    /**
     * <summary>
     *             Cartes Bancaires
     *             </summary>
     * 
     */
    @XmlEnumValue("CartesBancaires")
    CARTES_BANCAIRES("CartesBancaires"),

    /**
     * <summary>
     *             Diners Club (International)
     *             </summary>
     * 
     */
    @XmlEnumValue("DinersClub")
    DINERS_CLUB("DinersClub");
    private final String value;

    TypeCardType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCardType fromValue(String v) {
        for (TypeCardType c: TypeCardType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
