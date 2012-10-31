
package com.ipcommerce.schemas.cws.v2_0.dataservices.tms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <summary>
 *             The complete transaction, either in CWS format or serialized XML. Conditional, included if querying transaction detail.
 *             </summary>
 * 
 * <p>Java class for CompleteTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompleteTransaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CWSTransaction" type="{http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS}CWSTransaction" minOccurs="0"/>
 *         &lt;element name="SerializedTransaction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompleteTransaction", propOrder = {
    "cwsTransaction",
    "serializedTransaction"
})
public class CompleteTransaction {

    @XmlElement(name = "CWSTransaction", nillable = true)
    protected CWSTransaction cwsTransaction;
    @XmlElement(name = "SerializedTransaction", nillable = true)
    protected String serializedTransaction;

    /**
     * Gets the value of the cwsTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link CWSTransaction }
     *     
     */
    public CWSTransaction getCWSTransaction() {
        return cwsTransaction;
    }

    /**
     * Sets the value of the cwsTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CWSTransaction }
     *     
     */
    public void setCWSTransaction(CWSTransaction value) {
        this.cwsTransaction = value;
    }

    /**
     * Gets the value of the serializedTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerializedTransaction() {
        return serializedTransaction;
    }

    /**
     * Sets the value of the serializedTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerializedTransaction(String value) {
        this.serializedTransaction = value;
    }

}
