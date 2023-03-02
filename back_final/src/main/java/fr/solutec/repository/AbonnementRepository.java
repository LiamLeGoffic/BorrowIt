package fr.solutec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Abonnement;

public interface AbonnementRepository extends CrudRepository<Abonnement, Long> {
	/*
	@Query("SELECT abo FROM Abonnement abo FULL JOIN Client c ON c.abonnement.id = abo.id WHERE c.id = ?1")
	public List<Abonnement>findAllByClient(Long idClient);*/
	
	
}
