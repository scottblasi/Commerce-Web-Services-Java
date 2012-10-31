
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="FederatedSignOnAndAddClaimsResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "federatedSignOnAndAddClaimsResult"
})
@XmlRootElement(name = "FederatedSignOnAndAddClaimsResponse")
public class FederatedSignOnAndAddClaimsResponse {

    @XmlElement(name = "FederatedSignOnAndAddClaimsResult", nillable = true)
    protected String federatedSignOnAndAddClaimsResult;

    /**
     * Gets the value of the federatedSignOnAndAddClaimsResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederatedSignOnAndAddClaimsResult() {
        return federatedSignOnAndAddClaimsResult;
    }

    /**
     * Sets the value of the federatedSignOnAndAddClaimsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederatedSignOnAndAddClaimsResult(String value) {
        this.federatedSignOnAndAddClaimsResult = value;
    }

}
