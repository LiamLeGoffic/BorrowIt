package fr.solutec.rest;

import java.util.Date;
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

import fr.solutec.entities.Abonnement;
import fr.solutec.entities.Location;
import fr.solutec.repository.LocationRepository;

@RestController @CrossOrigin("*")
public class LocationRest {

	@Autowired
	private LocationRepository locationRepos;

	@GetMapping("location")
	public Iterable<Location> getAllLocation(){
		return locationRepos.findAll();
	}

	@GetMapping("location/{idLocation}")
	public Optional<Location> getLocation(@PathVariable Long idLocation){
		return locationRepos.findById(idLocation);
	}

	@PostMapping("location")
	public boolean saveClient(@RequestBody Location l) {
		if (l.getDateFin().before(l.getDateDebut())) {
			return false;
		}
		for (Location loc: locationRepos.findByObjetId(l.getObjet().getId())) {
			if (!(l.getDateFin().before(loc.getDateDebut()) || l.getDateDebut().after(loc.getDateFin()))) {
				return false;
			}
		}
		l.setValide(false);
		l.setPayee(false);
		locationRepos.save(l);
		return true;
	}

	@GetMapping("location/proprietaire/{idClient}")
	public List<Location> getLocationDuProprietaire(@PathVariable Long idClient){
		return locationRepos.findByPropiretaire(idClient);
	}

	@GetMapping("location/invalide/proprietaire/{idClient}")
	public List<Location> getLocationInvalideDuProprietaire(@PathVariable Long idClient){
		return locationRepos.findInvalideByPropiretaire(idClient);
	}

	@GetMapping("location/locataire/{idClient}")
	public List<Location> getLocationDuLocataire(@PathVariable Long idClient){
		return locationRepos.findByLocataire(idClient);
	}

	@PatchMapping("location/finReelle/{idLocation}")
	public Location modifierFinReelle(@PathVariable Long idLocation, @RequestBody Date date) {
		Optional<Location> l = locationRepos.findById(idLocation);
		if (l.isPresent()) {
			Location loc = l.get();
			loc.setDateFinReelle(date);
			return locationRepos.save(loc);
		}
		return null;
	}

	@GetMapping("location/objet/{idObjet}")
	public List<Location> getLocationByObjet(@PathVariable Long idObjet){
		return locationRepos.findByObjetId(idObjet);
	}

	@PatchMapping("location/validation/{idLocation}")
	public Location validationLocation(@PathVariable Long idLocation) {
		Optional<Location> l = locationRepos.findById(idLocation);
		if (l.isPresent()) {
			Location loc = l.get();
			if (!loc.isValide()) {
				loc.setValide(true);
				return locationRepos.save(loc);
			}
		}
		return null;
	}
	
	@PatchMapping("location/paiement/{idLocation}")
	public Location paiementLocation(@PathVariable Long idLocation) {
		Optional<Location> l = locationRepos.findById(idLocation);
		if (l.isPresent()) {
			Location loc = l.get();
			if (!loc.isPayee()) {
				loc.setPayee(true);
				return locationRepos.save(loc);
			}
		}
		return null;
	}

	@DeleteMapping("location/delete/{idLocation}")
	public void deleteLocation(@PathVariable Long idLocation) {
		locationRepos.delete(locationRepos.findById(idLocation).get());
	}

	// supprimer location by client id
	@DeleteMapping("location/{clientId}")
	public boolean deleteLocationByClientId(@PathVariable Long clientId) {
		Optional<Location> u = locationRepos.findById(clientId);
		if (u.isPresent()) {
			for (Location loc : locationRepos.findByLocataire(clientId)) {
				locationRepos.delete(loc);
			}
			return true;
		} else {
			return false;
		}
	}

}
