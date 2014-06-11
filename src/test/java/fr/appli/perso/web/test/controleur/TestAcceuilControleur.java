/**
 * 
 */
package fr.appli.perso.web.test.controleur;

import junit.framework.TestCase;

import org.junit.Test;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import fr.appli.perso.web.controleur.AccueilControler;

/**
 * @author abenabbes
 *
 */
public class TestAcceuilControleur extends TestCase{

	public void testHandleRequestView() throws Exception{		
        AccueilControler controller = new AccueilControler();
        String modelAndView = controller.printHelloWorld(null, null);		
       // assertEquals("index.jsp", modelAndView.getViewName());
    }

}
