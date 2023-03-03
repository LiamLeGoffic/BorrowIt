package fr.solutec.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Message;
import fr.solutec.entities.Messagerie;
import fr.solutec.entities.Client;

public interface MessagerieRepository extends CrudRepository<Messagerie, Long> {
	
	@Query("SELECT m.messages FROM Messagerie m WHERE m.id = ?1")
	public List<Message> findAllMessageByIdMessagerie(Long idMessagerie);
	
	@Query("SELECT m.contacts FROM Messagerie m WHERE m.id = ?1")
	public Optional<Client> findContactsByIdMessagerie(Long idMessagerie);

}
