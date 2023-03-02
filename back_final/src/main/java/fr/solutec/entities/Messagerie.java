package fr.solutec.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data
@Entity
public class Messagerie {

	@Id @GeneratedValue
	private Long id;
	
	@ManyToMany
	private List<Client> contacts;
	@ManyToMany
	private List<Message> messages;
}
