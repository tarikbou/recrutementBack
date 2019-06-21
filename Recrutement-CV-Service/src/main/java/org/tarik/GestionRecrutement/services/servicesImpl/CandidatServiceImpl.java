package org.tarik.GestionRecrutement.services.servicesImpl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tarik.GestionRecrutement.dao.CandidatCompetenceRepository;
import org.tarik.GestionRecrutement.dao.CandidatRepository;
import org.tarik.GestionRecrutement.dao.CompetenceRepository;
import org.tarik.GestionRecrutement.dto.CandidatMapper;
import org.tarik.GestionRecrutement.dto.entitesDTO.CandidatDTO;
import org.tarik.GestionRecrutement.model.Candidat;
import org.tarik.GestionRecrutement.model.CandidatCompetence;
import org.tarik.GestionRecrutement.model.Competence;
import org.tarik.GestionRecrutement.services.CandidatService;

@Service("candidatservice")
public class CandidatServiceImpl implements CandidatService {
	@Autowired
	CompetenceRepository competenceRepo;
	@Autowired
	CandidatRepository candidatRepo;
	@Autowired
	CandidatCompetenceRepository candidatCompetencerepo;

	@Override
	public CandidatDTO createCandidat(CandidatDTO candidatDTO) {
		Candidat candidat = CandidatMapper.INSTANCE.candidatDTOtoCandidat(candidatDTO);
		candidatRepo.save(candidat);
		CandidatDTO returnedCandidatDTO = CandidatMapper.INSTANCE.candidatToCandidatDTO(candidat);

		if (!candidatDTO.getCompetences().isEmpty()) {
			candidatDTO.getCompetences().forEach(compDAO -> {
				if (compDAO.getCompetenceId().equals(null)) {
					Competence compt = competenceRepo.save(new Competence(compDAO.getLibelle()));
					candidatCompetencerepo.save(new CandidatCompetence(candidat, compt, compDAO.getNiveau()));
				} else {
					candidatCompetencerepo.save(new CandidatCompetence(candidat,
							competenceRepo.findById(compDAO.getCompetenceId()).get(), compDAO.getNiveau()));
				}

			});

		}

	//	return CandidatMapper.INSTANCE.candidatToCandidatDTO(candidatRepo.save(candidat));
		return returnedCandidatDTO;
	}

	@Override
	public CandidatDTO updateCandidat(Long id, CandidatDTO candidatDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCandidat(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<CandidatDTO> getCandidats() {
		// TODO Auto-generated method stub
		return null;
	}

}
