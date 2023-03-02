package fr.solutec.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data
@Entity
public class Client extends Utilisateur{

	//private Photo photo;
	private int points;
	private double note;

	@OneToMany
	private List<CarteBancaire> carteBancaire;
	@OneToMany
	private List<Abonnement> abonnements; // un abonnement par rechargement
	
	@OneToOne
	private Messagerie messagerie;
	
	public Client(int points, double note, List<CarteBancaire> carteBancaire,
			List<Abonnement> abonnements, Messagerie messagerie, Utilisateur u) {
		this.setId(u.getId());
		this.setPrenom(u.getPrenom());
		this.setNom(u.getNom());
		this.setNumeroTelephone(u.getNumeroTelephone());
		this.setMail(u.getMail());
		this.setMotDePasse(u.getMotDePasse());
		this.setDateCreation(u.getDateCreation());
		this.points = points;
		this.note = note;
		this.carteBancaire = carteBancaire;
		this.abonnements = abonnements;
		this.messagerie = messagerie;
	}
	
}
