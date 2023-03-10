package fr.solutec.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Location;

public interface LocationRepository extends CrudRepository<Location, Long> {

	public Optional<Location> findById(Long id);
	public List<Location> findByObjetId(Long idObjet);
	
	@Query("SELECT l FROM Location l WHERE l.objet.proprietaire.id = ?1")
	public List<Location> findByPropiretaire(Long idClient);
	
	@Query("SELECT l FROM Location l WHERE l.objet.proprietaire.id = ?1 AND l.valide = false")
	public List<Location> findInvalideByPropiretaire(Long idClient);
	
	@Query("SELECT l FROM Location l WHERE l.locataire.id = ?1")
	public List<Location> findByLocataire(Long idClient);
	
}
