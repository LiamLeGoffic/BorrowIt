package fr.solutec.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
public class Administrateur extends Utilisateur {
	
	public Administrateur() {};
	
	public Administrateur(Utilisateur u) {
		this.setId(u.getId());
		this.setPrenom(u.getPrenom());
		this.setNom(u.getNom());
		this.setNumeroTelephone(u.getNumeroTelephone());
		this.setMail(u.getMail());
		this.setMotDePasse(u.getMotDePasse());
	}
}
