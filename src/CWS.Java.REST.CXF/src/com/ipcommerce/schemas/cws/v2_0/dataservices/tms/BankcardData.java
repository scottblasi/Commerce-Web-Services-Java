
package com.ipcommerce.schemas.cws.v2_0.dataservices.tms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ipcommerce.schemas.cws.v2_0.transactions.CVResult;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.AVSResult;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.TypeCardType;


/**
 * <summary>
 *             Transaction information specific to Bankcard transactions. Conditional, included if the query includes Bankcard transactions.
 *             </summary>
 * 
 * <p>Java class for BankcardData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankcardData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AVSResult" type="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard}AVSResult" minOccurs="0"/>
 *         &lt;element name="CVResult" type="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions}CVResult" minOccurs="0"/>
 *         &lt;element name="CardType" type="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard}TypeCardType" minOccurs="0"/>
 *         &lt;element name="MaskedPAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankcardData", propOrder = {
    "avsResult",
    "cvResult",
    "cardType",
    "maskedPAN",
    "orderId"
})
public class BankcardData {

    @XmlElement(name = "AVSResult", nillable = true)
    protected AVSResult avsResult;
    @XmlElement(name = "CVResult")
    protected CVResult cvResult;
    @XmlElement(name = "CardType")
    protected TypeCardType cardType;
    @XmlElement(name = "MaskedPAN", nillable = true)
    protected String maskedPAN;
    @XmlElement(name = "OrderId", nillable = true)
    protected String orderId;

    /**
     * Gets the value of the avsResult property.
     * 
     * @return
     *     possible object is
     *     {@link AVSResult }
     *     
     */
    public AVSResult getAVSResult() {
        return avsResult;
    }

    /**
     * Sets the value of the avsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AVSResult }
     *     
     */
    public void setAVSResult(AVSResult value) {
        this.avsResult = value;
    }

    /**
     * Gets the value of the cvResult property.
     * 
     * @return
     *     possible object is
     *     {@link CVResult }
     *     
     */
    public CVResult getCVResult() {
        return cvResult;
    }

    /**
     * Sets the value of the cvResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVResult }
     *     
     */
    public void setCVResult(CVResult value) {
        this.cvResult = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCardType }
     *     
     */
    public TypeCardType getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCardType }
     *     
     */
    public void setCardType(TypeCardType value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the maskedPAN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskedPAN() {
        return maskedPAN;
    }

    /**
     * Sets the value of the maskedPAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskedPAN(String value) {
        this.maskedPAN = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

}
