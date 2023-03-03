package fr.solutec.rest;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
	public Location saveClient(@RequestBody Location l) {
		return locationRepos.save(l);
	}
	
	@GetMapping("location/proprietaire/{idClient}")
	public List<Location> getLocationDuClient(@PathVariable Long idClient){
		return locationRepos.findLocationPropiretaire(idClient);
	}

	@GetMapping("location/locataire/{idClient}")
	public List<Location> getLocationDuLocataire(@PathVariable Long idClient){
		return locationRepos.findLocationLocataire(idClient);
	}
	
	@PatchMapping("location/finReelle/{idLocation}")
	public Location modifierFinReelle(@PathVariable Long idLocation, @RequestBody Date date) {
		Optional<Location> l = locationRepos.findById(idLocation);
		if (l.isPresent()) {
			Location loc = l.get();
			loc.setDateFinRelle(date);
			return loc;
		}
		return null;
	}
	
}
