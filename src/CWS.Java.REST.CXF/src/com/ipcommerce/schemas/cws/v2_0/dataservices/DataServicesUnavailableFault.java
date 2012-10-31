
package com.ipcommerce.schemas.cws.v2_0.dataservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <summary>
 *             Indicates that the Transaction Processing Service is temporarily unavailable. The client application should Undo the transaction and try again.
 *             </summary>
 * 
 * <p>Java class for DataServicesUnavailableFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataServicesUnavailableFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ipcommerce.com/CWS/v2.0/DataServices}DSBaseFault">
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
@XmlType(name = "DataServicesUnavailableFault")
public class DataServicesUnavailableFault
    extends DSBaseFault
{


}
