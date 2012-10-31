
package com.ipcommerce.schemas.cws.v2_0.dataservices.billing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBillingEventDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBillingEventDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillingEventDetail" type="{http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing}BillingEventDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBillingEventDetail", propOrder = {
    "billingEventDetail"
})
public class ArrayOfBillingEventDetail {

    @XmlElement(name = "BillingEventDetail", nillable = true)
    protected List<BillingEventDetail> billingEventDetail;

    /**
     * Gets the value of the billingEventDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingEventDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingEventDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingEventDetail }
     * 
     * 
     */
    public List<BillingEventDetail> getBillingEventDetail() {
        if (billingEventDetail == null) {
            billingEventDetail = new ArrayList<BillingEventDetail>();
        }
        return this.billingEventDetail;
    }

}
