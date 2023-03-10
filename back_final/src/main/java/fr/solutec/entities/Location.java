package fr.solutec.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data
@Entity
public class Location {

	@Id @GeneratedValue
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	@Temporal(TemporalType.DATE)
	private Date dateFinReelle; // date a laquelle le locataire rend l'objet
	private boolean valide; // true si validé par le propriétaire de l'objet
	private boolean payee; // true si location déjà payée
	
	@OneToOne
	private Objet objet;
	@OneToOne
	private Client locataire;
	
}
