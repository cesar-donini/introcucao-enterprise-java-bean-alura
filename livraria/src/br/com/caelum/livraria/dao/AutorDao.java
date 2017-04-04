package br.com.caelum.livraria.dao;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.caelum.livraria.modelo.Autor;

@Stateless
public class AutorDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@PostConstruct
	void init() {
		System.out.println("Classe " + this.getClass().getName() + " instanciada.");
	}
	
	public void salva(Autor autor) {
		System.out.println("Salvando Autor " + autor.getNome());		
		entityManager.persist(autor);
		System.out.println("Salvo Autor " + autor.getNome());
	}
	
	public List<Autor> todosAutores() {
		return entityManager
				.createQuery("select a from Autor a", Autor.class).getResultList();
	}

	public Autor buscaPelaId(Integer autorId) {
		Autor autor = this.entityManager.find(Autor.class, autorId);
		return autor;
	}
	
}
