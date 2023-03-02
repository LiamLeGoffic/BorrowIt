package fr.solutec.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Administrateur;
import fr.solutec.repository.AdminRepository;

@RestController @CrossOrigin("*")
public class AdminRest {
	@Autowired
	private AdminRepository adminRepos;
	
	@PostMapping("/admin")
	public Optional<Administrateur> connexionAdmin(@RequestBody Administrateur admin){
		return adminRepos.connexionAdmin(admin.getMail(), admin.getMotDePasse()); //test
	}
	 
}
