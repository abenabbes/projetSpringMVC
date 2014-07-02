/**
 * 
 */
package fr.appli.perso.domaine;

import fr.appli.perso.dao.entite.Personne;
import fr.appli.perso.web.vo.PersonneVo;

import java.util.List;

/**
 * @author abenabbes
 *
 */
public interface IPersonneDomaine {

	public void createNew(Personne person);

	public List<Personne> findAll();
	
	public List<PersonneVo> findByNom(String nomPerson);
}
