
package com.ipcommerce.schemas.cws.v2_0.dataservices.billing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <summary> 
 *             Contains all defined billing event data.
 *             </summary>
 * 
 * <p>Java class for BillingEventDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingEventDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillingEventMetaData" type="{http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing}BillingEventMetaData" minOccurs="0"/>
 *         &lt;element name="SerializedBillingData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingEventDetail", propOrder = {
    "billingEventMetaData",
    "serializedBillingData"
})
public class BillingEventDetail {

    @XmlElementRef(name = "BillingEventMetaData", namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", type = JAXBElement.class, required = false)
    protected JAXBElement<BillingEventMetaData> billingEventMetaData;
    @XmlElementRef(name = "SerializedBillingData", namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serializedBillingData;

    /**
     * Gets the value of the billingEventMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BillingEventMetaData }{@code >}
     *     
     */
    public JAXBElement<BillingEventMetaData> getBillingEventMetaData() {
        return billingEventMetaData;
    }

    /**
     * Sets the value of the billingEventMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BillingEventMetaData }{@code >}
     *     
     */
    public void setBillingEventMetaData(JAXBElement<BillingEventMetaData> value) {
        this.billingEventMetaData = value;
    }

    /**
     * Gets the value of the serializedBillingData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSerializedBillingData() {
        return serializedBillingData;
    }

    /**
     * Sets the value of the serializedBillingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSerializedBillingData(JAXBElement<String> value) {
        this.serializedBillingData = value;
    }

}
