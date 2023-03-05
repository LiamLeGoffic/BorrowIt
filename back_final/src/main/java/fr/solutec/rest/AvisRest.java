package fr.solutec.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Avis;
import fr.solutec.entities.Client;
import fr.solutec.repository.AvisRepository;
import fr.solutec.repository.ClientRepository;

@RestController @CrossOrigin("*")
public class AvisRest {

	@Autowired
	private AvisRepository avisRepos;
	@Autowired
	private ClientRepository clientRepos;
	
	// liste de tous les avis
	@GetMapping("avis")
	public Iterable<Avis> getAllAvis(){
		return avisRepos.findAll();
	}
	
	// liste des avis sur un objet
	@GetMapping("avis/objet/{idObjet}")
	public List<Avis> getAvisSurObjet(@PathVariable Long idObjet){
		return avisRepos.findByLocationObjetId(idObjet);
	}
	
	// liste de tous les avis postés par un client
	@GetMapping("avis/locataire/{idClient}")
	public List<Avis> getAvisDuClient(@PathVariable Long idClient){
		return avisRepos.findByLocationLocataireId(idClient);
	}
	
	// liste de tous les avis reçus par un client
	@GetMapping("avis/proprietaire/{idClient}")
	public List<Avis> getAvisSurClient(@PathVariable Long idClient){
		return avisRepos.findByLocationObjetProprietaireId(idClient);
	}
	
	// nouvel avis (met à jour note moyenne du proprio mais code remplaçable par un trigger)
	@PostMapping("avis")
	public Avis saveAvis(@RequestBody Avis a) {
		Client proprietaire = a.getLocation().getObjet().getProprietaire(); //proprio de l'objet noté
		List<Double> notes = avisRepos.findNotesDuProprietaire(proprietaire.getId());
		notes.add(a.getNote());
		double total = 0;
		for (Double note : notes) {
		    total += note;
		}
		double moyenne = total / notes.size();
		proprietaire.setNote(moyenne);
		clientRepos.save(proprietaire);
		return avisRepos.save(a);
	}
	
	// modifier un avis laissé
	@PatchMapping("avis/modifier/{idAvis}")
	public Avis modifierAvis(@PathVariable Long idAvis, @RequestBody Avis a) {
		a.setId(idAvis);
		return avisRepos.save(a);
	}
	
	// supprimer un avis
	@DeleteMapping("avis/delete")
	public void deleteAvis(@RequestBody Avis a) {
		avisRepos.delete(a);
	}
	
}
