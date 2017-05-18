package it.uniroma3.service;

import it.uniroma3.model.Prodotto;
import it.uniroma3.repository.ProductRepository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
//import javax.persistence.TypedQuery;

public class ProductService {
	private EntityManager em;

	public ProductService() {}

	public void inserisciProdotto(Prodotto prodotto) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("es-unit");
		this.em = emf.createEntityManager();
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		ProductRepository pr = new ProductRepository(this.em);
		pr.save(prodotto);
		tx.commit();
		em.close();
		emf.close();
	}
	
	public List<Prodotto> getProdotti() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("es-unit");
		this.em = emf.createEntityManager();
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		ProductRepository pr = new ProductRepository(this.em);
		return pr.findAll();
	}

	public Prodotto getOneProduct(Long id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("es-unit");
		this.em = emf.createEntityManager();
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		ProductRepository pr = new ProductRepository(this.em);
		return pr.findOne(id);
	}

	public void delete(Long id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("es-unit");
		this.em = emf.createEntityManager();
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		ProductRepository pr = new ProductRepository(this.em);
		Prodotto prodotto = pr.findOne(id);
		pr.delete(prodotto);
		tx.commit();
		em.close();
		emf.close();
	}
	
}