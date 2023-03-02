package fr.solutec.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Abonnement;
import fr.solutec.repository.AbonnementRepository;

@RestController @CrossOrigin("*")
public class AbonnementRest {
	
	@Autowired
	private AbonnementRepository abonnementRepos;
	
	@GetMapping("abonnement")
	public Iterable<Abonnement> getAllAbonnement(){
		return abonnementRepos.findAll();
	}
	/*
	@GetMapping("abonnement/client/{idClient}")
	public List<Abonnement> getAllAbonnementById(@PathVariable Long idClient){
		return abonnementRepos.findAllByClient(idClient);
	}*/
	

	@PostMapping("abonnement")
	public Abonnement saveFriendship(@RequestBody Abonnement abo) {
		return abonnementRepos.save(abo);
	}

}
