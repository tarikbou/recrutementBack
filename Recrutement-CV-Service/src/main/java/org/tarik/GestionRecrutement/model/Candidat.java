package org.tarik.GestionRecrutement.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Candidat {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cId;
	@Embedded
	private NomComplet nomComplet;
	@OneToMany(mappedBy = "candidat",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Contact> contact;
	@Embedded
	private Adresse adresse;
	@Embedded
	private Profil profil;
	@OneToMany(mappedBy = "candidat", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Experience> listExperiences;
	@OneToMany(mappedBy = "candidat",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Formation> listFormations;
	@ManyToMany
	private List<Competence> listCompetences;

}
