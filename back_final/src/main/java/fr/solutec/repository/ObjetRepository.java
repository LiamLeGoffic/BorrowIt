package fr.solutec.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Objet;

public interface ObjetRepository extends CrudRepository<Objet, Long> {
	
	// Trouver le proprietaire d'un objet
	@Query("SELECT proprietaire FROM Objet o WHERE o.id = ?1")
	public Optional<Objet> findClientByObjetId(Long id);
	
	public List<Objet> findByProprietaireId(Long id);

	@Query("SELECT o FROM Objet o WHERE o.tag = ?1")
	public List<Objet> findByTag(String tag);
	
	@Query("SELECT o FROM Objet o WHERE o.nom LIKE %?1%")
	public List<Objet> findByNameSaisie(String saisie);
}
