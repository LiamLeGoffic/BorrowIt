package fr.solutec.rest;

import java.security.Provider.Service;
import java.util.List;
import java.util.Optional;

import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Objet;
import fr.solutec.entities.PatchDto;
import fr.solutec.repository.ObjetRepository;

@RestController @CrossOrigin("*")
@RequestMapping("objet")
public class ObjetRest {

	@Autowired
	private ObjetRepository objetRepos;
	
	// Liste de tous les objets
	@GetMapping
	public Iterable<Objet> getAllObjets(){
		return objetRepos.findAll();
	}
	
	// Objet par son id
	@GetMapping("/{id}")
	public Optional<Objet> getObjetById(@PathVariable Long id){
		return objetRepos.findById(id);
	}
	
	// Créer un nouvel objet
	@PostMapping
	public Objet saveObjet(@RequestBody Objet o) {
		return objetRepos.save(o);
	}
	
	// Supprimer un objet
	@DeleteMapping("/{id}")
	public boolean deleteObjet(@PathVariable Long id) {
		Optional<Objet> o = objetRepos.findById(id);
		if (o.isPresent()) {
			objetRepos.deleteById(id);
			return true;
		} else {
			return false;
		}
	}
	
	// Voir le propriétaire depuis l'objet
	@GetMapping("/client/{id}")
	public Optional<Objet> getClientbyObjetId(@PathVariable Long id){
		return objetRepos.findClientByObjetId(id);
	}
	
	// Voir la liste d'objets d'un client
	@GetMapping("/listeObjetsClient/{id}")
	public List<Objet> getObjetByProprietaire(@PathVariable Long id){
		return objetRepos.findByProprietaireId(id);
	}
	
	// Voir la liste d'objets d'un tag
		@GetMapping("/tag/{tag}")
		public List<Objet> getObjetByTag(@PathVariable String tag){
			return objetRepos.findByTag(tag);
		}
		
	// Modifier un objet partiellement
	public boolean partialUpdate(long id, String key, String value){
		    Optional<Objet> optional = objetRepos.findById(id);
		    if (optional.isPresent()) {
		      Objet objet = optional.get();
		      
		      if (key.equalsIgnoreCase("nom")) {
			    objet.setNom(value);
			  }
		      if (key.equalsIgnoreCase("prixJour")) {
		        objet.setPrixJour(Double.parseDouble(value));
		      }
		      if (key.equalsIgnoreCase("caution")) {
		        objet.setCaution(Double.parseDouble(value));
		      }

		      objetRepos.save(objet);
		      return true;
		    } else {
		      return false;
		    }
		  }
	
	@PatchMapping("/{id}")
	public ResponseEntity<Boolean> modifObjet(@PathVariable Long id, @RequestBody PatchDto dto){
		if (dto.getOp().equalsIgnoreCase("update")) {
			boolean result = partialUpdate(id, dto.getKey(), dto.getValue());
			return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
		} else {
			return null;
		}
		
	}
}







