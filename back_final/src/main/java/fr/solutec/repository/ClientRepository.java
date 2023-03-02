package fr.solutec.repository;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Client;

public interface ClientRepository extends CrudRepository<Client, Long> {

}
