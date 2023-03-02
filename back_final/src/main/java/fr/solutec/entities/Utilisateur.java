package fr.solutec.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data
@Entity
public class Utilisateur {

	@Id @GeneratedValue
	private Long id;
	private String prenom;
	private String nom;
	private String numeroTelephone;
	private String mail;
	private String motDePasse;
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
}
