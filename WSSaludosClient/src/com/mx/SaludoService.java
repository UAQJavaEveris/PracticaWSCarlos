/**
 * SaludoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mx;

public interface SaludoService extends javax.xml.rpc.Service {
    public java.lang.String getSaludoAddress();

    public com.mx.Saludo getSaludo() throws javax.xml.rpc.ServiceException;

    public com.mx.Saludo getSaludo(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
