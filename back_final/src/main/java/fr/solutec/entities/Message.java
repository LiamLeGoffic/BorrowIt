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
public class Message {

	@Id @GeneratedValue
	private Long id;
	private String texte;
	@Temporal(TemporalType.DATE)
	private Date date;
	

	@OneToOne
	private Utilisateur Envoyeur; // un admin peut aussi envoyer ou recevoir des msg
	@OneToOne
	private Utilisateur Recepteur;
}
