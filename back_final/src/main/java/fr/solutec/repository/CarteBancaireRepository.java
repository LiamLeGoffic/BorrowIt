package fr.solutec.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.CarteBancaire;

public interface CarteBancaireRepository extends CrudRepository<CarteBancaire, Long> {

	public List<CarteBancaire> findByProprietaireId(Long idClient);
	public void delete(CarteBancaire cb);
}
