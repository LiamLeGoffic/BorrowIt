package fr.solutec.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.CarteBancaire;
import fr.solutec.repository.CarteBancaireRepository;

@RestController @CrossOrigin("*")
public class CarteBancaireRest {

	@Autowired
	private CarteBancaireRepository cbRepos;
	
	// liste de toutes les CB
	@GetMapping("carteBancaire")
	public Iterable<CarteBancaire> getAllAbonnement(){
		return cbRepos.findAll();
	}
	
	// liste de toutes les CB d'un client
	@GetMapping("carteBancaire/client/{idClient}")
	public List<CarteBancaire> getCartesDuClient(@PathVariable Long idClient){
		return cbRepos.findByProprietaireId(idClient);
	}
	
	// nouvelle CB
	@PostMapping("carteBancaire")
	public CarteBancaire saveCarteBancaire(@RequestBody CarteBancaire cb) {
		return cbRepos.save(cb);
	}

	// supprimer une CB
	@DeleteMapping("carteBancaire/delete")
	public void deleteAbonnement(@RequestBody CarteBancaire cb) {
		cbRepos.delete(cb);
	}
}
