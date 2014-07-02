package fr.appli.perso.dao.entite;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import fr.appli.perso.dao.enums.PersonneTypes;

@Entity
@Table(name="PERSONNE1")
public class Personne implements Serializable{
	
	/**
	 * Numeros de serialisation.
	 */
	private static final long serialVersionUID = 1L;
	
	/** Identifiant de la personne */
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable=false, unique = true)	
	private Long id;
	
	/** Nom de la personne*/
	@Column(name = "NOM")
	private String nom;
	
	/**Prenom*/
	@Column(name = "PRENOM")
	private String prenom;
	
	/** Age de la personne*/
	@Column(name = "AGE")
	private int age;
	
	/** type de la personne*/
	@Enumerated(EnumType.STRING)
	private PersonneTypes typePerson;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public PersonneTypes getTypePerson() {
		return typePerson;
	}
	public void setTypePerson(PersonneTypes typePerson) {
		this.typePerson = typePerson;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result
				+ ((typePerson == null) ? 0 : typePerson.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		if (age != other.age)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (typePerson != other.typePerson)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom
				+ ", age=" + age + ", typePerson=" + typePerson + "]";
	}
	
	

}
