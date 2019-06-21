package org.tarik.GestionRecrutement.dto.entitesDTO;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class CandidatDTO {

	private Long candidatId = null;
	// nom complet
	private String nom;
	private String prenom;
	private String sex;
	// adresse
	private int numeroAdresse;
	private String rue;
	private String ville;
	private String paye;

	// profil
	private String typeProfil;
	private int nbrAnneesExp;
	private String domain;

//	private List<ContactDTO> contact=new ArrayList<>();
//	private List<ExperienceDTO> experiences=new ArrayList<ExperienceDTO>();
//	
//	private List<FormationDTO> formations=new ArrayList<FormationDTO>();
//
	private List<CompetenceDTO> competences = new ArrayList<CompetenceDTO>();

}
