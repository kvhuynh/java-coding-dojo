package com.kevinhuynh.javabeltexam.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kevinhuynh.javabeltexam.models.LoginUser;
import com.kevinhuynh.javabeltexam.models.User;
import com.kevinhuynh.javabeltexam.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String index(Model model, HttpSession session) {
		if (session.getAttribute("uuid") != null) {
			return "redirect:/classes";
		}
		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());
		
		return "index.jsp";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("uuid");
		return "redirect:/";
	}
	
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model, HttpSession session) {
		User user = userService.register(newUser, result);
		if (result.hasErrors()) {
			model.addAttribute("newLogin", new LoginUser());
			return "index.jsp";
		}
		
		session.setAttribute("uuid", user.getId());
		
		return "redirect:/classes";
	}
	
	
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, Model model, HttpSession session) {
		User user = userService.login(newLogin, result);
		if (result.hasErrors()) {
			model.addAttribute("newUser", new User());
			return "index.jsp";
		}
		
		session.setAttribute("uuid", user.getId());
		
		return "redirect:/classes";
	}
}