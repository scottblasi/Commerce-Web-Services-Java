
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.ipcommerce.schemas.identity._1.ArrayOfClaimMetaData;


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
 *         &lt;element name="claims" type="{http://schemas.ipcommerce.com/Identity/1.0/}ArrayOfClaimMetaData" minOccurs="0"/>
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
    "claims"
})
@XmlRootElement(name = "SignOnAndAddClaims")
public class SignOnAndAddClaims {

    @XmlElement(nillable = true)
    protected String identityToken;
    @XmlElement(nillable = true)
    protected ArrayOfClaimMetaData claims;

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
     * Gets the value of the claims property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClaimMetaData }
     *     
     */
    public ArrayOfClaimMetaData getClaims() {
        return claims;
    }

    /**
     * Sets the value of the claims property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClaimMetaData }
     *     
     */
    public void setClaims(ArrayOfClaimMetaData value) {
        this.claims = value;
    }

}
