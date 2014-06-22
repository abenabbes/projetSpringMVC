/**
 * 
 */
package fr.appli.perso.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author abenabbes
 *
 */
public interface GenericDAO<T, ID extends Serializable> {
	  
	T loadById(ID id);
	
	void persist(T entity);
	
	void update(T entity);
	
	void delete(T entity);
	
	List<T> loadAll();

}
