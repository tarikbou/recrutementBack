package org.tarik.GestionRecrutement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
public class CandidatController {
	
	@Autowired
	@Qualifier("candidatservice")
	CandidatService candidatService;
	
	
	
	@GetMapping("/Candidats")
	public List<CandidatDTO> all(){
		return null;
		
	}
	@PostMapping("/Candidats")
	public CandidatDTO addCandidat(@RequestBody CandidatDTO candidatDTO ) {
		return candidatService.createCandidat(candidatDTO);
		
	}
	@PutMapping("/Candidats/{id}")
	public CandidatDTO updateCandidat(@RequestBody CandidatDTO cvdto,@PathVariable Long id ) {
		
		return null;
		
	}
	@DeleteMapping("/Candidats/{id}")
	public void deleteCandidat(@PathVariable Long id) {
		
	}
	

}
