package ec.edu.ups.servicios;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2020-06-23T21:46:56.527-05:00
 * Generated source version: 2.7.11
 * 
 */
@WebServiceClient(name = "CajeroServiceSOAPService", 
                  wsdlLocation = "http://localhost:8080/ProyectoFinal/CajeroServiceSOAP?wsdl",
                  targetNamespace = "http://servicios.ProyectoFinal.appdis/") 
public class CajeroServiceSOAPService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://servicios.ProyectoFinal.appdis/", "CajeroServiceSOAPService");
    public final static QName CajeroServiceSOAPPort = new QName("http://servicios.ProyectoFinal.appdis/", "CajeroServiceSOAPPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/ProyectoFinal/CajeroServiceSOAP?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CajeroServiceSOAPService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/ProyectoFinal/CajeroServiceSOAP?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CajeroServiceSOAPService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CajeroServiceSOAPService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CajeroServiceSOAPService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CajeroServiceSOAPService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CajeroServiceSOAPService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CajeroServiceSOAPService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns CajeroServiceSOAP
     */
    @WebEndpoint(name = "CajeroServiceSOAPPort")
    public CajeroServiceSOAP getCajeroServiceSOAPPort() {
        return super.getPort(CajeroServiceSOAPPort, CajeroServiceSOAP.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CajeroServiceSOAP
     */
    @WebEndpoint(name = "CajeroServiceSOAPPort")
    public CajeroServiceSOAP getCajeroServiceSOAPPort(WebServiceFeature... features) {
        return super.getPort(CajeroServiceSOAPPort, CajeroServiceSOAP.class, features);
    }

}
