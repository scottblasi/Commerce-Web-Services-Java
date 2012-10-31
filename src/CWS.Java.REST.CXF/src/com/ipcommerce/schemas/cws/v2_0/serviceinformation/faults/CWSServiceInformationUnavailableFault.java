
package com.ipcommerce.schemas.cws.v2_0.serviceinformation.faults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <summary>
 *             Indicates that the Service Information Service is temporary unavailable. The client application should retry the operation.
 *             </summary>
 * 
 * <p>Java class for CWSServiceInformationUnavailableFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CWSServiceInformationUnavailableFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults}CWSBaseFault">
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
@XmlType(name = "CWSServiceInformationUnavailableFault")
public class CWSServiceInformationUnavailableFault
    extends CWSBaseFault
{


}
