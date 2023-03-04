package fr.solutec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Amitie;
import fr.solutec.entities.Client;

public interface AmitieRepository extends CrudRepository<Amitie, Long> {

	// supprimer amitié
	public void delete(Amitie amitie);
	
	// trouver tous les clients demandé en ami par un certain client
	@Query("SELECT a.recepteur FROM Amitie a WHERE a.demandeur.id = ?1")
	public List<Client> findAmiRecepteurEnAttente(Long idDemandeur);
	
	// trouver tous les clients qui ont envoyé une demande d'ami à un certain client
	@Query("SELECT a.demandeur FROM Amitie a WHERE a.recepteur.id = ?1")
	public List<Client> findAmiDemandeurEnAttente(Long idRecepteur);
	
	// trouver les demandes en attente envoyees par un certain client
	@Query("SELECT a FROM Amitie a WHERE a.demandeur.id = ?1 AND a.enAttente = true")
	public List<Amitie> findDemandeEnAttente(Long idDemandeur);
	
	// trouver les demandes en attente reçues par un certain client
	@Query("SELECT a FROM Amitie a WHERE a.recepteur.id = ?1 AND a.enAttente = true")
	public List<Amitie> findReceptionEnAttente(Long idDemandeur);
}
