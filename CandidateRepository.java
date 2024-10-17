package com.revature.repository;

import com.revature.model.Candidate;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

	@Repository
	public interface CandidateRepository extends JpaRepository<Candidate, Long> {

		Candidate save(Candidate candidate);

		Optional<Candidate> findById(Long id);

		void deleteById(Long id);

		List<Candidate> findAll();
	}
