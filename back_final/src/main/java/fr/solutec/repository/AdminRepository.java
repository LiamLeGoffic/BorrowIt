package fr.solutec.repository;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Administrateur;

public interface AdminRepository extends CrudRepository<Administrateur, Long> {
	

}
