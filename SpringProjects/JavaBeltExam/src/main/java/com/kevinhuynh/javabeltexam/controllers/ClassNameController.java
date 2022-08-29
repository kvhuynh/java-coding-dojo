package com.kevinhuynh.javabeltexam.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kevinhuynh.javabeltexam.models.ClassName;
import com.kevinhuynh.javabeltexam.services.ClassNameService;
import com.kevinhuynh.javabeltexam.services.UserService;

@Controller
@RequestMapping("/classes")
public class ClassNameController {
	@Autowired
	private ClassNameService classNameService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("")
	public String dashboard(HttpSession session, Model model) {
		if (session.getAttribute("uuid") == null) {
			return "redirect:/";
		}
		model.addAttribute("userName", userService.getOne((Long) session.getAttribute("uuid")));
		List<ClassName> allClasses = classNameService.getAll();
		model.addAttribute("instructorId", (Long) session.getAttribute("uuid"));
		model.addAttribute("allClasses", allClasses);
		return "dashboard.jsp";
	}
	
	@GetMapping("/new")
	public String newClass(HttpSession session, Model model, ClassName className) {
		if (session.getAttribute("uuid") == null) {
			return "redirect:/";
		}
		
		model.addAttribute("classInfo", className);
		return "new-class.jsp";
	}
	@GetMapping("/{id}")
	public String viewClass(@PathVariable("id") Long id, HttpSession session, Model model, ClassName className) {
		if (session.getAttribute("uuid") == null) {
			return "redirect:/";
		}
		
		model.addAttribute("className", classNameService.getOne(id));
		
		return "view-class.jsp";
	}
	
	@GetMapping("/{id}/edit")
	public String editClass(@PathVariable("id") Long id, HttpSession session, Model model) {
//		if ((Long) session.getAttribute("uuid") != classNameService.getOne(id).getUser().getId()) {
//			System.out.println(classNameService.getOne(id).getUser().getId());
//			System.out.println(session.getAttribute("uuid"));
//			return "redirect:/";
//		}
		
		if (session.getAttribute("uuid") == null) {
			return "redirect:/";
		}

		ClassName className = classNameService.getOne(id);
		model.addAttribute("classInfo", className);
		
		return "edit-class.jsp";
	}
	
	@PostMapping("/new/submit")
	public String submitClass(@Valid @ModelAttribute("classInfo") ClassName className, BindingResult result, HttpSession session, Model model) {
		if (session.getAttribute("uuid") == null) {
			return "dashboard.jsp";
		}
		
		if (result.hasErrors()) {
			System.out.println("i am here 0");
			return "new-class.jsp";
		}
		
		className.setUser(userService.getOne((Long) session.getAttribute("uuid")));
		classNameService.createClass(className);
		
		return "redirect:/";
	}
	
	@PutMapping("/{id}/update")
	public String updateClass(@PathVariable("id") Long id, @Valid @ModelAttribute("classInfo") ClassName className, BindingResult result, HttpSession session, Model model) {
		if (session.getAttribute("uuid") == null) {
			return "redirect:/";
		}
		
		if (result.hasErrors()) {
			return "edit-class.jsp";
		}
		
		className.setUser(userService.getOne((Long) session.getAttribute("uuid")));
		classNameService.createClass(className);
		return "redirect:/";
	}
	
	@DeleteMapping("/{id}/delete")
	public String deleteClass(@PathVariable("id") Long id) {
		classNameService.delete(id);
		
		return "redirect:/";
	}
}
