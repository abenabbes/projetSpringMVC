/**
 * 
 */
package fr.appli.perso.web.controleur;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author abenabbes
 *
 */
@Controller
public class AccueilControler {
	/** Logging */
	private static final Logger logger = LoggerFactory.getLogger(AccueilControler.class);
    
	
	@RequestMapping("/")
    public String printHelloWorld(Model model, Locale locale) {
		
		logger.info("[LOGGER] Appel de la page d'accueil.");
       
		model.addAttribute("message", "Ma première page Spring MVC!");
 
        return "index";
    }

}
