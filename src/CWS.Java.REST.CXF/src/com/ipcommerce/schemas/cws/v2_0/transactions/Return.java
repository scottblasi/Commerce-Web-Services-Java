
package com.ipcommerce.schemas.cws.v2_0.transactions;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.ipcommerce.schemas.cws.v2_0.transactions.bankcard.BankcardReturn;
import com.ipcommerce.schemas.cws.v2_0.transactions.storedvalue.StoredValueReturn;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for Return complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Return">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Addendum" type="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions}Addendum" minOccurs="0"/>
 *         &lt;element name="TransactionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Return", propOrder = {
    "transactionId",
    "addendum",
    "transactionDateTime"
})
@XmlSeeAlso({
    BankcardReturn.class,
    StoredValueReturn.class
})
public class Return {

    @XmlElement(name = "TransactionId", nillable = true)
    protected String transactionId;
    @XmlElement(name = "Addendum", nillable = true)
    protected Addendum addendum;
    @XmlElement(name = "TransactionDateTime", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar transactionDateTime;

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
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

    /**
     * Gets the value of the transactionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getTransactionDateTime() {
        return transactionDateTime;
    }

    /**
     * Sets the value of the transactionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDateTime(Calendar value) {
        this.transactionDateTime = value;
    }

}
