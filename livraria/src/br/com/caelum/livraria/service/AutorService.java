package br.com.caelum.livraria.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.inject.Inject;

import br.com.caelum.livraria.dao.AutorDao;
import br.com.caelum.livraria.modelo.Autor;

@Stateless
@TransactionAttribute
public class AutorService {

	@Inject
	private AutorDao autorDao;
	
	public void salva(Autor autor) {
		autorDao.salva(autor);
	}
	
	public List<Autor> todosAutores() {
		return autorDao.todosAutores();
	}
	
}
