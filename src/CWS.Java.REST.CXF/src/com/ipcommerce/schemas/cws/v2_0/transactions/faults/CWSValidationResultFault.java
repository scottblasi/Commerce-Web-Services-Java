
package com.ipcommerce.schemas.cws.v2_0.transactions.faults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <summary>
 *             Contains a collection of one or more PTLS XML error messages in CWSValidationErrorFault. The application should respond to these validation errors and correct the data being sent in.
 *             </summary>
 * 
 * <p>Java class for CWSValidationResultFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CWSValidationResultFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults}CWSBaseFault">
 *       &lt;sequence>
 *         &lt;element name="Errors" type="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults}ArrayOfCWSValidationErrorFault" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CWSValidationResultFault", propOrder = {
    "errors"
})
public class CWSValidationResultFault
    extends CWSBaseFault
{

    @XmlElement(name = "Errors", nillable = true)
    protected ArrayOfCWSValidationErrorFault errors;

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCWSValidationErrorFault }
     *     
     */
    public ArrayOfCWSValidationErrorFault getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCWSValidationErrorFault }
     *     
     */
    public void setErrors(ArrayOfCWSValidationErrorFault value) {
        this.errors = value;
    }

}
