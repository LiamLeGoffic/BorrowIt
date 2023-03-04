package fr.solutec.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.CarteBancaire;

public interface CarteBancaireRepository extends CrudRepository<CarteBancaire, Long> {

	// trouver les CB d'un client
	public List<CarteBancaire> findByProprietaireId(Long idClient);
	// supprimer une CB
	public void delete(CarteBancaire cb);
}
