package br.com.caelum.livraria.ws;

import java.rmi.RemoteException;

public class LivroClient {

	public static void main(String[] args) throws RemoteException {
		
		LivroWSProxy livroWSProxy = new LivroWSProxy();
		
		Livro[] buscaLivroPeloNome = livroWSProxy.buscaLivroPeloNome("Java");
		
		for (Livro livro : buscaLivroPeloNome) {
			System.out.println("Título: " + livro.getTitulo());
			System.out.println("Autor: " + livro.getAutor().getNome());
		}
		
	}

}
