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

import fr.solutec.entities.Avis;
import fr.solutec.entities.Client;
import fr.solutec.entities.Location;
import fr.solutec.entities.Objet;
import fr.solutec.repository.AvisRepository;
import fr.solutec.repository.ClientRepository;
import fr.solutec.repository.LocationRepository;

@RestController @CrossOrigin("*")
public class AvisRest {

	@Autowired
	private AvisRepository avisRepos;
	@Autowired
	private ClientRepository clientRepos;
	@Autowired
	private LocationRepository locationRepos;

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
	
	// liste des avis sur un objet
	@GetMapping("avis/location/{idLocation}")
	public Optional<Avis> getAvisSurLocation(@PathVariable Long idLocation){
		return avisRepos.findByLocationId(idLocation);
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

	// nouvel avis (+ met à jour note moyenne du proprio)
	@PostMapping("avis")
	public Avis saveAvis(@RequestBody Avis a) {
		avisRepos.save(a);
		updateNote(a, false);
		return a;
	}

	// modifier un avis laissé (+ met à jour note moyenne du proprio)
	@PatchMapping("avis/modifier/{idAvis}")
	public Avis modifierAvis(@PathVariable Long idAvis, @RequestBody Avis a) {
		a.setId(idAvis);
		if (a.getLocation() == null) {
			a.setLocation(locationRepos.findById(avisRepos.findById(idAvis).get().getLocation().getId()).get());
		}
		avisRepos.save(a);
		updateNote(a, false);
		return a;
	}

	// supprimer un avis (+ met à jour note moyenne du proprio)
	@DeleteMapping("avis/delete/{idAvis}")
	public void deleteAvis(@PathVariable Long idAvis) {
		Avis a = avisRepos.findById(idAvis).get();
		updateNote(a, true);
		avisRepos.delete(a);
		System.out.println(a.toString());
	}

	// met à jour note moyenne du proprio
	private void updateNote(Avis a, boolean isDelete){
		Location l = locationRepos.findById(a.getLocation().getId()).get();
		Client proprietaire = l.getObjet().getProprietaire(); //proprio de l'objet noté
		List<Double> notes = avisRepos.findNotesDuProprietaire(proprietaire.getId());
		if (!isDelete) {
			notes.add(a.getNote());
		}
		double total = 0;
		for (Double note : notes) {
			total += note;
		}
		if (isDelete) {
			notes.remove(a.getNote());
		}
		if (notes.size() == 0) {
			proprietaire.setNote(0);
		} else {
			proprietaire.setNote(total / notes.size());
		}
		clientRepos.save(proprietaire);
	}

	// supprimer avis by client id
	@DeleteMapping("avis/{clientId}")
	public boolean deleteAvisByClientId(@PathVariable Long clientId) {
		Optional<Avis> u = avisRepos.findById(clientId);
		if (u.isPresent()) {
			for (Avis avis : avisRepos.findByLocationObjetProprietaireId(clientId)) {
				avisRepos.delete(avis);
			}
			return true;
		} else {
			return false;
		}
	}

}
