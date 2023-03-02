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
public class Amitie {

	@Id @GeneratedValue
	private Long id;
	private boolean isAccepte; // demande d'ami acceptée
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	
	@OneToOne
	private Client demandeur;
	@OneToOne
	private Client recepteur;
}
