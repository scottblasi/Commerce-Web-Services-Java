
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
 *         &lt;element name="authenticatingToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toRenewToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "authenticatingToken",
    "toRenewToken"
})
@XmlRootElement(name = "Renew")
public class Renew {

    @XmlElement(nillable = true)
    protected String authenticatingToken;
    @XmlElement(nillable = true)
    protected String toRenewToken;

    /**
     * Gets the value of the authenticatingToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticatingToken() {
        return authenticatingToken;
    }

    /**
     * Sets the value of the authenticatingToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticatingToken(String value) {
        this.authenticatingToken = value;
    }

    /**
     * Gets the value of the toRenewToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToRenewToken() {
        return toRenewToken;
    }

    /**
     * Sets the value of the toRenewToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToRenewToken(String value) {
        this.toRenewToken = value;
    }

}
