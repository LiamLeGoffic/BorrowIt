package fr.solutec.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import fr.solutec.entities.Groupe;

public interface GroupeRepository extends CrudRepository<Groupe, Long>{

	@Query("SELECT groupe FROM Groupe groupe WHERE groupe.id = ?1")
	public List<Groupe> RechercheGroupeById(Long id);

	//public List<Groupe> RechercheAllGroupe(); 
	
}
