package fr.solutec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Abonnement;
import fr.solutec.entities.Client;

public interface ClientRepository extends CrudRepository<Client, Long> {

	@Query("SELECT c.abonnements FROM Client c WHERE c.id = ?1 AND c.points != null")
	public List<Abonnement>findAllAbonnementByClient(Long idClient);
}
