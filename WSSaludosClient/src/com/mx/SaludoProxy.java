package com.mx;

public class SaludoProxy implements com.mx.Saludo {
  private String _endpoint = null;
  private com.mx.Saludo saludo = null;
  
  public SaludoProxy() {
    _initSaludoProxy();
  }
  
  public SaludoProxy(String endpoint) {
    _endpoint = endpoint;
    _initSaludoProxy();
  }
  
  private void _initSaludoProxy() {
    try {
      saludo = (new com.mx.SaludoServiceLocator()).getSaludo();
      if (saludo != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)saludo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)saludo)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (saludo != null)
      ((javax.xml.rpc.Stub)saludo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.mx.Saludo getSaludo() {
    if (saludo == null)
      _initSaludoProxy();
    return saludo;
  }
  
  public java.lang.String sludar() throws java.rmi.RemoteException{
    if (saludo == null)
      _initSaludoProxy();
    return saludo.sludar();
  }
  
  public java.lang.String sludarNom(int nom) throws java.rmi.RemoteException{
    if (saludo == null)
      _initSaludoProxy();
    return saludo.sludarNom(nom);
  }
  
  
}