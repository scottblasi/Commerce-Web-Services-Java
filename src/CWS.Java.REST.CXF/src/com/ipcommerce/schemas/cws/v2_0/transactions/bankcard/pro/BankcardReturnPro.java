
package com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.pro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.ArrayOfLineItemDetail;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.BankcardReturn;


/**
 * <summary>
 *             Contains information for returning Bankcard transactions (Credit and PIN Debit). Required.
 *             </summary>
 * 
 * <p>Java class for BankcardReturnPro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankcardReturnPro">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard}BankcardReturn">
 *       &lt;sequence>
 *         &lt;element name="LineItemDetails" type="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard}ArrayOfLineItemDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankcardReturnPro", propOrder = {
    "lineItemDetails"
})
public class BankcardReturnPro
    extends BankcardReturn
{

    @XmlElement(name = "LineItemDetails", nillable = true)
    protected ArrayOfLineItemDetail lineItemDetails;

    /**
     * Gets the value of the lineItemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLineItemDetail }
     *     
     */
    public ArrayOfLineItemDetail getLineItemDetails() {
        return lineItemDetails;
    }

    /**
     * Sets the value of the lineItemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLineItemDetail }
     *     
     */
    public void setLineItemDetails(ArrayOfLineItemDetail value) {
        this.lineItemDetails = value;
    }

}
