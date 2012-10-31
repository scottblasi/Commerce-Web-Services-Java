
package com.ipcommerce.schemas.cws.v2_0.transactions.bankcard;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.ipcommerce.schemas.cws.v2_0.transactions.Return;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.pro.BankcardReturnPro;


/**
 * <summary>
 *             Contains information for returning Bankcard transactions (Credit and PIN Debit). Required.
 *             </summary>
 * 
 * <p>Java class for BankcardReturn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankcardReturn">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions}Return">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TenderData" type="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard}BankcardTenderData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankcardReturn", propOrder = {
    "amount",
    "tenderData"
})
@XmlSeeAlso({
    BankcardReturnPro.class
})
public class BankcardReturn
    extends Return
{

    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "TenderData", nillable = true)
    protected BankcardTenderData tenderData;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the tenderData property.
     * 
     * @return
     *     possible object is
     *     {@link BankcardTenderData }
     *     
     */
    public BankcardTenderData getTenderData() {
        return tenderData;
    }

    /**
     * Sets the value of the tenderData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankcardTenderData }
     *     
     */
    public void setTenderData(BankcardTenderData value) {
        this.tenderData = value;
    }

}
