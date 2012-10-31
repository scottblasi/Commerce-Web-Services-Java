
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
 *         &lt;element name="identityToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalDomainToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "identityToken",
    "externalDomainToken"
})
@XmlRootElement(name = "FederatedSignOn")
public class FederatedSignOn {

    @XmlElement(nillable = true)
    protected String identityToken;
    @XmlElement(nillable = true)
    protected String externalDomainToken;

    /**
     * Gets the value of the identityToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityToken() {
        return identityToken;
    }

    /**
     * Sets the value of the identityToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityToken(String value) {
        this.identityToken = value;
    }

    /**
     * Gets the value of the externalDomainToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalDomainToken() {
        return externalDomainToken;
    }

    /**
     * Sets the value of the externalDomainToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalDomainToken(String value) {
        this.externalDomainToken = value;
    }

}
