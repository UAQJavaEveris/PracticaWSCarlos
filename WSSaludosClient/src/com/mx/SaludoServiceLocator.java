/**
 * SaludoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mx;

public class SaludoServiceLocator extends org.apache.axis.client.Service implements com.mx.SaludoService {

    public SaludoServiceLocator() {
    }


    public SaludoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SaludoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Saludo
    private java.lang.String Saludo_address = "http://localhost:8080/WSSaludos/services/Saludo";

    public java.lang.String getSaludoAddress() {
        return Saludo_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SaludoWSDDServiceName = "Saludo";

    public java.lang.String getSaludoWSDDServiceName() {
        return SaludoWSDDServiceName;
    }

    public void setSaludoWSDDServiceName(java.lang.String name) {
        SaludoWSDDServiceName = name;
    }

    public com.mx.Saludo getSaludo() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Saludo_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSaludo(endpoint);
    }

    public com.mx.Saludo getSaludo(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.mx.SaludoSoapBindingStub _stub = new com.mx.SaludoSoapBindingStub(portAddress, this);
            _stub.setPortName(getSaludoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSaludoEndpointAddress(java.lang.String address) {
        Saludo_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.mx.Saludo.class.isAssignableFrom(serviceEndpointInterface)) {
                com.mx.SaludoSoapBindingStub _stub = new com.mx.SaludoSoapBindingStub(new java.net.URL(Saludo_address), this);
                _stub.setPortName(getSaludoWSDDServiceName());
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
        if ("Saludo".equals(inputPortName)) {
            return getSaludo();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://mx.com", "SaludoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://mx.com", "Saludo"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Saludo".equals(portName)) {
            setSaludoEndpointAddress(address);
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
