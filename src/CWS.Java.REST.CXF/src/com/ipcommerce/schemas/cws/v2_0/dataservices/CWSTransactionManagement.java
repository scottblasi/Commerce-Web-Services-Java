package com.ipcommerce.schemas.cws.v2_0.dataservices;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import com.ipcommerce.schemas.cws.v2_0.dataservices.tms.ITMSOperations;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:04:43.061-06:00
 * Generated source version: 2.7.0
 * 
 */
@WebServiceClient(name = "CWSTransactionManagement", 
                  wsdlLocation = "file:/C:/JavaTools/CwsSoapWsdl_2.0.18/CWSTransactionManagement.wsdl",
                  targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/DataServices") 
public class CWSTransactionManagement extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices", "CWSTransactionManagement");
    public final static QName BasicHttpBindingITMSOperations = new QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices", "BasicHttpBinding_ITMSOperations");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/JavaTools/CwsSoapWsdl_2.0.18/CWSTransactionManagement.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CWSTransactionManagement.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/JavaTools/CwsSoapWsdl_2.0.18/CWSTransactionManagement.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CWSTransactionManagement(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CWSTransactionManagement(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CWSTransactionManagement() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CWSTransactionManagement(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CWSTransactionManagement(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CWSTransactionManagement(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ITMSOperations
     */
    @WebEndpoint(name = "BasicHttpBinding_ITMSOperations")
    public ITMSOperations getBasicHttpBindingITMSOperations() {
        return super.getPort(BasicHttpBindingITMSOperations, ITMSOperations.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ITMSOperations
     */
    @WebEndpoint(name = "BasicHttpBinding_ITMSOperations")
    public ITMSOperations getBasicHttpBindingITMSOperations(WebServiceFeature... features) {
        return super.getPort(BasicHttpBindingITMSOperations, ITMSOperations.class, features);
    }

}
