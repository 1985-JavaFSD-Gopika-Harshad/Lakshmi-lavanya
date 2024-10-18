package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
