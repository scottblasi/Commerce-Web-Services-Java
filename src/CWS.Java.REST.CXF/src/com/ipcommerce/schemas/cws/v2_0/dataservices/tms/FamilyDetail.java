
package com.ipcommerce.schemas.cws.v2_0.dataservices.tms;

import java.math.BigDecimal;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.ipcommerce.schemas.cws.v2_0.transactions.TransactionState;
import com.microsoft.schemas._2003._10.serialization.Guid;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <summary>
 *             Contains detail information for the family of transactions.
 *             </summary>
 * 
 * <p>Java class for FamilyDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FamilyDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BatchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CaptureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CapturedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FamilyId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="FamilyState" type="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions}TransactionState" minOccurs="0"/>
 *         &lt;element name="LastAuthorizedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MerchantProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NetAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ServiceKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="TransactionMetaData" type="{http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS}ArrayOfTransactionMetaData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FamilyDetail", propOrder = {
    "batchId",
    "captureDateTime",
    "capturedAmount",
    "customerId",
    "familyId",
    "familyState",
    "lastAuthorizedAmount",
    "merchantProfileId",
    "netAmount",
    "serviceKey",
    "transactionIds",
    "transactionMetaData"
})
public class FamilyDetail {

    @XmlElement(name = "BatchId", nillable = true)
    protected String batchId;
    @XmlElement(name = "CaptureDateTime", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar captureDateTime;
    @XmlElement(name = "CapturedAmount")
    protected BigDecimal capturedAmount;
    @XmlElement(name = "CustomerId", nillable = true)
    protected String customerId;
    @XmlElement(name = "FamilyId")
    protected Guid familyId;
    @XmlElement(name = "FamilyState")
    protected TransactionState familyState;
    @XmlElement(name = "LastAuthorizedAmount")
    protected BigDecimal lastAuthorizedAmount;
    @XmlElement(name = "MerchantProfileId", nillable = true)
    protected String merchantProfileId;
    @XmlElement(name = "NetAmount")
    protected BigDecimal netAmount;
    @XmlElement(name = "ServiceKey", nillable = true)
    protected String serviceKey;
    @XmlElement(name = "TransactionIds", nillable = true)
    protected ArrayOfstring transactionIds;
    @XmlElement(name = "TransactionMetaData", nillable = true)
    protected ArrayOfTransactionMetaData transactionMetaData;

    /**
     * Gets the value of the batchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * Sets the value of the batchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchId(String value) {
        this.batchId = value;
    }

    /**
     * Gets the value of the captureDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCaptureDateTime() {
        return captureDateTime;
    }

    /**
     * Sets the value of the captureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptureDateTime(Calendar value) {
        this.captureDateTime = value;
    }

    /**
     * Gets the value of the capturedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapturedAmount() {
        return capturedAmount;
    }

    /**
     * Sets the value of the capturedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapturedAmount(BigDecimal value) {
        this.capturedAmount = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the familyId property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getFamilyId() {
        return familyId;
    }

    /**
     * Sets the value of the familyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setFamilyId(Guid value) {
        this.familyId = value;
    }

    /**
     * Gets the value of the familyState property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionState }
     *     
     */
    public TransactionState getFamilyState() {
        return familyState;
    }

    /**
     * Sets the value of the familyState property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionState }
     *     
     */
    public void setFamilyState(TransactionState value) {
        this.familyState = value;
    }

    /**
     * Gets the value of the lastAuthorizedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastAuthorizedAmount() {
        return lastAuthorizedAmount;
    }

    /**
     * Sets the value of the lastAuthorizedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastAuthorizedAmount(BigDecimal value) {
        this.lastAuthorizedAmount = value;
    }

    /**
     * Gets the value of the merchantProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantProfileId() {
        return merchantProfileId;
    }

    /**
     * Sets the value of the merchantProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantProfileId(String value) {
        this.merchantProfileId = value;
    }

    /**
     * Gets the value of the netAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetAmount() {
        return netAmount;
    }

    /**
     * Sets the value of the netAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetAmount(BigDecimal value) {
        this.netAmount = value;
    }

    /**
     * Gets the value of the serviceKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceKey() {
        return serviceKey;
    }

    /**
     * Sets the value of the serviceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceKey(String value) {
        this.serviceKey = value;
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

    /**
     * Gets the value of the transactionMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransactionMetaData }
     *     
     */
    public ArrayOfTransactionMetaData getTransactionMetaData() {
        return transactionMetaData;
    }

    /**
     * Sets the value of the transactionMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransactionMetaData }
     *     
     */
    public void setTransactionMetaData(ArrayOfTransactionMetaData value) {
        this.transactionMetaData = value;
    }

}
