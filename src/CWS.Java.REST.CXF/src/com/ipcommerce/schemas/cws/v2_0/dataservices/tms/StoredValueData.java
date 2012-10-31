
package com.ipcommerce.schemas.cws.v2_0.dataservices.tms;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ipcommerce.schemas.cws.v2_0.transactions.CVResult;
import com.ipcommerce.schemas.cws.v2_0.transactions.storedvalue.CardStatus;


/**
 * <summary>
 *             Transaction information specific to Stored Value transactions. Conditional, included if the query includes Bankcard transactions.
 *             </summary>
 * 
 * <p>Java class for StoredValueData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoredValueData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CVResult" type="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions}CVResult" minOccurs="0"/>
 *         &lt;element name="CardRestrictionValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardStatus" type="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue}CardStatus" minOccurs="0"/>
 *         &lt;element name="NewBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoredValueData", propOrder = {
    "cvResult",
    "cardRestrictionValue",
    "cardStatus",
    "newBalance",
    "orderId",
    "previousBalance"
})
public class StoredValueData {

    @XmlElement(name = "CVResult")
    protected CVResult cvResult;
    @XmlElement(name = "CardRestrictionValue", nillable = true)
    protected String cardRestrictionValue;
    @XmlElement(name = "CardStatus")
    protected CardStatus cardStatus;
    @XmlElement(name = "NewBalance")
    protected BigDecimal newBalance;
    @XmlElement(name = "OrderId", nillable = true)
    protected String orderId;
    @XmlElement(name = "PreviousBalance")
    protected BigDecimal previousBalance;

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
     * Gets the value of the cardRestrictionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardRestrictionValue() {
        return cardRestrictionValue;
    }

    /**
     * Sets the value of the cardRestrictionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardRestrictionValue(String value) {
        this.cardRestrictionValue = value;
    }

    /**
     * Gets the value of the cardStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CardStatus }
     *     
     */
    public CardStatus getCardStatus() {
        return cardStatus;
    }

    /**
     * Sets the value of the cardStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardStatus }
     *     
     */
    public void setCardStatus(CardStatus value) {
        this.cardStatus = value;
    }

    /**
     * Gets the value of the newBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewBalance() {
        return newBalance;
    }

    /**
     * Sets the value of the newBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewBalance(BigDecimal value) {
        this.newBalance = value;
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

    /**
     * Gets the value of the previousBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreviousBalance() {
        return previousBalance;
    }

    /**
     * Sets the value of the previousBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreviousBalance(BigDecimal value) {
        this.previousBalance = value;
    }

}
