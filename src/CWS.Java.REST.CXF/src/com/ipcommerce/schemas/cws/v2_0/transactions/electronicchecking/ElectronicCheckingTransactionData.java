
package com.ipcommerce.schemas.cws.v2_0.transactions.electronicchecking;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.ipcommerce.schemas.cws.v2_0.transactions.TransactionData;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <summary>
 *             Contains information about the Electronic Checking transaction data. Required.
 *             </summary>
 * 
 * <p>Java class for ElectronicCheckingTransactionData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectronicCheckingTransactionData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions}TransactionData">
 *       &lt;sequence>
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IsRecurring" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SECCode" type="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking}SECCode" minOccurs="0"/>
 *         &lt;element name="ServiceType" type="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking}ServiceType" minOccurs="0"/>
 *         &lt;element name="TransactionType" type="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking}TransactionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectronicCheckingTransactionData", propOrder = {
    "effectiveDate",
    "isRecurring",
    "secCode",
    "serviceType",
    "transactionType"
})
public class ElectronicCheckingTransactionData
    extends TransactionData
{

    @XmlElement(name = "EffectiveDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar effectiveDate;
    @XmlElement(name = "IsRecurring")
    protected Boolean isRecurring;
    @XmlElement(name = "SECCode")
    protected SECCode secCode;
    @XmlElement(name = "ServiceType")
    protected ServiceType serviceType;
    @XmlElement(name = "TransactionType")
    protected TransactionType transactionType;

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDate(Calendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the isRecurring property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRecurring() {
        return isRecurring;
    }

    /**
     * Sets the value of the isRecurring property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRecurring(Boolean value) {
        this.isRecurring = value;
    }

    /**
     * Gets the value of the secCode property.
     * 
     * @return
     *     possible object is
     *     {@link SECCode }
     *     
     */
    public SECCode getSECCode() {
        return secCode;
    }

    /**
     * Sets the value of the secCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SECCode }
     *     
     */
    public void setSECCode(SECCode value) {
        this.secCode = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setServiceType(ServiceType value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType }
     *     
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     *     
     */
    public void setTransactionType(TransactionType value) {
        this.transactionType = value;
    }

}
