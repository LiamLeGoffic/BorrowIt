package fr.solutec.rest;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Abonnement;
import fr.solutec.repository.AbonnementRepository;

@RestController @CrossOrigin("*")
public class AbonnementRest {
	
	@Autowired
	private AbonnementRepository abonnementRepos;
	
	// liste de tous les abonnements
	@GetMapping("abonnement")
	public Iterable<Abonnement> getAllAbonnement(){
		return abonnementRepos.findAll();
	}

	// new abonnement (inutile de preciser id ni date d'achat ni date de début d'abonnement)
	@PostMapping("abonnement")
	public Abonnement saveAbonnement(@RequestBody Abonnement abo) {
		List<Date> listDate = abonnementRepos.findDateFinByClientId(abo.getClient().getId());
		// initialiser l'abonnement aujd ou au jour où l'ancien abonnement se termine + 1
		if (listDate.size() != 0) { 
			Date dateExpiration = listDate.get(1);
			for (Date date: listDate) {
				if (dateExpiration.before(date)){
					dateExpiration = date;
				}
			}
			if (!dateExpiration.before(new Date())) { // si encore abonné
				Calendar c = Calendar.getInstance();
				c.setTime(dateExpiration);
				c.add(Calendar.DATE, 1); // ajouter un jour
				dateExpiration = c.getTime();
				abo.setDateDebut(dateExpiration);;
			} else {
				abo.setDateDebut(new Date());
			}
		}
		return abonnementRepos.save(abo);
	}
	
	// liste de tous les abonnements d'un client
	@GetMapping("abonnement/client/{idClient}")
	public List<Abonnement> getAllAbonnementByClientId(@PathVariable Long idClient){
		return abonnementRepos.findByClientId(idClient); //aucun abo alors renvoie la meme chose que client inexistant
	}
	
	// date d'expiration de l'abonnement d'un client (null si jamais eu d'abonnement ou abonnement terminé)
	@GetMapping("abonnement/expirationClient/{idClient}")
	public Date getExpirationAbonnementClient(@PathVariable Long idClient) {
		List<Date> listDate = abonnementRepos.findDateFinByClientId(idClient);
		if (listDate.size() != 0) {
			Date dateExpiration = listDate.get(1);
			for (Date date: listDate) {
				if (dateExpiration.before(date)){
					dateExpiration = date;
				}
			}
			if (!dateExpiration.before(new Date())) {
				return dateExpiration;
			}
		}
		return null;
	}
	
	// supprimer abonnement
	@DeleteMapping("abonnement/delete")
	public void deleteAbonnement(@RequestBody Abonnement abo) {
		abonnementRepos.delete(abo);
	}

}
