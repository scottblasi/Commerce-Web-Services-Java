
package com.ipcommerce.schemas.cws.v2_0.transactions.faults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <summary>
 *             A fault that inidicates that a temporary connection issue caused the fault and that the client should retry the connection.
 *             </summary>
 * 
 * <p>Java class for CWSConnectionFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CWSConnectionFault">
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
@XmlType(name = "CWSConnectionFault")
public class CWSConnectionFault
    extends CWSBaseFault
{


}
