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

import fr.solutec.entities.Objet;
import fr.solutec.entities.Utilisateur;
import fr.solutec.repository.UtilisateurRepository;

@RestController @CrossOrigin("*")
public class UtilisateurRest {

	@Autowired
	private UtilisateurRepository utilisateurRepos;

	//liste de tous les utilisateurs
	@GetMapping("utilisateur")
	public Iterable<Utilisateur> getAllUtilisateurs(){
		return utilisateurRepos.findAll();
	}

	@PostMapping("utilisateur")
	public Utilisateur saveClient(@RequestBody Utilisateur u) {
		return utilisateurRepos.save(u);
	}


	@PostMapping("utilisateur/login")
	public Optional<Utilisateur> getUtilisateurByLoginAndPassword(@RequestBody Utilisateur u){
		return utilisateurRepos.findUtilisateurByMailPassword(u.getMail(), u.getMotDePasse());
	}

	// Supprimer un objet
	@DeleteMapping("utilisateur/{id}")
	public boolean deleteUtilisateur(@PathVariable Long id) {
		Optional<Utilisateur> u = utilisateurRepos.findById(id);
		if (u.isPresent()) {
			utilisateurRepos.deleteById(id);
			return true;
		} else {
			return false;
		}
	}
}
