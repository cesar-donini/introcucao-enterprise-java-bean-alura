package br.com.caelum.livraria.ws;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.caelum.livraria.dao.LivroDao;
import br.com.caelum.livraria.modelo.Livro;

@Stateless
@WebService
public class LivroWS {

	@Inject
	private LivroDao livroDao;
	
	@WebMethod
	@WebResult(name="livro")
	public List<Livro> buscaLivroPeloNome(@WebParam(name="nomeLivro") String nome) {
		return livroDao.buscaLivroPeloNome(nome);
	}
}
