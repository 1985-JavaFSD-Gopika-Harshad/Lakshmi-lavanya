package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Borrower;
import com.revature.service.BorrowerService;

@RestController
	@RequestMapping("/api/borrowers")
	public class BorrowerContoller {
	    @Autowired
	    private BorrowerService borrowerService;

	    @PostMapping
	    public Borrower createBorrower(@RequestBody Borrower borrower) {
	        return borrowerService.createBorrower(borrower);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Borrower> getBorrowerById(@PathVariable Long id) {
	        return borrowerService.getBorrowerById(id)
	                .map(ResponseEntity::ok)
	                .orElse(ResponseEntity.notFound().build());
	    }

	    @PutMapping("/{id}")
	    public Borrower updateBorrower(@PathVariable Long id, @RequestBody Borrower borrowerDetails) {
	        return borrowerService.updateBorrower(id, borrowerDetails);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteBorrower(@PathVariable Long id) {
	        borrowerService.deleteBorrower(id);
	        return ResponseEntity.ok().build();
	    }
	}



