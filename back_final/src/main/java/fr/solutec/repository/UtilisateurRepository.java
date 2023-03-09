package fr.solutec.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Utilisateur;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long> {


	@Query("SELECT u FROM Utilisateur u WHERE u.mail = ?1 AND u.motDePasse = ?2")
	public Optional<Utilisateur> findUtilisateurByMailPassword(String mail, String motDePasse);
}
