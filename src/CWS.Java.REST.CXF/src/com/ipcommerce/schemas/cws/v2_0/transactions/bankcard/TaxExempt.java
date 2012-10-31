
package com.ipcommerce.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <summary>
 *             Tax exemption indicator and number. Optional.
 *             </summary>
 * 
 * <p>Java class for TaxExempt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxExempt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsTaxExempt" type="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard}IsTaxExempt" minOccurs="0"/>
 *         &lt;element name="TaxExemptNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxExempt", propOrder = {
    "isTaxExempt",
    "taxExemptNumber"
})
public class TaxExempt {

    @XmlElement(name = "IsTaxExempt")
    protected IsTaxExempt isTaxExempt;
    @XmlElement(name = "TaxExemptNumber", nillable = true)
    protected String taxExemptNumber;

    /**
     * Gets the value of the isTaxExempt property.
     * 
     * @return
     *     possible object is
     *     {@link IsTaxExempt }
     *     
     */
    public IsTaxExempt getIsTaxExempt() {
        return isTaxExempt;
    }

    /**
     * Sets the value of the isTaxExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsTaxExempt }
     *     
     */
    public void setIsTaxExempt(IsTaxExempt value) {
        this.isTaxExempt = value;
    }

    /**
     * Gets the value of the taxExemptNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxExemptNumber() {
        return taxExemptNumber;
    }

    /**
     * Sets the value of the taxExemptNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxExemptNumber(String value) {
        this.taxExemptNumber = value;
    }

}
