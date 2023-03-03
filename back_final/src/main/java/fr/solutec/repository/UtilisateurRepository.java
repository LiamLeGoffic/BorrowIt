package fr.solutec.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Utilisateur;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long> {


	@Query("SELECT c FROM Client c WHERE c.mail = ?1 AND c.motDePasse = ?2")
	public Optional<Utilisateur> findUtilisateurByMailPassword(String mail, String motDePasse);
}
