
package com.ipcommerce.schemas.cws.v2_0.dataservices.billing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBillingEventSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBillingEventSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillingEventSummary" type="{http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing}BillingEventSummary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBillingEventSummary", propOrder = {
    "billingEventSummary"
})
public class ArrayOfBillingEventSummary {

    @XmlElement(name = "BillingEventSummary", nillable = true)
    protected List<BillingEventSummary> billingEventSummary;

    /**
     * Gets the value of the billingEventSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingEventSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingEventSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingEventSummary }
     * 
     * 
     */
    public List<BillingEventSummary> getBillingEventSummary() {
        if (billingEventSummary == null) {
            billingEventSummary = new ArrayList<BillingEventSummary>();
        }
        return this.billingEventSummary;
    }

}
