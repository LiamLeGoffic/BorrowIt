package fr.solutec.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Administrateur;

public interface AdminRepository extends CrudRepository<Administrateur, Long> {
	
	@Query("SELECT admin FROM Administrateur admin WHERE admin.mail = ?1 AND admin.motDePasse = ?2")
	public Optional<Administrateur> connexionAdmin(String mail, String motDePasse);
	
	
	
}
