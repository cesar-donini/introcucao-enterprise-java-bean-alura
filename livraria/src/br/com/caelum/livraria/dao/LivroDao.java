package br.com.caelum.livraria.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.caelum.livraria.modelo.Livro;

@Stateless
public class LivroDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public void salva(Livro livro) {
		entityManager.persist(livro);
	}
	
	public List<Livro> todosLivros() {
		return entityManager
				.createQuery("select l from Livro l", Livro.class).getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Livro> buscaLivroPeloNome(String nome) {
		
		Query query = entityManager.createQuery("from Livro where titulo like :nomeLivro")
				.setParameter("nomeLivro", "%"+nome+"%");
		
		return query.getResultList();
	}
	
}
