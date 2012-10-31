
package com.ipcommerce.schemas.identity._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClaimMetaData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimMetaData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClaimDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaimGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaimNs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaimType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaimValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Confidential" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimMetaData", propOrder = {
    "claimDescription",
    "claimGuid",
    "claimNs",
    "claimType",
    "claimValue",
    "confidential"
})
public class ClaimMetaData {

    @XmlElement(name = "ClaimDescription", nillable = true)
    protected String claimDescription;
    @XmlElement(name = "ClaimGuid", nillable = true)
    protected String claimGuid;
    @XmlElement(name = "ClaimNs", nillable = true)
    protected String claimNs;
    @XmlElement(name = "ClaimType", nillable = true)
    protected String claimType;
    @XmlElement(name = "ClaimValue", nillable = true)
    protected String claimValue;
    @XmlElement(name = "Confidential")
    protected Boolean confidential;

    /**
     * Gets the value of the claimDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimDescription() {
        return claimDescription;
    }

    /**
     * Sets the value of the claimDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimDescription(String value) {
        this.claimDescription = value;
    }

    /**
     * Gets the value of the claimGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimGuid() {
        return claimGuid;
    }

    /**
     * Sets the value of the claimGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimGuid(String value) {
        this.claimGuid = value;
    }

    /**
     * Gets the value of the claimNs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimNs() {
        return claimNs;
    }

    /**
     * Sets the value of the claimNs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimNs(String value) {
        this.claimNs = value;
    }

    /**
     * Gets the value of the claimType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimType() {
        return claimType;
    }

    /**
     * Sets the value of the claimType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimType(String value) {
        this.claimType = value;
    }

    /**
     * Gets the value of the claimValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimValue() {
        return claimValue;
    }

    /**
     * Sets the value of the claimValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimValue(String value) {
        this.claimValue = value;
    }

    /**
     * Gets the value of the confidential property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfidential() {
        return confidential;
    }

    /**
     * Sets the value of the confidential property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfidential(Boolean value) {
        this.confidential = value;
    }

}
