package fr.solutec.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Objet;
import fr.solutec.entities.Signalement;
import fr.solutec.repository.SignalementRepository;

@RestController @CrossOrigin("*")
@RequestMapping("signalement")
public class SignalementRest {

	@Autowired
	private SignalementRepository signalementRepos;
	
	// Liste de tous les objets
	@GetMapping
	public Iterable<Signalement> getAllSignalements(){
		return signalementRepos.findAll();
	}
	
	// Objet par son id
	@GetMapping("/{id}")
	public Optional<Signalement> getSignalementById(@PathVariable Long id){
		return signalementRepos.findById(id);
	}
	
	// Créer un nouvel objet
	@PostMapping
	public Signalement saveSignalement(@RequestBody Signalement s) {
		return signalementRepos.save(s);
	}
	
	// Supprimer un objet
	@DeleteMapping
	public void deleteSignalement(@RequestBody Signalement s) {
		signalementRepos.delete(s);
	}
	
	// Voir liste de signalement d'une personne
	@GetMapping("/listeSignalementClient/{id}")
	public List<Signalement> getSignalementByClient(@PathVariable Long id){
		return signalementRepos.findByClientSuspectId(id);
	}
	
	// Nombre de signalements par id
	@GetMapping("/nbSignalements/{id}")
	public int getNombreSignalementByClient(@PathVariable Long id){
		return signalementRepos.findByClientSuspectId(id).size();
	}

	
}
