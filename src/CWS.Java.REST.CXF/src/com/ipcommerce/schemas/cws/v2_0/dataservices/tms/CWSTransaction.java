
package com.ipcommerce.schemas.cws.v2_0.dataservices.tms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.ApplicationData;
import com.ipcommerce.schemas.cws.v2_0.serviceinformation.MerchantProfileMerchantData;
import com.ipcommerce.schemas.cws.v2_0.transactions.Response;
import com.ipcommerce.schemas.cws.v2_0.transactions.Transaction;


/**
 * <summary>
 *             The complete transaction using the CWS object model. Conditional, included if transactionDetailFormat is CWSTransaction.
 *             </summary>
 * 
 * <p>Java class for CWSTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CWSTransaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationData" type="{http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation}ApplicationData" minOccurs="0"/>
 *         &lt;element name="MerchantProfileMerchantData" type="{http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation}MerchantProfileMerchantData" minOccurs="0"/>
 *         &lt;element name="MetaData" type="{http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS}TransactionMetaData" minOccurs="0"/>
 *         &lt;element name="Response" type="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions}Response" minOccurs="0"/>
 *         &lt;element name="Transaction" type="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions}Transaction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CWSTransaction", propOrder = {
    "applicationData",
    "merchantProfileMerchantData",
    "metaData",
    "response",
    "transaction"
})
public class CWSTransaction {

    @XmlElement(name = "ApplicationData", nillable = true)
    protected ApplicationData applicationData;
    @XmlElement(name = "MerchantProfileMerchantData", nillable = true)
    protected MerchantProfileMerchantData merchantProfileMerchantData;
    @XmlElement(name = "MetaData", nillable = true)
    protected TransactionMetaData metaData;
    @XmlElement(name = "Response", nillable = true)
    protected Response response;
    @XmlElement(name = "Transaction", nillable = true)
    protected Transaction transaction;

    /**
     * Gets the value of the applicationData property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationData }
     *     
     */
    public ApplicationData getApplicationData() {
        return applicationData;
    }

    /**
     * Sets the value of the applicationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationData }
     *     
     */
    public void setApplicationData(ApplicationData value) {
        this.applicationData = value;
    }

    /**
     * Gets the value of the merchantProfileMerchantData property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantProfileMerchantData }
     *     
     */
    public MerchantProfileMerchantData getMerchantProfileMerchantData() {
        return merchantProfileMerchantData;
    }

    /**
     * Sets the value of the merchantProfileMerchantData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantProfileMerchantData }
     *     
     */
    public void setMerchantProfileMerchantData(MerchantProfileMerchantData value) {
        this.merchantProfileMerchantData = value;
    }

    /**
     * Gets the value of the metaData property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionMetaData }
     *     
     */
    public TransactionMetaData getMetaData() {
        return metaData;
    }

    /**
     * Sets the value of the metaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionMetaData }
     *     
     */
    public void setMetaData(TransactionMetaData value) {
        this.metaData = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setResponse(Response value) {
        this.response = value;
    }

    /**
     * Gets the value of the transaction property.
     * 
     * @return
     *     possible object is
     *     {@link Transaction }
     *     
     */
    public Transaction getTransaction() {
        return transaction;
    }

    /**
     * Sets the value of the transaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transaction }
     *     
     */
    public void setTransaction(Transaction value) {
        this.transaction = value;
    }

}
