
package iconnect;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "iConnectChatApp", targetNamespace = "http://iConnect.com/", wsdlLocation = "http://localhost:8080/iConnectClient/iConnectChatApp?wsdl")
public class IConnectChatApp_Service
    extends Service
{

    private final static URL ICONNECTCHATAPP_WSDL_LOCATION;
    private final static WebServiceException ICONNECTCHATAPP_EXCEPTION;
    private final static QName ICONNECTCHATAPP_QNAME = new QName("http://iConnect.com/", "iConnectChatApp");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/iConnectClient/iConnectChatApp?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ICONNECTCHATAPP_WSDL_LOCATION = url;
        ICONNECTCHATAPP_EXCEPTION = e;
    }

    public IConnectChatApp_Service() {
        super(__getWsdlLocation(), ICONNECTCHATAPP_QNAME);
    }

    public IConnectChatApp_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ICONNECTCHATAPP_QNAME, features);
    }

    public IConnectChatApp_Service(URL wsdlLocation) {
        super(wsdlLocation, ICONNECTCHATAPP_QNAME);
    }

    public IConnectChatApp_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ICONNECTCHATAPP_QNAME, features);
    }

    public IConnectChatApp_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IConnectChatApp_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IConnectChatApp
     */
    @WebEndpoint(name = "iConnectChatAppPort")
    public IConnectChatApp getIConnectChatAppPort() {
        return super.getPort(new QName("http://iConnect.com/", "iConnectChatAppPort"), IConnectChatApp.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IConnectChatApp
     */
    @WebEndpoint(name = "iConnectChatAppPort")
    public IConnectChatApp getIConnectChatAppPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://iConnect.com/", "iConnectChatAppPort"), IConnectChatApp.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ICONNECTCHATAPP_EXCEPTION!= null) {
            throw ICONNECTCHATAPP_EXCEPTION;
        }
        return ICONNECTCHATAPP_WSDL_LOCATION;
    }

}
