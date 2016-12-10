/**
 * Sumas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mx.everis;

public interface Sumas extends java.rmi.Remote {
    public int getSumaTresNumero(int a, int b, int c) throws java.rmi.RemoteException;
    public int getSumaArrayNum(int[] numEnteros) throws java.rmi.RemoteException;
    public int getSuma(int a, int b) throws java.rmi.RemoteException;
}
