package fr.solutec.rest;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Client;
import fr.solutec.entities.Utilisateur;
import fr.solutec.repository.ClientRepository;

@RestController @CrossOrigin("*")
public class ClientRest {

	@Autowired
	private ClientRepository clientRepos;

	@GetMapping("client")
	public Iterable<Client> getAllAbonnement(){
		return clientRepos.findAll();
	}

	@PostMapping("client")
	public Client saveClient(@RequestBody Client c) {
		return clientRepos.save(c);
	}

	// Supprimer un objet
	@DeleteMapping("client/{id}")
	public boolean deleteClient(@PathVariable Long id) {
		Optional<Client> u = clientRepos.findById(id);
		if (u.isPresent()) {
			clientRepos.deleteById(id);
			return true;
		} else {
			return false;
		}
	}


}
