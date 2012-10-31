
package com.ipcommerce.schemas.cws.v2_0.dataservices.billing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.ipcommerce.schemas.cws.v2_0.dataservices.PagingParameters;


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
 *         &lt;element name="sessionToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="queryBillingEventParameters" type="{http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing}QueryBillingEventParameters" minOccurs="0"/>
 *         &lt;element name="pagingParameters" type="{http://schemas.ipcommerce.com/CWS/v2.0/DataServices}PagingParameters" minOccurs="0"/>
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
    "sessionToken",
    "queryBillingEventParameters",
    "pagingParameters"
})
@XmlRootElement(name = "QueryBillingEventSummary")
public class QueryBillingEventSummary {

    @XmlElementRef(name = "sessionToken", namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sessionToken;
    @XmlElementRef(name = "queryBillingEventParameters", namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryBillingEventParameters> queryBillingEventParameters;
    @XmlElementRef(name = "pagingParameters", namespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing", type = JAXBElement.class, required = false)
    protected JAXBElement<PagingParameters> pagingParameters;

    /**
     * Gets the value of the sessionToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSessionToken() {
        return sessionToken;
    }

    /**
     * Sets the value of the sessionToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSessionToken(JAXBElement<String> value) {
        this.sessionToken = value;
    }

    /**
     * Gets the value of the queryBillingEventParameters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryBillingEventParameters }{@code >}
     *     
     */
    public JAXBElement<QueryBillingEventParameters> getQueryBillingEventParameters() {
        return queryBillingEventParameters;
    }

    /**
     * Sets the value of the queryBillingEventParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryBillingEventParameters }{@code >}
     *     
     */
    public void setQueryBillingEventParameters(JAXBElement<QueryBillingEventParameters> value) {
        this.queryBillingEventParameters = value;
    }

    /**
     * Gets the value of the pagingParameters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PagingParameters }{@code >}
     *     
     */
    public JAXBElement<PagingParameters> getPagingParameters() {
        return pagingParameters;
    }

    /**
     * Sets the value of the pagingParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PagingParameters }{@code >}
     *     
     */
    public void setPagingParameters(JAXBElement<PagingParameters> value) {
        this.pagingParameters = value;
    }

}
