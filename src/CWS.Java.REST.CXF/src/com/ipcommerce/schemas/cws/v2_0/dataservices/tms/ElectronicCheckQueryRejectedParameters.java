
package com.ipcommerce.schemas.cws.v2_0.dataservices.tms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ipcommerce.schemas.cws.v2_0.dataservices.DateRange;


/**
 * <summary>
 *             Electronic Checking specific query parameters for QueryRejectedDetail and QueryRejectedSummary. Required.
 *             </summary>
 * 
 * <p>Java class for ElectronicCheckQueryRejectedParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectronicCheckQueryRejectedParameters">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS}QueryRejectedParameters">
 *       &lt;sequence>
 *         &lt;element name="QueryDateRange" type="{http://schemas.ipcommerce.com/CWS/v2.0/DataServices}DateRange" minOccurs="0"/>
 *         &lt;element name="QueryDateType" type="{http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS}TypeDateType" minOccurs="0"/>
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectronicCheckQueryRejectedParameters", propOrder = {
    "queryDateRange",
    "queryDateType",
    "serviceId"
})
public class ElectronicCheckQueryRejectedParameters
    extends QueryRejectedParameters
{

    @XmlElement(name = "QueryDateRange", nillable = true)
    protected DateRange queryDateRange;
    @XmlElement(name = "QueryDateType")
    protected TypeDateType queryDateType;
    @XmlElement(name = "ServiceId", nillable = true)
    protected String serviceId;

    /**
     * Gets the value of the queryDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getQueryDateRange() {
        return queryDateRange;
    }

    /**
     * Sets the value of the queryDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setQueryDateRange(DateRange value) {
        this.queryDateRange = value;
    }

    /**
     * Gets the value of the queryDateType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDateType }
     *     
     */
    public TypeDateType getQueryDateType() {
        return queryDateType;
    }

    /**
     * Sets the value of the queryDateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDateType }
     *     
     */
    public void setQueryDateType(TypeDateType value) {
        this.queryDateType = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

}
