package fr.solutec.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Groupe;
import fr.solutec.entities.PatchDto;
import fr.solutec.repository.GroupeRepository;


@RestController @CrossOrigin("*")
public class GroupeRest {
	@Autowired
	private GroupeRepository groupeRepos;
	
	//Liste tous les groupes
	@GetMapping
	public Iterable<Groupe> getAllGroupes(){
		return groupeRepos.findAll();
	}
	
	//Recherche groupe par Id
	@GetMapping("/groupe/{id}")
	public Iterable<Groupe> RechercheGroupeById(@PathVariable Long id){
		return groupeRepos.RechercheGroupeById(id);
	}
	
	//Creer un groupe
	@PostMapping("groupe")
	public Groupe creerGroupe(@RequestBody Groupe g) {
	return groupeRepos.save(g);
	}
	
	//Supprimer un groupe par Id
	@DeleteMapping("/groupe/{id}")
	public boolean supprimerGroupe (@PathVariable Long id) {
		Optional<Groupe> g = groupeRepos.findById(id);
		if (g.isPresent()) {
			groupeRepos.deleteById(id);
			return true;
		} else {
			return false;
		}
	}
	
	//Modifier un groupe
	public boolean partialUpdate (long id, String key,String value) {
		Optional<Groupe> optional = groupeRepos.findById(id);
		if (optional.isPresent()) {
			Groupe groupe = optional.get();
			
			if (key.equalsIgnoreCase("nom")) {
				groupe.setNom(value);
			}
			if (key.equalsIgnoreCase("typeEchange")) {
				groupe.setTypeEchange(value);
			}
			
			groupeRepos.save(groupe);
			return true;
		} else {
			return false;
		
		}
	}
	
	
	@PatchMapping("/{id}")
	public ResponseEntity<Boolean> modifGroupe (@PathVariable Long id, @RequestBody PatchDto dto){
		if (dto.getOp().equalsIgnoreCase("update")) {
			boolean result = partialUpdate(id, dto.getKey(), dto.getValue());
			return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
		} else {
			return null;
		}
	}
}
