/**
 * LivroWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.caelum.livraria.ws;

public interface LivroWS extends java.rmi.Remote {
    public br.com.caelum.livraria.ws.Livro[] buscaLivroPeloNome(java.lang.String nomeLivro) throws java.rmi.RemoteException;
}
