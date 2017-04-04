package br.com.caelum.livraria.ws;

public class LivroWSProxy implements br.com.caelum.livraria.ws.LivroWS {
  private String _endpoint = null;
  private br.com.caelum.livraria.ws.LivroWS livroWS = null;
  
  public LivroWSProxy() {
    _initLivroWSProxy();
  }
  
  public LivroWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initLivroWSProxy();
  }
  
  private void _initLivroWSProxy() {
    try {
      livroWS = (new br.com.caelum.livraria.ws.LivroWSServiceLocator()).getLivroWSPort();
      if (livroWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)livroWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)livroWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (livroWS != null)
      ((javax.xml.rpc.Stub)livroWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.caelum.livraria.ws.LivroWS getLivroWS() {
    if (livroWS == null)
      _initLivroWSProxy();
    return livroWS;
  }
  
  public br.com.caelum.livraria.ws.Livro[] buscaLivroPeloNome(java.lang.String nomeLivro) throws java.rmi.RemoteException{
    if (livroWS == null)
      _initLivroWSProxy();
    return livroWS.buscaLivroPeloNome(nomeLivro);
  }
  
  
}