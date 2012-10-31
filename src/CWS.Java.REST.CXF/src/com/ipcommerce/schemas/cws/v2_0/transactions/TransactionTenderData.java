
package com.ipcommerce.schemas.cws.v2_0.transactions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.BankcardTenderData;
import com.ipcommerce.schemas.cws.v2_0.transactions.electronicchecking.ElectronicCheckingTenderData;
import com.ipcommerce.schemas.cws.v2_0.transactions.storedvalue.StoredValueTenderData;


/**
 * <p>Java class for TransactionTenderData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionTenderData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentAccountDataToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecurePaymentAccountData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EncryptionKeyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SwipeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionTenderData", propOrder = {
    "paymentAccountDataToken",
    "securePaymentAccountData",
    "encryptionKeyId",
    "swipeStatus"
})
@XmlSeeAlso({
    BankcardTenderData.class,
    ElectronicCheckingTenderData.class,
    StoredValueTenderData.class
})
public class TransactionTenderData {

    @XmlElement(name = "PaymentAccountDataToken", nillable = true)
    protected String paymentAccountDataToken;
    @XmlElement(name = "SecurePaymentAccountData", nillable = true)
    protected String securePaymentAccountData;
    @XmlElement(name = "EncryptionKeyId", nillable = true)
    protected String encryptionKeyId;
    @XmlElement(name = "SwipeStatus", nillable = true)
    protected String swipeStatus;

    /**
     * Gets the value of the paymentAccountDataToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAccountDataToken() {
        return paymentAccountDataToken;
    }

    /**
     * Sets the value of the paymentAccountDataToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAccountDataToken(String value) {
        this.paymentAccountDataToken = value;
    }

    /**
     * Gets the value of the securePaymentAccountData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurePaymentAccountData() {
        return securePaymentAccountData;
    }

    /**
     * Sets the value of the securePaymentAccountData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurePaymentAccountData(String value) {
        this.securePaymentAccountData = value;
    }

    /**
     * Gets the value of the encryptionKeyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionKeyId() {
        return encryptionKeyId;
    }

    /**
     * Sets the value of the encryptionKeyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionKeyId(String value) {
        this.encryptionKeyId = value;
    }

    /**
     * Gets the value of the swipeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwipeStatus() {
        return swipeStatus;
    }

    /**
     * Sets the value of the swipeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwipeStatus(String value) {
        this.swipeStatus = value;
    }

}
