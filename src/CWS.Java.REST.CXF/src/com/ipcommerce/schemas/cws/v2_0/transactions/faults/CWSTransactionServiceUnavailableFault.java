
package com.ipcommerce.schemas.cws.v2_0.transactions.faults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <summary>
 *             Indicates that the Transaction Processing Service is temporary unavailable. The client application should Undo the transaction and try again.
 *             </summary>
 * 
 * <p>Java class for CWSTransactionServiceUnavailableFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CWSTransactionServiceUnavailableFault">
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
@XmlType(name = "CWSTransactionServiceUnavailableFault")
public class CWSTransactionServiceUnavailableFault
    extends CWSBaseFault
{


}
