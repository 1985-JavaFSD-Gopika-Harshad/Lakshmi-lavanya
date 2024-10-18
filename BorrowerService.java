package com.revature.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Borrower;
import com.revature.repository.BorrowerRepository;

@Service
	public class BorrowerService {
	    @Autowired
	    private BorrowerRepository borrowerRepository;

	    public Borrower createBorrower(Borrower borrower) {
	        return borrowerRepository.save(borrower);
	    }

	    public Optional<Borrower> getBorrowerById(Long id) {
	        return borrowerRepository.findById(id);
	    }

	    public List<Borrower> getAllBorrowers() {
	        return borrowerRepository.findAll();
	    }

	    public Borrower updateBorrower(Long id, Borrower borrowerDetails) {
	        Borrower borrower = borrowerRepository.findById(id).orElseThrow(() -> new RuntimeException("Borrower not found"));
	        borrower.setName(borrowerDetails.getName());
	        borrower.setEmail(borrowerDetails.getEmail());
	        return borrowerRepository.save(borrower);
	    }

	    public void deleteBorrower(Long id) {
	        borrowerRepository.deleteById(id);
	    }
	}


