/**
 * 
 */
package fr.appli.perso.web.controleur;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author abenabbes
 *
 */
@Controller
public class AccueilControler {
	
	@RequestMapping("/")
    public String printHelloWorld(Model model) {
        model.addAttribute("message", "Ma première page Spring MVC!");
 
        return "index";
    }

}
