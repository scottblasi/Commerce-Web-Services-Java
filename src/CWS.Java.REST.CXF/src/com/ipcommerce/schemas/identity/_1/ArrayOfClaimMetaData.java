
package com.ipcommerce.schemas.identity._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfClaimMetaData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClaimMetaData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClaimMetaData" type="{http://schemas.ipcommerce.com/Identity/1.0/}ClaimMetaData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClaimMetaData", propOrder = {
    "claimMetaData"
})
public class ArrayOfClaimMetaData {

    @XmlElement(name = "ClaimMetaData", nillable = true)
    protected List<ClaimMetaData> claimMetaData;

    /**
     * Gets the value of the claimMetaData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claimMetaData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimMetaData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimMetaData }
     * 
     * 
     */
    public List<ClaimMetaData> getClaimMetaData() {
        if (claimMetaData == null) {
            claimMetaData = new ArrayList<ClaimMetaData>();
        }
        return this.claimMetaData;
    }

}
