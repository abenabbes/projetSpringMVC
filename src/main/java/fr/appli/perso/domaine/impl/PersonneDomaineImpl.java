/**
 * 
 */
package fr.appli.perso.domaine.impl;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import fr.appli.perso.dao.IPersonne;
import fr.appli.perso.dao.entite.Personne;
import fr.appli.perso.domaine.IPersonneDomaine;
import fr.appli.perso.web.vo.PersonneVo;

/**
 * @author abenabbes
 *
 */
public class PersonneDomaineImpl implements IPersonneDomaine {

	/** Attribut dela couche DAO*/
	@Autowired
	private IPersonne personneDao;
	
	/** Notre Mapper de Beans. */
	private static DozerBeanMapper mapper;
	
	
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
	public List<PersonneVo> findByNom(String nomPerson) {
		
		List<PersonneVo>  listePersonneVo = new ArrayList<PersonneVo>();
		
		List<Personne>  listePersonne = new ArrayList<Personne>();
		
		listePersonne = personneDao.findByNom(nomPerson);

		if(listePersonne != null){
			
			for(Personne persoTrouv : listePersonne){
				PersonneVo pVo = new PersonneVo();
				 convertirEntiteToVo(persoTrouv, pVo);
				
				listePersonneVo.add(pVo);
			}
		}
		
		
		
		return listePersonneVo;
	}
	
	public static void convertirEntiteToVo(Personne personne, PersonneVo persoVo){
		List<String> mappingFiles = new ArrayList<String>();
	    mappingFiles.add("mapping-dozer-person.xml");

	  // Déclaration des fichiers de mapping
	 mapper = (DozerBeanMapper) DozerBeanMapperSingletonWrapper.getInstance();
	 mapper.setMappingFiles(mappingFiles);
     mapper.map(personne, persoVo);
	}

	public IPersonne getPersonneDao() {
		return personneDao;
	}

	public void setPersonneDao(IPersonne personneDao) {
		this.personneDao = personneDao;
	}

}
