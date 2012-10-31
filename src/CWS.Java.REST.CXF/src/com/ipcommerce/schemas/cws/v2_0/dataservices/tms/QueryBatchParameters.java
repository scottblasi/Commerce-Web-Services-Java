
package com.ipcommerce.schemas.cws.v2_0.dataservices.tms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ipcommerce.schemas.cws.v2_0.dataservices.DateRange;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <summary>
 *             The filter criteria used to perform transaction batch queries. Required.
 *             </summary>
 * 
 * <p>Java class for QueryBatchParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryBatchParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BatchDateRange" type="{http://schemas.ipcommerce.com/CWS/v2.0/DataServices}DateRange" minOccurs="0"/>
 *         &lt;element name="BatchIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="MerchantProfileIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="ServiceKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="TransactionIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryBatchParameters", propOrder = {
    "batchDateRange",
    "batchIds",
    "merchantProfileIds",
    "serviceKeys",
    "transactionIds"
})
public class QueryBatchParameters {

    @XmlElement(name = "BatchDateRange", nillable = true)
    protected DateRange batchDateRange;
    @XmlElement(name = "BatchIds", nillable = true)
    protected ArrayOfstring batchIds;
    @XmlElement(name = "MerchantProfileIds", nillable = true)
    protected ArrayOfstring merchantProfileIds;
    @XmlElement(name = "ServiceKeys", nillable = true)
    protected ArrayOfstring serviceKeys;
    @XmlElement(name = "TransactionIds", nillable = true)
    protected ArrayOfstring transactionIds;

    /**
     * Gets the value of the batchDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getBatchDateRange() {
        return batchDateRange;
    }

    /**
     * Sets the value of the batchDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setBatchDateRange(DateRange value) {
        this.batchDateRange = value;
    }

    /**
     * Gets the value of the batchIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getBatchIds() {
        return batchIds;
    }

    /**
     * Sets the value of the batchIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setBatchIds(ArrayOfstring value) {
        this.batchIds = value;
    }

    /**
     * Gets the value of the merchantProfileIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getMerchantProfileIds() {
        return merchantProfileIds;
    }

    /**
     * Sets the value of the merchantProfileIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setMerchantProfileIds(ArrayOfstring value) {
        this.merchantProfileIds = value;
    }

    /**
     * Gets the value of the serviceKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getServiceKeys() {
        return serviceKeys;
    }

    /**
     * Sets the value of the serviceKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setServiceKeys(ArrayOfstring value) {
        this.serviceKeys = value;
    }

    /**
     * Gets the value of the transactionIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getTransactionIds() {
        return transactionIds;
    }

    /**
     * Sets the value of the transactionIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setTransactionIds(ArrayOfstring value) {
        this.transactionIds = value;
    }

}
