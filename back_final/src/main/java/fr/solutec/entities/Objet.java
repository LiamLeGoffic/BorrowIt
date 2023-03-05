package fr.solutec.entities;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data
@Entity
public class Objet {
	
	@Id @GeneratedValue
	private Long id;
	private String nom;
	//private String urlPhoto;
	private double prixJour;
	private double caution;
	//private double note;
	@CreationTimestamp
	private Date dateCreation;
	
	@ManyToOne
	private Client proprietaire;

}
