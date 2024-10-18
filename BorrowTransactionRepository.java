package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.BorrowTransaction;
import com.revature.model.Borrower;

public interface BorrowTransactionRepository extends JpaRepository<BorrowTransaction, Long> {
    List<BorrowTransaction> findByBorrowerAndIsReturnedFalse(Borrower borrower);
}


