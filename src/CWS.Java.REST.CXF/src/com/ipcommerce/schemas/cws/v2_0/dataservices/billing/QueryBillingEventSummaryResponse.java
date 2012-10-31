
package com.ipcommerce.schemas.cws.v2_0.dataservices.billing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueryBillingEventSummaryResult" type="{http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing}ArrayOfBillingEventSummary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "queryBillingEventSummaryResult"
})
@XmlRootElement(name = "QueryBillingEventSummaryResponse")
public class QueryBillingEventSummaryResponse {

    @XmlElementRef(name = "QueryBillingEventSummaryResult", namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBillingEventSummary> queryBillingEventSummaryResult;

    /**
     * Gets the value of the queryBillingEventSummaryResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBillingEventSummary }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBillingEventSummary> getQueryBillingEventSummaryResult() {
        return queryBillingEventSummaryResult;
    }

    /**
     * Sets the value of the queryBillingEventSummaryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBillingEventSummary }{@code >}
     *     
     */
    public void setQueryBillingEventSummaryResult(JAXBElement<ArrayOfBillingEventSummary> value) {
        this.queryBillingEventSummaryResult = value;
    }

}
