package fr.solutec.entities;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
	@CreationTimestamp
	private Date dateCreation;
	
	
}
