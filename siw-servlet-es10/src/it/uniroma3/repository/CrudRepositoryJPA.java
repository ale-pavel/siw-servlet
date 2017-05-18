package it.uniroma3.repository;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class CrudRepositoryJPA<T> implements CrudRepository<T> {

	private EntityManager em;
	private Class<T> entityClass;

	public CrudRepositoryJPA(EntityManager em,Class<T> typeParameterClass) {
		this.em = em;		
		this.entityClass = typeParameterClass;
	}

	/*private String getClassName() {
		String fullClassName = this.entityClass.getCanonicalName();
		String className = fullClassName.substring(fullClassName.lastIndexOf('.')+1);
		return className;
	}*/
	//Usare getSimpleName() al suo posto

	@Override
	public T save(T entity) {
		Method getId = null;
		T persistentEntity = null;
		try {
			getId = this.entityClass.getMethod("getId");
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		try {
			if (getId.invoke(entity) == null) {	//come si risolve? con un forName(T.getCanonicalName()) si ha comunque un tipo che non necessariamente possiede getId()
				em.persist(entity);
				persistentEntity = entity;
			} else {
				persistentEntity = em.merge(entity);	//restituisce un oggetto managed
			}
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return persistentEntity;
	}

	@Override
	public T findOne(Long id) {
		return em.find(this.entityClass, id);
	}

	@Override
	public List<T> findAll() {
		TypedQuery<T> query = em.createQuery("SELECT a FROM " + entityClass.getSimpleName() + " a", entityClass);
		return query.getResultList();
	}

	@Override
	public void delete(T entity) {
		em.remove(entity);
	}

	@Override
	public void deleteAll() {
		Query query = em.createQuery("DELETE FROM " + entityClass.getSimpleName());
		query.executeUpdate();
	}

}
