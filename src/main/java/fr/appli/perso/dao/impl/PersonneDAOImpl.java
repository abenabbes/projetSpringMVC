/**
 * 
 */
package fr.appli.perso.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hsqldb.lib.ArrayListIdentity;



import fr.appli.perso.dao.IPersonne;
import fr.appli.perso.dao.entite.Personne;
import fr.appli.perso.dao.enums.PersonneTypes;
import fr.appli.perso.dao.utils.ConstantePersistance;

/**
 * @author abenabbes
 *
 */
public class PersonneDAOImpl extends GenericDAOImpl<Personne, Long> implements IPersonne{

	@SuppressWarnings(ConstantePersistance.UNCHECKED)
	@Override
	public List<Personne> findByNom(String nomPerson) {
		
//		StringBuilder requete = new StringBuilder();
//		
//		//Requ�te
//		requete.append(" SELECT perso.prenom, perso.age");
//		requete.append(" FROM Personne AS perso");
//		requete.append(" WHERE perso.nomPerson =:" + ConstantePersistance.PARAM_NOM_PERSON);
//		
//		//Execution de la requ�te
//		Query query = entityManager.createQuery(requete.toString());
//		
//		//Param�tres de la requ�te
//		query.setParameter(ConstantePersistance.PARAM_NOM_PERSON, nomPerson);
//		
//		List<Personne> listePersoResult = new ArrayList<Personne>();
//		listePersoResult = query.getResultList();
		
		
		//BOUCHON
		List<Personne> listePersoResult = new ArrayList<Personne>();
		Personne persoBouchon =  new Personne();
		persoBouchon.setId(112233L);
		persoBouchon.setNom("monNom");
		persoBouchon.setPrenom("monPrenom");
		persoBouchon.setAge(20);
		persoBouchon.setTypePerson(PersonneTypes.HOMME);
		
		listePersoResult.add(persoBouchon);
		
		//Retour de la requete
		return listePersoResult;
	}

}
