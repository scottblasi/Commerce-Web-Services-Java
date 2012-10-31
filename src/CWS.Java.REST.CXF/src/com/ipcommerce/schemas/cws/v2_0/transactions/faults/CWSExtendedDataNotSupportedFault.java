
package com.ipcommerce.schemas.cws.v2_0.transactions.faults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <summary>
 *             Indicates that extended credit card data, such as Level 2, Level 3, and/or Managed Billing data, is not supported by the Service Provider.
 *             </summary>
 * 
 * <p>Java class for CWSExtendedDataNotSupportedFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CWSExtendedDataNotSupportedFault">
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
@XmlType(name = "CWSExtendedDataNotSupportedFault")
public class CWSExtendedDataNotSupportedFault
    extends CWSBaseFault
{


}
