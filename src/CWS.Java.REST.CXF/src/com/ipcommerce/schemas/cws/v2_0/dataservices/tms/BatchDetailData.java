
package com.ipcommerce.schemas.cws.v2_0.dataservices.tms;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.ipcommerce.schemas.cws.v2_0.transactions.CaptureState;
import com.ipcommerce.schemas.cws.v2_0.transactions.SummaryData;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.TransactionSummaryData;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <summary>
 *             Detailed data regarding the batch. Expected.
 *             </summary>
 * 
 * <p>Java class for BatchDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BatchCaptureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BatchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BatchSummaryData" type="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard}TransactionSummaryData" minOccurs="0"/>
 *         &lt;element name="CaptureState" type="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions}CaptureState" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SummaryData" type="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions}SummaryData" minOccurs="0"/>
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
@XmlType(name = "BatchDetailData", propOrder = {
    "batchCaptureDate",
    "batchId",
    "batchSummaryData",
    "captureState",
    "description",
    "summaryData",
    "transactionIds"
})
public class BatchDetailData {

    @XmlElement(name = "BatchCaptureDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar batchCaptureDate;
    @XmlElement(name = "BatchId", nillable = true)
    protected String batchId;
    @XmlElement(name = "BatchSummaryData", nillable = true)
    protected TransactionSummaryData batchSummaryData;
    @XmlElement(name = "CaptureState")
    protected CaptureState captureState;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "SummaryData", nillable = true)
    protected SummaryData summaryData;
    @XmlElement(name = "TransactionIds", nillable = true)
    protected ArrayOfstring transactionIds;

    /**
     * Gets the value of the batchCaptureDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getBatchCaptureDate() {
        return batchCaptureDate;
    }

    /**
     * Sets the value of the batchCaptureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchCaptureDate(Calendar value) {
        this.batchCaptureDate = value;
    }

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
     * Gets the value of the batchSummaryData property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSummaryData }
     *     
     */
    public TransactionSummaryData getBatchSummaryData() {
        return batchSummaryData;
    }

    /**
     * Sets the value of the batchSummaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSummaryData }
     *     
     */
    public void setBatchSummaryData(TransactionSummaryData value) {
        this.batchSummaryData = value;
    }

    /**
     * Gets the value of the captureState property.
     * 
     * @return
     *     possible object is
     *     {@link CaptureState }
     *     
     */
    public CaptureState getCaptureState() {
        return captureState;
    }

    /**
     * Sets the value of the captureState property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaptureState }
     *     
     */
    public void setCaptureState(CaptureState value) {
        this.captureState = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the summaryData property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryData }
     *     
     */
    public SummaryData getSummaryData() {
        return summaryData;
    }

    /**
     * Sets the value of the summaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryData }
     *     
     */
    public void setSummaryData(SummaryData value) {
        this.summaryData = value;
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
