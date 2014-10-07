/**
 * 
 */
package fr.appli.perso.dao.test.utils;

import static org.junit.Assert.*;

import java.util.List;

import org.dozer.DozerBeanMapper;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.appli.perso.domaine.IPersonneDomaine;
import fr.appli.perso.web.vo.PersonneVo;

/**
 * @author abenabbes
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/spring/test-application-context.xml"})
public class TestPersonneDao {

	/** Notre Mapper de Beans. */
	private static DozerBeanMapper mapper;
	
	@Autowired
	private IPersonneDomaine  personneDomaine;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testfindPersonByName(){
		String nomPerson = "monNom";
		List<PersonneVo> listePerso = personneDomaine.findByNom(nomPerson);
		Assert.assertNotNull(listePerso);
		
		
	}


	public static DozerBeanMapper getMapper() {
		return mapper;
	}

	public static void setMapper(DozerBeanMapper mapper) {
		TestPersonneDao.mapper = mapper;
	}

	public IPersonneDomaine getPersonneDomaine() {
		return personneDomaine;
	}

	public void setPersonneDomaine(IPersonneDomaine personneDomaine) {
		this.personneDomaine = personneDomaine;
	}

}
