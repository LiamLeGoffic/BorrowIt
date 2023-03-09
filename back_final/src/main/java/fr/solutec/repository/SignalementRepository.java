package fr.solutec.repository;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Signalement;

public interface SignalementRepository extends CrudRepository<Signalement, Long> {

}
