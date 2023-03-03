package fr.solutec.rest;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Message;
import fr.solutec.repository.MessageRepository;

@RestController @CrossOrigin("*")
public class MessageRest {
	@Autowired
	private MessageRepository msgRepos;
	
	
	@PostMapping("messagerie/messages")
	public Message saveMessage(@RequestBody Message msg) {
		return msgRepos.save(msg);
	}
	
	
	@DeleteMapping("messagerie/messages/{idMsg}")
	public boolean deleteMessage(@PathVariable Long idMsg) {
		Optional<Message> msg = msgRepos.findById(idMsg);
		if (msg.isPresent()) {
			msgRepos.deleteById(idMsg);
			return true;
		}
		else {
			return false;
		}
	}
	
	@GetMapping("messagerie/messages")
	public Iterable<Message> getAllMessages(){
		return msgRepos.findAll();
	}
	
	@GetMapping("messagerie/messages/{idClient}")
	public Optional<Message> getMessagesByIdClient(@PathVariable Long idClient){
		return msgRepos.findMessagesByIdClient(idClient);
	}

	@GetMapping("messagerie/messages/{idEnvoyeur}")
	public Optional<Message> getMessageByIdEnvoyeur(@PathVariable Long idEnvoyeur){
		return msgRepos.findMessagesByIdEnvoyeur(idEnvoyeur);
	}
	
	@GetMapping("messagerie/messages/{idRecepteur}")
	public Optional<Message> getMessageByIdDestinataire(@PathVariable Long idRecepteur){
		return msgRepos.findMessagesByIdDestinataire(idRecepteur);
	}
	
	@GetMapping("messagerie/messages/{idEnvoyeur}/{idRecepteur}")
	public Optional<Message> getMessageByIdEnvoyeurtIdDestinataire(@PathVariable Long idEnvoyeur, @PathVariable Long idRecepteur){
		return msgRepos.findMessagesByIdEnvoyeurEtIdDestinataire(idEnvoyeur, idRecepteur);
	}
	
	
}
	
	
