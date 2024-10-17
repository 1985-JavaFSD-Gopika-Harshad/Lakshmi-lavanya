package com.revature.service;

	import com.revature.model.Candidate;
	import com.revature.repository.CandidateRepository;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import java.util.List;
	import java.util.Optional;

	@Service
	public class CandidateService {

	    @Autowired
	    private CandidateRepository candidateRepository;

	    public Candidate addCandidate(Candidate candidate) {
	        return candidateRepository.save(candidate);
	    }

	    public Candidate updateCandidate(Long id, Candidate candidate) {
	        Optional<Candidate> existingCandidate = candidateRepository.findById(id);
	        if (existingCandidate.isPresent()) {
	            Candidate updatedCandidate = existingCandidate.get();
	            updatedCandidate.setName(candidate.getName());
	            updatedCandidate.setEmail(candidate.getEmail());
	            updatedCandidate.setAddress(candidate.getAddress());
	            return candidateRepository.save(updatedCandidate);
	        }
	        return null;
	    }

	    public void deleteCandidate(Long id) {
	        candidateRepository.deleteById(id);
	    }

	    public Candidate getCandidateById(Long id) {
	        return candidateRepository.findById(id).orElse(null);
	    }

	    public List<Candidate> getAllCandidates() {
	        return candidateRepository.findAll();
	    }
}

