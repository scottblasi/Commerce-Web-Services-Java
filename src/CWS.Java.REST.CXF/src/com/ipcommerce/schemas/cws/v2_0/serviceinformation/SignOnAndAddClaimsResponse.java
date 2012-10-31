
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
 *         &lt;element name="SignOnAndAddClaimsResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "signOnAndAddClaimsResult"
})
@XmlRootElement(name = "SignOnAndAddClaimsResponse")
public class SignOnAndAddClaimsResponse {

    @XmlElement(name = "SignOnAndAddClaimsResult", nillable = true)
    protected String signOnAndAddClaimsResult;

    /**
     * Gets the value of the signOnAndAddClaimsResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignOnAndAddClaimsResult() {
        return signOnAndAddClaimsResult;
    }

    /**
     * Sets the value of the signOnAndAddClaimsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignOnAndAddClaimsResult(String value) {
        this.signOnAndAddClaimsResult = value;
    }

}
