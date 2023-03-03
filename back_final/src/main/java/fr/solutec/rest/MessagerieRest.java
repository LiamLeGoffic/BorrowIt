package fr.solutec.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Message;
import fr.solutec.entities.Messagerie;
import fr.solutec.repository.MessagerieRepository;

@RestController @CrossOrigin("*")
public class MessagerieRest {
	@Autowired
	private MessagerieRepository mRepos;
	
	@DeleteMapping("messagerie/{idMessagerie}")
	public boolean deleteMessage(@PathVariable Long idMessagerie) {
		Optional<Messagerie> m = mRepos.findById(idMessagerie);
		if (m.isPresent()) {
			mRepos.deleteById(idMessagerie);
			return true;
		}
		else {
			return false;
		}
	}
	
	
	@GetMapping("messagerie/contacts/{idMessagerie}")
	public Optional<fr.solutec.entities.Client> getContactsByIdMessagerie(@PathVariable Long idMessagerie){
		return mRepos.findContactsByIdMessagerie(idMessagerie);
	}
	
	

}
