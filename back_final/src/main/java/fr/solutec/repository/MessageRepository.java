package fr.solutec.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Message;


public interface MessageRepository extends CrudRepository<Message, Long> {
	
	@Query("SELECT c.messagerie.messages FROM Client c WHERE c.id = ?1 ")
	public Optional<Message> findMessagesByIdClient(Long idClient);
	
	@Query("SELECT msg FROM Message msg WHERE msg.Envoyeur.id = ?1")
	public Optional<Message> findMessagesByIdEnvoyeur(Long idEnvoyeur);
	
	@Query("SELECT msg FROM Message msg WHERE msg.Recepteur.id = ?1")
	public Optional<Message> findMessagesByIdDestinataire(Long idRecepteur);
	
	@Query("SELECT msg FROM Message msg WHERE msg.Envoyeur.id = ?1 AND msg.Recepteur.id = ?2")
	public Optional<Message> findMessagesByIdEnvoyeurEtIdDestinataire(Long idEnvoyeur, Long idRecepeteur);

}