package com.kevinhuynh.books.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.kevinhuynh.books.models.Book;
import com.kevinhuynh.books.services.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books/{bookID}")
	public String index(Model model, @PathVariable("bookID") Long bookID) {
		Book book = bookService.findBook(bookID);
		model.addAttribute("book", book);
		return "books.jsp";
	}
	
	@GetMapping("/books")
	public String index(Model model) {
		List<Book> books = bookService.allBooks();
		model.addAttribute("books", books);
		return "index.jsp";
	}
}
