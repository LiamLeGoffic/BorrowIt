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
public class Signalement {

	@Id @GeneratedValue
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date date;
	private String typeSignalement; // "objet defectueux" ou "insulte" ou ...
	private String commentaire;
	
	@OneToOne
	private Client clientSuspect;
	@OneToOne
	private Client clientSignaleur;
}
