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
public class Objet {
	
	@Id @GeneratedValue
	private Long id;
	private String nom;
	//private Photo photo;
	private double prixJour;
	private double caution;
	@Temporal(TemporalType.DATE)
	private Date dateCreation;

}
