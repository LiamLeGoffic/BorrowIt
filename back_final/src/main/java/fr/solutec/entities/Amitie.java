package fr.solutec.entities;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data
@Entity
public class Amitie {

	@Id @GeneratedValue
	private Long id;
	private boolean enAttente; // true si demande d'ami non acceptée
	@CreationTimestamp
	private Date dateDemande;
	
	@OneToOne
	private Client demandeur;
	@OneToOne
	private Client recepteur;
}
