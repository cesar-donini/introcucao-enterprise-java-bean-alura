/**
 * LivroWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.caelum.livraria.ws;

public class LivroWSServiceLocator extends org.apache.axis.client.Service implements br.com.caelum.livraria.ws.LivroWSService {

    public LivroWSServiceLocator() {
    }


    public LivroWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LivroWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LivroWSPort
    private java.lang.String LivroWSPort_address = "http://localhost:8080/livraria/LivroWS";

    public java.lang.String getLivroWSPortAddress() {
        return LivroWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LivroWSPortWSDDServiceName = "LivroWSPort";

    public java.lang.String getLivroWSPortWSDDServiceName() {
        return LivroWSPortWSDDServiceName;
    }

    public void setLivroWSPortWSDDServiceName(java.lang.String name) {
        LivroWSPortWSDDServiceName = name;
    }

    public br.com.caelum.livraria.ws.LivroWS getLivroWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LivroWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLivroWSPort(endpoint);
    }

    public br.com.caelum.livraria.ws.LivroWS getLivroWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.caelum.livraria.ws.LivroWSServiceSoapBindingStub _stub = new br.com.caelum.livraria.ws.LivroWSServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getLivroWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLivroWSPortEndpointAddress(java.lang.String address) {
        LivroWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.caelum.livraria.ws.LivroWS.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.caelum.livraria.ws.LivroWSServiceSoapBindingStub _stub = new br.com.caelum.livraria.ws.LivroWSServiceSoapBindingStub(new java.net.URL(LivroWSPort_address), this);
                _stub.setPortName(getLivroWSPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("LivroWSPort".equals(inputPortName)) {
            return getLivroWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.livraria.caelum.com.br/", "LivroWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.livraria.caelum.com.br/", "LivroWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LivroWSPort".equals(portName)) {
            setLivroWSPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
