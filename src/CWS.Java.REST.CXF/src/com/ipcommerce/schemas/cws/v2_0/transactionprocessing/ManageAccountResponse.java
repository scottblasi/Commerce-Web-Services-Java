
package com.ipcommerce.schemas.cws.v2_0.transactionprocessing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.ipcommerce.schemas.cws.v2_0.transactions.Response;


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
 *         &lt;element name="ManageAccountResult" type="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions}Response" minOccurs="0"/>
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
    "manageAccountResult"
})
@XmlRootElement(name = "ManageAccountResponse")
public class ManageAccountResponse {

    @XmlElement(name = "ManageAccountResult", nillable = true)
    protected Response manageAccountResult;

    /**
     * Gets the value of the manageAccountResult property.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getManageAccountResult() {
        return manageAccountResult;
    }

    /**
     * Sets the value of the manageAccountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setManageAccountResult(Response value) {
        this.manageAccountResult = value;
    }

}