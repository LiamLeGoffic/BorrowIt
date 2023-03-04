package fr.solutec.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Abonnement;

public interface AbonnementRepository extends CrudRepository<Abonnement, Long> {
	
	// trouver les abonnements d'un client
	public List<Abonnement> findByClientId(Long idClient);
	// supprimer un abonnement
	public void delete(Abonnement abo);
	
	// renvoyer toutes les dates d'expiration des abonnements d'un client
	@Query("SELECT abo.dateFin FROM Abonnement abo WHERE abo.client.id = ?1")
	public List<Date> findDateFinByClientId(Long idClient);
}
