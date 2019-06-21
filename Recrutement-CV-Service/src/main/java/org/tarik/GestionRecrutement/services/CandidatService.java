package org.tarik.GestionRecrutement.services;

import java.util.Collection;

import org.tarik.GestionRecrutement.dto.entitesDTO.CandidatDTO;

public interface CandidatService {
	
	public CandidatDTO createCandidat(CandidatDTO candidatDTO);
	public CandidatDTO updateCandidat(Long id, CandidatDTO candidatDTO);
	public void deleteCandidat(Long id);
	public Collection<CandidatDTO> getCandidats();


}
