package fr.solutec.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Administrateur;
import fr.solutec.repository.AdminRepository;

@RestController @CrossOrigin("*")
public class AdminRest {
	@Autowired
	private AdminRepository adminRepos;
	
	/*@PostMapping("administrateur")
	public Optional<Administrateur> connexionAdmin(@RequestBody Administrateur admin){
		return adminRepos.connexionAdmin(admin.getMail(), admin.getMotDePasse()); //test
	}*/
	
	// trouver tous les administrateurs
		@GetMapping("administrateur")
		public Iterable<Administrateur> getAllAdmin(){
			return adminRepos.findAll();
		}
	
	// trouver un administrateur par son id
	@GetMapping("administrateur/{idAdmin}")
	public Optional<Administrateur> getAdmin(@PathVariable Long idAdmin){
		return adminRepos.findById(idAdmin);
	}
	
	// creer nouvel administrateur
	@PostMapping("administrateur")
	public Administrateur saveAdmin(@RequestBody Administrateur admin) {
		return adminRepos.save(admin);
	}
}
