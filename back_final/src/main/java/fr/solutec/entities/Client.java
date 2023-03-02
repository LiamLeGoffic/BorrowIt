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

	private Long idClient;
	//private Photo photo;
	private int points;
	private double note;
	
	@OneToMany
	private List<CarteBancaire> carteBancaire;
	@OneToMany
	private List<Abonnement> abonnements; // un abonnement par rechargement
	
	@OneToOne
	private Messagerie messagerie;
	
}
