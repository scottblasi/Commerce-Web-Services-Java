
package com.ipcommerce.schemas.cws.v2_0.dataservices.billing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <summary>
 *             Contains summary data for billing event queries.
 *             </summary>
 * 
 * <p>Java class for BillingEventSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingEventSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Breakdown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Breakdown2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingEventSummary", propOrder = {
    "breakdown",
    "breakdown2",
    "eventCount",
    "sourceId",
    "sourceName"
})
public class BillingEventSummary {

    @XmlElementRef(name = "Breakdown", namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", type = JAXBElement.class, required = false)
    protected JAXBElement<String> breakdown;
    @XmlElementRef(name = "Breakdown2", namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", type = JAXBElement.class, required = false)
    protected JAXBElement<String> breakdown2;
    @XmlElement(name = "EventCount")
    protected Integer eventCount;
    @XmlElementRef(name = "SourceId", namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceId;
    @XmlElementRef(name = "SourceName", namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceName;

    /**
     * Gets the value of the breakdown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBreakdown() {
        return breakdown;
    }

    /**
     * Sets the value of the breakdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBreakdown(JAXBElement<String> value) {
        this.breakdown = value;
    }

    /**
     * Gets the value of the breakdown2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBreakdown2() {
        return breakdown2;
    }

    /**
     * Sets the value of the breakdown2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBreakdown2(JAXBElement<String> value) {
        this.breakdown2 = value;
    }

    /**
     * Gets the value of the eventCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEventCount() {
        return eventCount;
    }

    /**
     * Sets the value of the eventCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEventCount(Integer value) {
        this.eventCount = value;
    }

    /**
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceId(JAXBElement<String> value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the sourceName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceName() {
        return sourceName;
    }

    /**
     * Sets the value of the sourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceName(JAXBElement<String> value) {
        this.sourceName = value;
    }

}
