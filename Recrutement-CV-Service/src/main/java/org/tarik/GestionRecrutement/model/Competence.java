package org.tarik.GestionRecrutement.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Competence {
	@Id
	private long cmpId;
	private String cmpLibelle;
	

}
