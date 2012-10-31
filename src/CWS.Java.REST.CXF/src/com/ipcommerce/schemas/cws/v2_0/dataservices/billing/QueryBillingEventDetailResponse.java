
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
 *         &lt;element name="QueryBillingEventDetailResult" type="{http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing}ArrayOfBillingEventDetail" minOccurs="0"/>
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
    "queryBillingEventDetailResult"
})
@XmlRootElement(name = "QueryBillingEventDetailResponse")
public class QueryBillingEventDetailResponse {

    @XmlElementRef(name = "QueryBillingEventDetailResult", namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBillingEventDetail> queryBillingEventDetailResult;

    /**
     * Gets the value of the queryBillingEventDetailResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBillingEventDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBillingEventDetail> getQueryBillingEventDetailResult() {
        return queryBillingEventDetailResult;
    }

    /**
     * Sets the value of the queryBillingEventDetailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBillingEventDetail }{@code >}
     *     
     */
    public void setQueryBillingEventDetailResult(JAXBElement<ArrayOfBillingEventDetail> value) {
        this.queryBillingEventDetailResult = value;
    }

}
