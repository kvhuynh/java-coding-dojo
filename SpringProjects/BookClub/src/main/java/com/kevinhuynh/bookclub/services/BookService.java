package com.kevinhuynh.bookclub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevinhuynh.bookclub.models.Book;
import com.kevinhuynh.bookclub.repositories.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	// ========== Create / Update ==========
	public Book createBook(Book book) {
		return bookRepository.save(book);
	}
	
	// ========== Read ==========
	
	public List<Book> getAll() {
		return bookRepository.findAll();
	}
	
	public Book getOne(Long id) {
		return bookRepository.findById(id).orElse(null);
	}
	
	// ========== Delete ==========

	public void delete(Long id) {
		bookRepository.deleteById(id);
	}
}
