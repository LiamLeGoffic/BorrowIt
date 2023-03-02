package fr.solutec.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data
@Entity
public class Groupe {

	@Id @GeneratedValue
	private Long id;
	private String nom;
	private String typeEchange; // avec ou sans caution (les loc sont gratuites)
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	
	@ManyToMany
	private List<Client> clients;
	
}
