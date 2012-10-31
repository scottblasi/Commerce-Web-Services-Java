
package com.ipcommerce.schemas.cws.v2_0.dataservices.tms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <summary>
 *             Contains transaction summary information. Expected.
 *             </summary>
 * 
 * <p>Java class for SummaryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummaryDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FamilyInformation" type="{http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS}FamilyInformation" minOccurs="0"/>
 *         &lt;element name="TransactionInformation" type="{http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS}TransactionInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryDetail", propOrder = {
    "familyInformation",
    "transactionInformation"
})
public class SummaryDetail {

    @XmlElement(name = "FamilyInformation", nillable = true)
    protected FamilyInformation familyInformation;
    @XmlElement(name = "TransactionInformation", nillable = true)
    protected TransactionInformation transactionInformation;

    /**
     * Gets the value of the familyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FamilyInformation }
     *     
     */
    public FamilyInformation getFamilyInformation() {
        return familyInformation;
    }

    /**
     * Sets the value of the familyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FamilyInformation }
     *     
     */
    public void setFamilyInformation(FamilyInformation value) {
        this.familyInformation = value;
    }

    /**
     * Gets the value of the transactionInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInformation }
     *     
     */
    public TransactionInformation getTransactionInformation() {
        return transactionInformation;
    }

    /**
     * Sets the value of the transactionInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInformation }
     *     
     */
    public void setTransactionInformation(TransactionInformation value) {
        this.transactionInformation = value;
    }

}
