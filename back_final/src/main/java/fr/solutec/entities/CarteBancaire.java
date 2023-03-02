package fr.solutec.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data
@Entity
public class CarteBancaire {

	@Id @GeneratedValue
	private Long id;
	private Long numero;
	@Temporal(TemporalType.DATE) // pas besoin du jour en principe (mm/yyyy)
	private Date dateExpiration;
	private int code;
}
