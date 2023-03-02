package fr.solutec.repository;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Abonnement;

public interface AbonnementRepository extends CrudRepository<Abonnement, Long> {
	
}
