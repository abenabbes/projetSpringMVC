/**
 * 
 */
package fr.appli.perso.dao.utils;



/**
 * @author abenabbes
 *
 */
public abstract class Transformeur {
	
	protected Object entiteToVo(Object entite ){
		Object valeur = new Object();
		if(entite != null){
			valeur = entite;
		}
		
		return valeur;
		
	}

}
