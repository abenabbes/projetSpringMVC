/**
 * 
 */
package fr.appli.perso.web.vo;

import fr.appli.perso.dao.utils.Transformeur;

/**
 * @author abenabbes
 *
 */
public class PersonneVo {

	private String nomPerso;
	private String prenomPerso;
	private int agePerso;
	private String emailPerso;
	public String getNomPerso() {
		return nomPerso;
	}
	public void setNomPerso(String nomPerso) {
		this.nomPerso = nomPerso;
	}
	public String getPrenomPerso() {
		return prenomPerso;
	}
	public void setPrenomPerso(String prenomPerso) {
		this.prenomPerso = prenomPerso;
	}
	public int getAgePerso() {
		return agePerso;
	}
	public void setAgePerso(int agePerso) {
		this.agePerso = agePerso;
	}
	public String getEmailPerso() {
		return emailPerso;
	}
	public void setEmailPerso(String emailPerso) {
		this.emailPerso = emailPerso;
	}
	
	
}
