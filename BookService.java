package com.revature.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Book;
import com.revature.repository.BookRepository;

@Service
	public class BookService {
	    @Autowired
	    private BookRepository bookRepository;

	    public Book createBook(Book book) {
	        return bookRepository.save(book);
	    }

	    public Optional<Book> getBookById(Long id) {
	        return bookRepository.findById(id);
	    }

	    public List<Book> getAllBooks() {
	        return bookRepository.findAll();
	    }

	    public Book updateBook(Long id, Book bookDetails) {
	        Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
	        book.setTitle(bookDetails.getTitle());
	        book.setAuthor(bookDetails.getAuthor());
	        return bookRepository.save(book);
	    }

	    public void deleteBook(Long id) {
	        bookRepository.deleteById(id);
	    }
	}



