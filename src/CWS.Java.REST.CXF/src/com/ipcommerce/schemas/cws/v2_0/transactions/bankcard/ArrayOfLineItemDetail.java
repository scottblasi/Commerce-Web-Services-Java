
package com.ipcommerce.schemas.cws.v2_0.transactions.bankcard;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLineItemDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLineItemDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineItemDetail" type="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard}LineItemDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLineItemDetail", propOrder = {
    "lineItemDetail"
})
public class ArrayOfLineItemDetail {

    @XmlElement(name = "LineItemDetail", nillable = true)
    protected List<LineItemDetail> lineItemDetail;

    /**
     * Gets the value of the lineItemDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItemDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItemDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemDetail }
     * 
     * 
     */
    public List<LineItemDetail> getLineItemDetail() {
        if (lineItemDetail == null) {
            lineItemDetail = new ArrayList<LineItemDetail>();
        }
        return this.lineItemDetail;
    }

}
