
package com.ipcommerce.schemas.cws.v2_0.transactions.faults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <summary>
 *             Indicates an invalid operation is being attempted, such as an unsupported transaction type or an attempt to process a return for more than original amount.
 *             </summary>
 * 
 * <p>Java class for CWSInvalidOperationFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CWSInvalidOperationFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults}CWSBaseFault">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CWSInvalidOperationFault")
public class CWSInvalidOperationFault
    extends CWSBaseFault
{


}
