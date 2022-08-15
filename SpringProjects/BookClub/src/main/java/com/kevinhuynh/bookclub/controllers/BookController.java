package com.kevinhuynh.bookclub.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kevinhuynh.bookclub.models.Book;
import com.kevinhuynh.bookclub.services.BookService;
import com.kevinhuynh.bookclub.services.UserService;

@Controller
@RequestMapping("/books")
public class BookController {
	@Autowired
	private BookService bookService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("")
	public String dashboard(HttpSession session, Model model) {
		if (session.getAttribute("uuid") == null) {
			return "redirect:/";
		}		
		System.out.println(session.getAttribute("uuid"));
		model.addAttribute("userName", userService.getOne((Long) session.getAttribute("uuid")));
		List<Book> allBooks = bookService.getAll();
		model.addAttribute("allBooks", allBooks);
		return "dashboard.jsp";
	}
	
	@GetMapping("/new")
	public String newBook(HttpSession session, Model model, Book book) {
		if (session.getAttribute("uuid") == null) {
			return "redirect:/";
		}
		model.addAttribute("books", book);
		return "new-book.jsp";
	}
	
	@GetMapping("/{id}")
	public String viewBook(@PathVariable("id") Long id, HttpSession session, Model model, Book book) {
		if (session.getAttribute("uuid") == null) {
			return "redirect:/";
		}
		model.addAttribute("book", bookService.getOne(id));
		model.addAttribute("user", (Long) session.getAttribute("uuid"));
		return "book-info.jsp";
	}
	
	@GetMapping("/{id}/edit")
	public String editBook(@PathVariable("id") Long id, HttpSession session, Model model) {
		if (session.getAttribute("uuid") == null) {
			return "redirect:/";
		}
		Book book = bookService.getOne(id);
		model.addAttribute("books", book);
		return "update-edit-book.jsp";
	}
	
	
	@PostMapping("/new/submit")
	public String submitBook(@Valid @ModelAttribute("books") Book book, BindingResult result, HttpSession session, Model model) {
		if (session.getAttribute("uuid") == null) {
			return "dashboard.jsp";
		} 
		if (result.hasErrors()) {
			return "new-book.jsp";
		}
		book.setUser(userService.getOne((Long) session.getAttribute("uuid")));
		bookService.createBook(book);
		return "redirect:/";
	}
	
	@PutMapping("/{id}/update")
	public String updateBook(@Valid @ModelAttribute("books") Book book, BindingResult result, HttpSession session, @PathVariable("id") Long id) {
		if (result.hasErrors()) {
			return "update-edit-book.jsp";
		}
		book.setUser(userService.getOne((Long) session.getAttribute("uuid")));
		bookService.createBook(book);
		return "redirect:/";
		
	}
	
}
