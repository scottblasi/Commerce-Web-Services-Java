
package com.ipcommerce.schemas.cws.v2_0.transactions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.BankcardTransaction;
import com.ipcommerce.schemas.cws.v2_0.transactions.electronicchecking.ElectronicCheckingTransaction;
import com.ipcommerce.schemas.cws.v2_0.transactions.storedvalue.StoredValueTransaction;


/**
 * <summary>
 *             Contains all information which may be required to send a transaction to a Service Provider. Required.
 *             </summary>
 * 
 * <p>Java class for Transaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerData" type="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions}TransactionCustomerData" minOccurs="0"/>
 *         &lt;element name="ReportingData" type="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions}TransactionReportingData" minOccurs="0"/>
 *         &lt;element name="Addendum" type="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions}Addendum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction", propOrder = {
    "customerData",
    "reportingData",
    "addendum"
})
@XmlSeeAlso({
    BankcardTransaction.class,
    ElectronicCheckingTransaction.class,
    StoredValueTransaction.class
})
public class Transaction {

    @XmlElement(name = "CustomerData", nillable = true)
    protected TransactionCustomerData customerData;
    @XmlElement(name = "ReportingData", nillable = true)
    protected TransactionReportingData reportingData;
    @XmlElement(name = "Addendum", nillable = true)
    protected Addendum addendum;

    /**
     * Gets the value of the customerData property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCustomerData }
     *     
     */
    public TransactionCustomerData getCustomerData() {
        return customerData;
    }

    /**
     * Sets the value of the customerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCustomerData }
     *     
     */
    public void setCustomerData(TransactionCustomerData value) {
        this.customerData = value;
    }

    /**
     * Gets the value of the reportingData property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionReportingData }
     *     
     */
    public TransactionReportingData getReportingData() {
        return reportingData;
    }

    /**
     * Sets the value of the reportingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionReportingData }
     *     
     */
    public void setReportingData(TransactionReportingData value) {
        this.reportingData = value;
    }

    /**
     * Gets the value of the addendum property.
     * 
     * @return
     *     possible object is
     *     {@link Addendum }
     *     
     */
    public Addendum getAddendum() {
        return addendum;
    }

    /**
     * Sets the value of the addendum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Addendum }
     *     
     */
    public void setAddendum(Addendum value) {
        this.addendum = value;
    }

}
