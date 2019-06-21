package org.tarik.GestionRecrutement.services.servicesImpl;

import org.springframework.stereotype.Service;
@Service("implcvservice")
public class CVServiceImpl  {

//	
//	@Autowired
//	CompetenceRepository competenceRepo;
//	@Autowired
//	CandidatRepository candidatRepo;
//	@Autowired
//	CandidatCompetenceRepository candidatCompetencerepo;
//	
//	
//
//	@Override
//	public CVDTO createCV(CVDTO cvdto) {
//		//Candidat candidat=new Candidat();
//	//	ModelMapper modelMapper = new ModelMapper();
//
//	//	Candidat candidat= modelMapper.map(cvdto, Candidat.class);
//	
//	//	candidat= modelMapper.map(cvdto, Candidat.class);
////		candidat.getNomComplet().setNom(cvdto.getNom());
////		candidat.getNomComplet().setPrenom(cvdto.getPrenom());
////		candidat.getAdresse().setNumeroAdresse(cvdto.getNumeroAdresse());
////		candidat.getAdresse().setPaye(cvdto.getPaye());
////		candidat.getAdresse().setRue(cvdto.getRue());
////		candidat.getAdresse().setVille(cvdto.getVille());
////		candidat.setSex(cvdto.getSex());
////		candidat.getProfil().setDomain(cvdto.getDomain());
////		candidat.getProfil().setNbrAnneesExp(cvdto.getNbrAnneesExp());
////		candidat.getProfil().setPType(cvdto.getPaye());
////		candidatRepo.save(candidat);
//		
//		if(!cvdto.getCompetences().isEmpty())
//		{
//     cvdto.getCompetences().forEach(cmp->{
//    	   Competence comp= new Competence(cmp.getLibelle());
//    	  competenceRepo.save(comp);
//    //	  candidatCompetencerepo.save(new CandidatCompetence(candidat,comp,cmp.getNiveau()));
//     });
//			
//		}
////		 Optional<Candidat> result=candidatRepo.findById(candidat.getCId());
////
////		return modelMapper.map(result.get(), CVDTO.class);
//	///	return modelMapper.map(candidat, CVDTO.class);
//	}
//
//	@Override
//	public CVDTO updateCV(Long id, CVDTO cvdto) {
//		Candidat candidat=new Candidat();
//		ModelMapper modelMapper = new ModelMapper();
//
//		
////		candidat= modelMapper.map(cvdto, Candidat.class);
//		candidat.getNomComplet().setNom(cvdto.getNom());
//		candidat.getNomComplet().setPrenom(cvdto.getPrenom());
//		candidat.getAdresse().setNumeroAdresse(cvdto.getNumeroAdresse());
//		candidat.getAdresse().setPaye(cvdto.getPaye());
//		candidat.getAdresse().setRue(cvdto.getRue());
//		candidat.getAdresse().setVille(cvdto.getVille());
//		candidat.setSex(cvdto.getSex());
//		candidat.getProfil().setDomain(cvdto.getDomain());
//		candidat.getProfil().setNbrAnneesExp(cvdto.getNbrAnneesExp());
//		candidat.getProfil().setPType(cvdto.getPaye());
//		candidatRepo.save(candidat);
//		return null;
//	}
//
//	@Override
//	public void deleteCV(Long id) {
//		candidatRepo.deleteById(id);
//		
//	}
//
//	@Override
//	public Collection<CVDTO> getCVs() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
