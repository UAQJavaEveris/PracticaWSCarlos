/**
 * SumasService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mx.everis;

public interface SumasService extends javax.xml.rpc.Service {
    public java.lang.String getSumasAddress();

    public com.mx.everis.Sumas getSumas() throws javax.xml.rpc.ServiceException;

    public com.mx.everis.Sumas getSumas(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
