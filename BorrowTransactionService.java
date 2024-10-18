package com.revature.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Book;
import com.revature.model.BorrowTransaction;
import com.revature.model.Borrower;
import com.revature.repository.BookRepository;
import com.revature.repository.BorrowTransactionRepository;
import com.revature.repository.BorrowerRepository;

@Service
public class BorrowTransactionService {
    @Autowired
    private BorrowTransactionRepository borrowTransactionRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BorrowerRepository borrowerRepository;

    public BorrowTransaction borrowBook(Long borrowerId, Long bookId) {
        Book book = bookRepository.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found"));
        Borrower borrower = borrowerRepository.findById(borrowerId).orElseThrow(() -> new RuntimeException("Borrower not found"));

        if (!book.isAvailable()) {
            throw new RuntimeException("Book is not available");
        }

        BorrowTransaction transaction = new BorrowTransaction();
        transaction.setBook(book);
        transaction.setBorrower(borrower);
        transaction.setBorrowDate(LocalDate.now());
        transaction.setReturnDate(LocalDate.now().plusDays(14));  // 2-week return period
        transaction.setReturned(false);

        book.setAvailable(false);
        bookRepository.save(book);

        return borrowTransactionRepository.save(transaction);
    }

    public BorrowTransaction returnBook(Long transactionId) {
        BorrowTransaction transaction = borrowTransactionRepository.findById(transactionId)
                .orElseThrow(() -> new RuntimeException("Transaction not found"));

        if (transaction.isReturned()) {
            throw new RuntimeException("Book already returned");
        }

        transaction.setReturned(true);
        transaction.getBook().setAvailable(true);

        borrowTransactionRepository.save(transaction);
        bookRepository.save(transaction.getBook());

        return transaction;
    }

    public BorrowTransaction renewBook(Long transactionId) {
        BorrowTransaction transaction = borrowTransactionRepository.findById(transactionId)
                .orElseThrow(() -> new RuntimeException("Transaction not found"));

        if (transaction.isReturned()) {
            throw new RuntimeException("Cannot renew a returned book");
        }

        transaction.setReturnDate(transaction.getReturnDate().plusDays(14)); // 2-week extension
        return borrowTransactionRepository.save(transaction);
    }

    public double calculateFine(Long transactionId) {
        BorrowTransaction transaction = borrowTransactionRepository.findById(transactionId)
                .orElseThrow(() -> new RuntimeException("Transaction not found"));

        if (transaction.getReturnDate().isBefore(LocalDate.now())) {
            long daysOverdue = ChronoUnit.DAYS.between(transaction.getReturnDate(), LocalDate.now());
            return daysOverdue * 2.0; // $2 fine per day
        }

        return 0.0;
    }
}



