package fr.solutec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Message;
import fr.solutec.entities.Messagerie;

public interface MessagerieRepository extends CrudRepository<Messagerie, Long> {
	
	@Query("SELECT m.messages FROM Messagerie m WHERE m.id = ?1")
	public List<Message> findAllMessageByIdMessagerie(Long idMessagerie);


}
