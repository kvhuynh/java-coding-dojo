package com.kevinhuynh.bookclub.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kevinhuynh.bookclub.models.User;
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
		if (session.getAttribute("uuid") != null) {
			System.out.println(session.getAttribute("uuid"));
			model.addAttribute("userName", userService.getOne((Long) session.getAttribute("uuid")));
			return "dashboard.jsp";
		}		
		return "redirect:/";
	}
	
}
