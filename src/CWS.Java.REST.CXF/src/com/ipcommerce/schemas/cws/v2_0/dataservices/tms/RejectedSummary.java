
package com.ipcommerce.schemas.cws.v2_0.dataservices.tms;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <summary>
 *             Summary information about the rejected transactions. Expected.
 *             </summary>
 * 
 * <p>Java class for RejectedSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RejectedSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditTransactionCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreditTransactionTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DebitTransactionCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DebitTransactionTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectedSummary", propOrder = {
    "creditTransactionCount",
    "creditTransactionTotal",
    "debitTransactionCount",
    "debitTransactionTotal"
})
public class RejectedSummary {

    @XmlElement(name = "CreditTransactionCount")
    protected Integer creditTransactionCount;
    @XmlElement(name = "CreditTransactionTotal")
    protected BigDecimal creditTransactionTotal;
    @XmlElement(name = "DebitTransactionCount")
    protected Integer debitTransactionCount;
    @XmlElement(name = "DebitTransactionTotal")
    protected BigDecimal debitTransactionTotal;

    /**
     * Gets the value of the creditTransactionCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreditTransactionCount() {
        return creditTransactionCount;
    }

    /**
     * Sets the value of the creditTransactionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreditTransactionCount(Integer value) {
        this.creditTransactionCount = value;
    }

    /**
     * Gets the value of the creditTransactionTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditTransactionTotal() {
        return creditTransactionTotal;
    }

    /**
     * Sets the value of the creditTransactionTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditTransactionTotal(BigDecimal value) {
        this.creditTransactionTotal = value;
    }

    /**
     * Gets the value of the debitTransactionCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDebitTransactionCount() {
        return debitTransactionCount;
    }

    /**
     * Sets the value of the debitTransactionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDebitTransactionCount(Integer value) {
        this.debitTransactionCount = value;
    }

    /**
     * Gets the value of the debitTransactionTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebitTransactionTotal() {
        return debitTransactionTotal;
    }

    /**
     * Sets the value of the debitTransactionTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebitTransactionTotal(BigDecimal value) {
        this.debitTransactionTotal = value;
    }

}
