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
public class Avis {
	
	@Id @GeneratedValue
	private Long id;
	@CreationTimestamp
	private Date dateCreation;
	private String commentaire;
	private double note;
	
	@OneToOne
	private Location location;
}
