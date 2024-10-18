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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.BorrowTransaction;
import com.revature.service.BorrowTransactionService;


@RestController
@RequestMapping("/api/transactions")
public class BorrowTransactionController {
    @Autowired
    private BorrowTransactionService transactionService;

    @PostMapping
    public BorrowTransaction borrowBook(@RequestParam Long borrowerId, @RequestParam Long bookId) {
        return transactionService.borrowBook(borrowerId, bookId);
    }

    @PutMapping("/return/{id}")
    public BorrowTransaction returnBook(@PathVariable Long id) {
        return transactionService.returnBook(id);
    }

    @PutMapping("/renew/{id}")
    public BorrowTransaction renewBook(@PathVariable Long id) {
        return transactionService.renewBook(id);
    }

    @GetMapping("/fine/{id}")
    public double calculateFine(@PathVariable Long id) {
        return transactionService.calculateFine(id);
    }
}


