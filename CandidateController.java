package com.revature.controller;

	
	import com.revature.dto.CandidateRequest;
	import com.revature.dto.CandidateResponse;
	import com.revature.model.Candidate;
	import com.revature.service.CandidateService;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.*;

	import java.util.List;
	import java.util.stream.Collectors;

	@RestController
	@RequestMapping("/api/candidates")
	public class CandidateController {

	    @Autowired
	    private CandidateService candidateService;

	    // Create Candidate
	    @PostMapping
	    public ResponseEntity<CandidateResponse> addCandidate(@RequestBody CandidateRequest candidateRequest) {
	        Candidate candidate = new Candidate();
	        candidate.setName(candidateRequest.getName());
	        candidate.setEmail(candidateRequest.getEmail());
	        candidate.setAddress(candidateRequest.getAddress());
	        
	        Candidate savedCandidate = candidateService.addCandidate(candidate);
	        CandidateResponse candidateResponse = new CandidateResponse(savedCandidate.getId(), savedCandidate.getName(), savedCandidate.getEmail(), savedCandidate.getAddress());
	        
	        return ResponseEntity.ok(candidateResponse);
	    }

	    // Get All Candidates
	    @GetMapping("all")
	    public ResponseEntity<List<CandidateResponse>> getAllCandidates() {
	        List<CandidateResponse> candidates = candidateService.getAllCandidates().stream()
	            .map(c -> new CandidateResponse(c.getId(), c.getName(), c.getEmail(), c.getAddress()))
	            .collect(Collectors.toList());
	        return ResponseEntity.ok(candidates);
	    }

	    // Get Candidate by ID
	    @GetMapping("/{id}")
	    public ResponseEntity<CandidateResponse> getCandidateById(@PathVariable Long id) {
	        Candidate candidate = candidateService.getCandidateById(id);
	        if (candidate != null) {
	            CandidateResponse candidateResponse = new CandidateResponse(candidate.getId(), candidate.getName(), candidate.getEmail(), candidate.getAddress());
	            return ResponseEntity.ok(candidateResponse);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    // Update Candidate
	    @PutMapping("/{id}")
	    public ResponseEntity<CandidateResponse> updateCandidate(@PathVariable Long id, @RequestBody CandidateRequest candidateRequest) {
	        Candidate candidate = new Candidate();
	        candidate.setName(candidateRequest.getName());
	        candidate.setEmail(candidateRequest.getEmail());
	        candidate.setAddress(candidateRequest.getAddress());

	        Candidate updatedCandidate = candidateService.updateCandidate(id, candidate);
	        if (updatedCandidate != null) {
	            CandidateResponse candidateResponse = new CandidateResponse(updatedCandidate.getId(), updatedCandidate.getName(), updatedCandidate.getEmail(), updatedCandidate.getAddress());
	            return ResponseEntity.ok(candidateResponse);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    // Delete Candidate
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteCandidate(@PathVariable Long id) {
	        candidateService.deleteCandidate(id);
	        return ResponseEntity.noContent().build();
	    }
	}

