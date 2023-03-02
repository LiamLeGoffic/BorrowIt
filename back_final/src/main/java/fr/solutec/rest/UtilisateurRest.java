package fr.solutec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Utilisateur;
import fr.solutec.repository.UtilisateurRepository;

@RestController @CrossOrigin("*")
public class UtilisateurRest {

	@Autowired
	private UtilisateurRepository utilisateurRepos;
	

	@PostMapping("utilisateur")
	public Utilisateur saveClient(@RequestBody Utilisateur u) {
		return utilisateurRepos.save(u);
	}
}
