package fr.appli.perso.dao.test.utils;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.DozerBeanMapperSingletonWrapper;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.appli.perso.dao.entite.Personne;
import fr.appli.perso.domaine.IPersonneDomaine;
import fr.appli.perso.web.vo.PersonneVo;

/**
 * @author abenabbes
 *
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"classpath:spring/test-application-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/test-application-context.xml"})
public class TestMappingClasses {
	
	/** Notre Mapper de Beans. */
	private static DozerBeanMapper mapper;
	
	@Autowired
	private IPersonneDomaine  personneDomaine;
	
	public static void convertirToVo(Personne personne, PersonneVo persoVo){
		List<String> mappingFiles = new ArrayList<String>();
	    mappingFiles.add("mapping-dozer-person.xml");
		//Mapper mapper = new DozerBeanMapper();
	 // Déclaration des fichiers de mapping
	 mapper = (DozerBeanMapper) DozerBeanMapperSingletonWrapper.getInstance();
	 mapper.setMappingFiles(mappingFiles);
     mapper.map(personne, persoVo);
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
 
		// Définition des fichiers de mapping
//		List <String> mappingFiles = new ArrayList <String>();
//		mappingFiles.add("mapping-dozer-person.xml");
// 
//		// Déclaration des fichiers de mapping
//		mapper = (DozerBeanMapper) DozerBeanMapperSingletonWrapper.getInstance();
//		mapper.setMappingFiles(mappingFiles);
	}
	
	@Test
	public void testMapping(){
		Personne perso = new Personne();
		perso.setNom("Nom");
		perso.setPrenom("prenom");
		
		//PersonneVo persovo = (PersonneVo) mapper.map(perso, PersonneVo.class);
		PersonneVo persovo = new PersonneVo();
		convertirToVo(perso, persovo);
		Assert.assertEquals(perso.getNom(), persovo.getNomPerso());
		Assert.assertEquals(perso.getPrenom(), persovo.getPrenomPerso());
	}
	
	@Test
	public void testfindPersonByName(){
		String nomPerson = "monNom";
		List <PersonneVo> listePerso = personneDomaine.findByNom(nomPerson);
		Assert.assertNotNull(listePerso);
		
		
	}

	public IPersonneDomaine getPersonneDomaine() {
		return personneDomaine;
	}

	public void setPersonneDomaine(IPersonneDomaine personneDomaine) {
		this.personneDomaine = personneDomaine;
	}

}
