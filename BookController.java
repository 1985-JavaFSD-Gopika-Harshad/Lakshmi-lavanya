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

import com.revature.model.Book;
import com.revature.service.BookService;

@RestController
	@RequestMapping("/api/books")
	public class BookController {
	    @Autowired
	    private BookService bookService;

	    @PostMapping
	    public Book createBook(@RequestBody Book book) {
	        return bookService.createBook(book);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
	        return bookService.getBookById(id)
	                .map(ResponseEntity::ok)
	                .orElse(ResponseEntity.notFound().build());
	    }

	    @PutMapping("/{id}")
	    public Book updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
	        return bookService.updateBook(id, bookDetails);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
	        bookService.deleteBook(id);
	        return ResponseEntity.ok().build();
	    }
	}



