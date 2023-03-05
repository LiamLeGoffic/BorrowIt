package fr.solutec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Avis;

public interface AvisRepository extends CrudRepository<Avis, Long> {

	
	// trouver avis sur un objet
	@Query("SELECT a FROM Avis a WHERE a.location.objet.id = ?1")
	public List<Avis> findByLocationObjetId(Long idObjet);

	// trouver avis postés par un client
	@Query("SELECT a FROM Avis a WHERE a.location.locataire.id = ?1")
	public List<Avis> findByLocationLocataireId(Long idClient);
	
	// trouver avis reçus par un client
	@Query("SELECT a FROM Avis a WHERE a.location.objet.proprietaire.id = ?1")
	public List<Avis> findByLocationObjetProprietaireId(Long idClient);
	
	// liste de toutes les notes d'un client
	@Query("SELECT a.note FROM Avis a WHERE a.location.objet.proprietaire.id = ?1")
	public List<Double> findNotesDuProprietaire(Long idClient);
}
