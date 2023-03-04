package fr.solutec.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Amitie;
import fr.solutec.entities.Client;
import fr.solutec.repository.AmitieRepository;

@RestController @CrossOrigin("*")
public class AmitieRest {

	@Autowired
	private AmitieRepository amitieRepos;
	
	// toutes les amitiés
	@GetMapping("amitie")
	public Iterable<Amitie> getAllAmities(){
		return amitieRepos.findAll();
	}
	
	// trouver toutes les amis d'une personne
	@GetMapping("amitie/amis/{idClient}")
	public List<Client> getAmis(@PathVariable Long idClient){
		List<Client> amis = amitieRepos.findAmiRecepteurEnAttente(idClient);
		for (Client c : amitieRepos.findAmiDemandeurEnAttente(idClient)) {
			amis.add(c);
		}
		return amis;
	}
	
	// trouver toutes les demandes reçues en attente d'une personne
	@GetMapping("amitie/enAttente/reception/{idClient}")
	public List<Amitie> getAmitiesReceptionEnAttente(@PathVariable Long idClient){
		return amitieRepos.findReceptionEnAttente(idClient);
	}
	
	// trouver toutes les demandes envoyées en attente d'une personne
	@GetMapping("amitie/enAttente/envoyees/{idClient}")
	public List<Amitie> getAmitiesEnvoyeesEnAttente(@PathVariable Long idClient){
		return amitieRepos.findDemandeEnAttente(idClient);
	}
	
	// nouvelle demande d'amitié
	@PostMapping("amitie")
	public Amitie saveAmitie(@RequestBody Amitie amitie) {
		amitie.setEnAttente(true);
		return amitieRepos.save(amitie);
	}
	
	// acceptation de demande d'amitié
	@PatchMapping("amitie/acceptation/{idAmitie}")
	public Amitie acceptAmitie(@PathVariable Long idAmitie) {
		Optional<Amitie> a = amitieRepos.findById(idAmitie);
		if (a.isPresent()) {
			Amitie amitie = a.get();
			amitie.setEnAttente(false);
			return amitieRepos.save(amitie);
		}
		return null;
	}
	
	// supprimer ami
	@DeleteMapping("amitie/delete")
	public void deleteAmitie(@RequestBody Amitie amitie) {
		amitieRepos.delete(amitie);
	}
	
}
