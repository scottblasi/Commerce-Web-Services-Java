
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
 *         &lt;element name="GetAllClaimsResult" type="{http://schemas.ipcommerce.com/Identity/1.0/}ArrayOfClaimMetaData" minOccurs="0"/>
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
    "getAllClaimsResult"
})
@XmlRootElement(name = "GetAllClaimsResponse")
public class GetAllClaimsResponse {

    @XmlElement(name = "GetAllClaimsResult", nillable = true)
    protected ArrayOfClaimMetaData getAllClaimsResult;

    /**
     * Gets the value of the getAllClaimsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClaimMetaData }
     *     
     */
    public ArrayOfClaimMetaData getGetAllClaimsResult() {
        return getAllClaimsResult;
    }

    /**
     * Sets the value of the getAllClaimsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClaimMetaData }
     *     
     */
    public void setGetAllClaimsResult(ArrayOfClaimMetaData value) {
        this.getAllClaimsResult = value;
    }

}
