
package com.ipcommerce.schemas.cws.v2_0.dataservices.billing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.ipcommerce.schemas.cws.v2_0.dataservices.DateRange;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <summary>
 *             Contains the parameters for querying billing event data.
 *             </summary>
 * 
 * <p>Java class for QueryBillingEventParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryBillingEventParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillingEventSourceIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="BreakdownType" type="{http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing}BreakdownType" minOccurs="0"/>
 *         &lt;element name="EventDateRange" type="{http://schemas.ipcommerce.com/CWS/v2.0/DataServices}DateRange" minOccurs="0"/>
 *         &lt;element name="MerchantProfileIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="ServiceKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryBillingEventParameters", propOrder = {
    "billingEventSourceIds",
    "breakdownType",
    "eventDateRange",
    "merchantProfileIds",
    "serviceKeys"
})
public class QueryBillingEventParameters {

    @XmlElementRef(name = "BillingEventSourceIds", namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> billingEventSourceIds;
    @XmlElement(name = "BreakdownType")
    protected BreakdownType breakdownType;
    @XmlElementRef(name = "EventDateRange", namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", type = JAXBElement.class, required = false)
    protected JAXBElement<DateRange> eventDateRange;
    @XmlElementRef(name = "MerchantProfileIds", namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> merchantProfileIds;
    @XmlElementRef(name = "ServiceKeys", namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> serviceKeys;

    /**
     * Gets the value of the billingEventSourceIds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getBillingEventSourceIds() {
        return billingEventSourceIds;
    }

    /**
     * Sets the value of the billingEventSourceIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setBillingEventSourceIds(JAXBElement<ArrayOfstring> value) {
        this.billingEventSourceIds = value;
    }

    /**
     * Gets the value of the breakdownType property.
     * 
     * @return
     *     possible object is
     *     {@link BreakdownType }
     *     
     */
    public BreakdownType getBreakdownType() {
        return breakdownType;
    }

    /**
     * Sets the value of the breakdownType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BreakdownType }
     *     
     */
    public void setBreakdownType(BreakdownType value) {
        this.breakdownType = value;
    }

    /**
     * Gets the value of the eventDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateRange }{@code >}
     *     
     */
    public JAXBElement<DateRange> getEventDateRange() {
        return eventDateRange;
    }

    /**
     * Sets the value of the eventDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateRange }{@code >}
     *     
     */
    public void setEventDateRange(JAXBElement<DateRange> value) {
        this.eventDateRange = value;
    }

    /**
     * Gets the value of the merchantProfileIds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getMerchantProfileIds() {
        return merchantProfileIds;
    }

    /**
     * Sets the value of the merchantProfileIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setMerchantProfileIds(JAXBElement<ArrayOfstring> value) {
        this.merchantProfileIds = value;
    }

    /**
     * Gets the value of the serviceKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getServiceKeys() {
        return serviceKeys;
    }

    /**
     * Sets the value of the serviceKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setServiceKeys(JAXBElement<ArrayOfstring> value) {
        this.serviceKeys = value;
    }

}
