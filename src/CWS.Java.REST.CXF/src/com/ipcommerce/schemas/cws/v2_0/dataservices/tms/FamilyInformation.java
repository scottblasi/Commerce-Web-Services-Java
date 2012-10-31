
package com.ipcommerce.schemas.cws.v2_0.dataservices.tms;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ipcommerce.schemas.cws.v2_0.transactions.TransactionState;
import com.microsoft.schemas._2003._10.serialization.Guid;


/**
 * <summary>
 *             Contains summary information for the family of transactions. Expected.
 *             </summary>
 * 
 * <p>Java class for FamilyInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FamilyInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FamilyId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="FamilySequenceCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FamilySequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FamilyState" type="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions}TransactionState" minOccurs="0"/>
 *         &lt;element name="NetAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FamilyInformation", propOrder = {
    "familyId",
    "familySequenceCount",
    "familySequenceNumber",
    "familyState",
    "netAmount"
})
public class FamilyInformation {

    @XmlElement(name = "FamilyId")
    protected Guid familyId;
    @XmlElement(name = "FamilySequenceCount")
    protected Integer familySequenceCount;
    @XmlElement(name = "FamilySequenceNumber")
    protected Integer familySequenceNumber;
    @XmlElement(name = "FamilyState")
    protected TransactionState familyState;
    @XmlElement(name = "NetAmount")
    protected BigDecimal netAmount;

    /**
     * Gets the value of the familyId property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getFamilyId() {
        return familyId;
    }

    /**
     * Sets the value of the familyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setFamilyId(Guid value) {
        this.familyId = value;
    }

    /**
     * Gets the value of the familySequenceCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFamilySequenceCount() {
        return familySequenceCount;
    }

    /**
     * Sets the value of the familySequenceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFamilySequenceCount(Integer value) {
        this.familySequenceCount = value;
    }

    /**
     * Gets the value of the familySequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFamilySequenceNumber() {
        return familySequenceNumber;
    }

    /**
     * Sets the value of the familySequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFamilySequenceNumber(Integer value) {
        this.familySequenceNumber = value;
    }

    /**
     * Gets the value of the familyState property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionState }
     *     
     */
    public TransactionState getFamilyState() {
        return familyState;
    }

    /**
     * Sets the value of the familyState property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionState }
     *     
     */
    public void setFamilyState(TransactionState value) {
        this.familyState = value;
    }

    /**
     * Gets the value of the netAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetAmount() {
        return netAmount;
    }

    /**
     * Sets the value of the netAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetAmount(BigDecimal value) {
        this.netAmount = value;
    }

}
