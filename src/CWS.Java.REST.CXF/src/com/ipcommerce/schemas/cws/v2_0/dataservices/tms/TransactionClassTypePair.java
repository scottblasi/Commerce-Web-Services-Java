
package com.ipcommerce.schemas.cws.v2_0.dataservices.tms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <summary>
 *             Defines a contract for an expected pairing of transaction class and transaction type. Optional on request, expected on response.
 *             </summary>
 * 
 * <p>Java class for TransactionClassTypePair complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionClassTypePair">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionClassTypePair", propOrder = {
    "transactionClass",
    "transactionType"
})
public class TransactionClassTypePair {

    @XmlElement(name = "TransactionClass", nillable = true)
    protected String transactionClass;
    @XmlElement(name = "TransactionType", nillable = true)
    protected String transactionType;

    /**
     * Gets the value of the transactionClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionClass() {
        return transactionClass;
    }

    /**
     * Sets the value of the transactionClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionClass(String value) {
        this.transactionClass = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

}
