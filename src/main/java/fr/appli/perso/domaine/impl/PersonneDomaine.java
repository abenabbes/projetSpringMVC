/**
 * 
 */
package fr.appli.perso.domaine.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import fr.appli.perso.dao.IPersonne;
import fr.appli.perso.dao.entite.Personne;
import fr.appli.perso.domaine.IPersonneDomaine;
import fr.appli.perso.web.vo.PersonneVo;

/**
 * @author abenabbes
 *
 */
public class PersonneDomaine implements IPersonneDomaine {

	/** Attribut dela couche DAO*/
	private IPersonne personneDao;
	
	@Override
	public void createNew(Personne person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Personne> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Personne> findByNom(String nomPerson) {
		//List<PersonneVo>  listePersonne = new ArrayList<PersonneVo>();
		
		List<Personne>  listePersonne = new ArrayList<Personne>();
		
		listePersonne = personneDao.findByNom(nomPerson);
		
		if(listePersonne == null){
			return null;
		}
		
		return listePersonne;
	}

}
