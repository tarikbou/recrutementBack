package org.tarik.GestionRecrutement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tarik.GestionRecrutement.dto.entitesDTO.CandidatDTO;
import org.tarik.GestionRecrutement.services.CandidatService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CandidatController {
	
	@Autowired
	@Qualifier("candidatservice")
	CandidatService candidatService;
	
	
	
	@GetMapping("/candidats")
	public List<CandidatDTO> all(){
		return candidatService.getCandidats();
		
		
	}
	
	@PostMapping("/candidats")
	public CandidatDTO addCandidat(@RequestBody CandidatDTO candidatDTO ) {
		return candidatService.createCandidat(candidatDTO);
		
	}
	
	@PutMapping("/candidats/{id}")
	public CandidatDTO updateCandidat(@RequestBody CandidatDTO cvdto,@PathVariable Long id ) {
		
		return null;
		
	}
	@DeleteMapping("/candidats/{id}")
	public void deleteCandidat(@PathVariable Long id) {
		candidatService.deleteCandidat(id);
	}
	@GetMapping("/candidats/{id}")
	public CandidatDTO getCandidat(@PathVariable Long id) {
		return candidatService.getCandidat(id);
		
	}
	
	

}
