
package com.ipcommerce.schemas.cws.v2_0.dataservices.tms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <summary>
 *             Summary Electronic Checking reponse to QueryRejectedSummary. Expected.
 *             </summary>
 * 
 * <p>Java class for ElectronicCheckingRejectedSummaryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectronicCheckingRejectedSummaryResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS}QueryResponse">
 *       &lt;sequence>
 *         &lt;element name="Summary" type="{http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS}RejectedSummary" minOccurs="0"/>
 *         &lt;element name="Transactions" type="{http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS}ArrayOfSummaryDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectronicCheckingRejectedSummaryResponse", propOrder = {
    "summary",
    "transactions"
})
public class ElectronicCheckingRejectedSummaryResponse
    extends QueryResponse
{

    @XmlElement(name = "Summary", nillable = true)
    protected RejectedSummary summary;
    @XmlElement(name = "Transactions", nillable = true)
    protected ArrayOfSummaryDetail transactions;

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedSummary }
     *     
     */
    public RejectedSummary getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedSummary }
     *     
     */
    public void setSummary(RejectedSummary value) {
        this.summary = value;
    }

    /**
     * Gets the value of the transactions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSummaryDetail }
     *     
     */
    public ArrayOfSummaryDetail getTransactions() {
        return transactions;
    }

    /**
     * Sets the value of the transactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSummaryDetail }
     *     
     */
    public void setTransactions(ArrayOfSummaryDetail value) {
        this.transactions = value;
    }

}
