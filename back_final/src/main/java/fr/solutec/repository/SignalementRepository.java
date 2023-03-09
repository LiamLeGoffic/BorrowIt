package fr.solutec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import fr.solutec.entities.Signalement;

public interface SignalementRepository extends CrudRepository<Signalement, Long> {
	
	@Query("SELECT s FROM Signalement s WHERE s.clientSuspect.id = ?1")
	public List<Signalement> findByClientSuspectId(Long id);

}
