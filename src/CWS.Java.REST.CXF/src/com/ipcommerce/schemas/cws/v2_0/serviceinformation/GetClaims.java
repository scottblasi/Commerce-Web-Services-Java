
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


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
 *         &lt;element name="verifiedToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimNSs" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
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
    "verifiedToken",
    "claimNSs"
})
@XmlRootElement(name = "GetClaims")
public class GetClaims {

    @XmlElement(nillable = true)
    protected String authenticatingToken;
    @XmlElement(nillable = true)
    protected String verifiedToken;
    @XmlElement(nillable = true)
    protected ArrayOfstring claimNSs;

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
     * Gets the value of the verifiedToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifiedToken() {
        return verifiedToken;
    }

    /**
     * Sets the value of the verifiedToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifiedToken(String value) {
        this.verifiedToken = value;
    }

    /**
     * Gets the value of the claimNSs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getClaimNSs() {
        return claimNSs;
    }

    /**
     * Sets the value of the claimNSs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setClaimNSs(ArrayOfstring value) {
        this.claimNSs = value;
    }

}
