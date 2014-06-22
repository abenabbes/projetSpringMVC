/**
 * 
 */
package fr.appli.perso.dao;

import fr.appli.perso.dao.entite.Personne;
import java.util.List;

/**
 * @author abenabbes
 *
 */
public interface IPersonne extends GenericDAO<Personne, Long>{
	
	/**
	 * Recuperation de la liste des personne.
	 */
	public List<Personne> findByNom(String nomPerson);

}
