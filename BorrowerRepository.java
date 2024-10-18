package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.Borrower;

public interface BorrowerRepository extends JpaRepository<Borrower, Long> {
	
}

