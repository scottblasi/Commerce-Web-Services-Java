
package com.ipcommerce.schemas.cws.v2_0.dataservices.billing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <summary>
 *             Indicates that the Transaction Processing Service is temporarily unavailable. The client application should Undo the transaction and try again.
 *             </summary>
 * 
 * <p>Java class for BillingTransactionFailedFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingTransactionFailedFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ipcommerce.com/CWS/v2.0/DataServices/Billing}BillingBaseFault">
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
@XmlType(name = "BillingTransactionFailedFault")
public class BillingTransactionFailedFault
    extends BillingBaseFault
{


}
