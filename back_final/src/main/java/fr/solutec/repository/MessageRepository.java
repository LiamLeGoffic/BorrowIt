package fr.solutec.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Message;
import fr.solutec.entities.Utilisateur;

public interface MessageRepository extends CrudRepository<Message, Long> {
	
	@Query("SELECT c.messagerie.messages FROM Client c WHERE c.id = ?1 ")
	public List<Message> findMessagesByIdClient(Long idClient);
	
	@Query("SELECT msg FROM Message msg WHERE msg.Envoyeur.id = ?1")
	public List<Message> findMessagesByIdEnvoyeur(Long idEnvoyeur);
	
	@Query("SELECT msg FROM Message msg WHERE msg.Recepeteur.id = ?1")
	public List<Message> findMessagesByIdDestinataire(Long idRecepteur);
	
	@Query("SELECT msg FROM Message msg WHERE msg.Envoyeur.id = ?1 AND msg.Recepteur.id = ?2")
	public List<Message> findMessagesByIdEnvoyeurEtIdDestinataire(Long idEnvoyeur, Long idRecepeteur);

}