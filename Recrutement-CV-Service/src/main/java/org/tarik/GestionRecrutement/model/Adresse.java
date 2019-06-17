package org.tarik.GestionRecrutement.model;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {

	private int numero;
	private String rue;
	private String ville;
	private String paye;

}
