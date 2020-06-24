
package ec.edu.ups.servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.edu.ups.servicios package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RetiroResponse_QNAME = new QName("http://servicios.ProyectoFinal.appdis/", "RetiroResponse");
    private final static QName _ObtenerDatosCuenta_QNAME = new QName("http://servicios.ProyectoFinal.appdis/", "obtenerDatosCuenta");
    private final static QName _TranferirDineroCuenta_QNAME = new QName("http://servicios.ProyectoFinal.appdis/", "tranferirDineroCuenta");
    private final static QName _Deposito_QNAME = new QName("http://servicios.ProyectoFinal.appdis/", "Deposito");
    private final static QName _Retiro_QNAME = new QName("http://servicios.ProyectoFinal.appdis/", "Retiro");
    private final static QName _TranferirDineroCuentaResponse_QNAME = new QName("http://servicios.ProyectoFinal.appdis/", "tranferirDineroCuentaResponse");
    private final static QName _DepositoResponse_QNAME = new QName("http://servicios.ProyectoFinal.appdis/", "DepositoResponse");
    private final static QName _ObtenerDatosCuentaResponse_QNAME = new QName("http://servicios.ProyectoFinal.appdis/", "obtenerDatosCuentaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.edu.ups.servicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerDatosCuentaResponse }
     * 
     */
    public ObtenerDatosCuentaResponse createObtenerDatosCuentaResponse() {
        return new ObtenerDatosCuentaResponse();
    }

    /**
     * Create an instance of {@link DepositoResponse }
     * 
     */
    public DepositoResponse createDepositoResponse() {
        return new DepositoResponse();
    }

    /**
     * Create an instance of {@link TranferirDineroCuentaResponse }
     * 
     */
    public TranferirDineroCuentaResponse createTranferirDineroCuentaResponse() {
        return new TranferirDineroCuentaResponse();
    }

    /**
     * Create an instance of {@link Deposito }
     * 
     */
    public Deposito createDeposito() {
        return new Deposito();
    }

    /**
     * Create an instance of {@link Retiro }
     * 
     */
    public Retiro createRetiro() {
        return new Retiro();
    }

    /**
     * Create an instance of {@link TranferirDineroCuenta }
     * 
     */
    public TranferirDineroCuenta createTranferirDineroCuenta() {
        return new TranferirDineroCuenta();
    }

    /**
     * Create an instance of {@link ObtenerDatosCuenta }
     * 
     */
    public ObtenerDatosCuenta createObtenerDatosCuenta() {
        return new ObtenerDatosCuenta();
    }

    /**
     * Create an instance of {@link RetiroResponse }
     * 
     */
    public RetiroResponse createRetiroResponse() {
        return new RetiroResponse();
    }

    /**
     * Create an instance of {@link Transferencia }
     * 
     */
    public Transferencia createTransferencia() {
        return new Transferencia();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link Cuenta }
     * 
     */
    public Cuenta createCuenta() {
        return new Cuenta();
    }

    /**
     * Create an instance of {@link Telefonos }
     * 
     */
    public Telefonos createTelefonos() {
        return new Telefonos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetiroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.ProyectoFinal.appdis/", name = "RetiroResponse")
    public JAXBElement<RetiroResponse> createRetiroResponse(RetiroResponse value) {
        return new JAXBElement<RetiroResponse>(_RetiroResponse_QNAME, RetiroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDatosCuenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.ProyectoFinal.appdis/", name = "obtenerDatosCuenta")
    public JAXBElement<ObtenerDatosCuenta> createObtenerDatosCuenta(ObtenerDatosCuenta value) {
        return new JAXBElement<ObtenerDatosCuenta>(_ObtenerDatosCuenta_QNAME, ObtenerDatosCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranferirDineroCuenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.ProyectoFinal.appdis/", name = "tranferirDineroCuenta")
    public JAXBElement<TranferirDineroCuenta> createTranferirDineroCuenta(TranferirDineroCuenta value) {
        return new JAXBElement<TranferirDineroCuenta>(_TranferirDineroCuenta_QNAME, TranferirDineroCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deposito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.ProyectoFinal.appdis/", name = "Deposito")
    public JAXBElement<Deposito> createDeposito(Deposito value) {
        return new JAXBElement<Deposito>(_Deposito_QNAME, Deposito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Retiro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.ProyectoFinal.appdis/", name = "Retiro")
    public JAXBElement<Retiro> createRetiro(Retiro value) {
        return new JAXBElement<Retiro>(_Retiro_QNAME, Retiro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranferirDineroCuentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.ProyectoFinal.appdis/", name = "tranferirDineroCuentaResponse")
    public JAXBElement<TranferirDineroCuentaResponse> createTranferirDineroCuentaResponse(TranferirDineroCuentaResponse value) {
        return new JAXBElement<TranferirDineroCuentaResponse>(_TranferirDineroCuentaResponse_QNAME, TranferirDineroCuentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.ProyectoFinal.appdis/", name = "DepositoResponse")
    public JAXBElement<DepositoResponse> createDepositoResponse(DepositoResponse value) {
        return new JAXBElement<DepositoResponse>(_DepositoResponse_QNAME, DepositoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDatosCuentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.ProyectoFinal.appdis/", name = "obtenerDatosCuentaResponse")
    public JAXBElement<ObtenerDatosCuentaResponse> createObtenerDatosCuentaResponse(ObtenerDatosCuentaResponse value) {
        return new JAXBElement<ObtenerDatosCuentaResponse>(_ObtenerDatosCuentaResponse_QNAME, ObtenerDatosCuentaResponse.class, null, value);
    }

}
