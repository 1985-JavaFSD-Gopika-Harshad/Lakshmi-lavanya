package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
