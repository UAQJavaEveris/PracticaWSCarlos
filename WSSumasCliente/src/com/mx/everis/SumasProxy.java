package com.mx.everis;

public class SumasProxy implements com.mx.everis.Sumas {
  private String _endpoint = null;
  private com.mx.everis.Sumas sumas = null;
  
  public SumasProxy() {
    _initSumasProxy();
  }
  
  public SumasProxy(String endpoint) {
    _endpoint = endpoint;
    _initSumasProxy();
  }
  
  private void _initSumasProxy() {
    try {
      sumas = (new com.mx.everis.SumasServiceLocator()).getSumas();
      if (sumas != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sumas)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sumas)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sumas != null)
      ((javax.xml.rpc.Stub)sumas)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.mx.everis.Sumas getSumas() {
    if (sumas == null)
      _initSumasProxy();
    return sumas;
  }
  
  public int getSumaTresNumero(int a, int b, int c) throws java.rmi.RemoteException{
    if (sumas == null)
      _initSumasProxy();
    return sumas.getSumaTresNumero(a, b, c);
  }
  
  public int getSumaArrayNum(int[] numEnteros) throws java.rmi.RemoteException{
    if (sumas == null)
      _initSumasProxy();
    return sumas.getSumaArrayNum(numEnteros);
  }
  
  public int getSuma(int a, int b) throws java.rmi.RemoteException{
    if (sumas == null)
      _initSumasProxy();
    return sumas.getSuma(a, b);
  }
  
  
}