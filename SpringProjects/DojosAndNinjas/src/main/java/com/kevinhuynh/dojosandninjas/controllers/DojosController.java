package com.kevinhuynh.dojosandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kevinhuynh.dojosandninjas.models.Dojo;
import com.kevinhuynh.dojosandninjas.services.DojoService;

@Controller
@RequestMapping("/dojo")
public class DojosController {
	@Autowired
	private DojoService dojoService;
	
	@GetMapping("")
	public String dojoHome(@ModelAttribute("dojo") Dojo dojo, Model model) {
		List<Dojo> dojos = dojoService.getAll();
		model.addAttribute("dojos", dojos);
		
		return "index.jsp";
	}
	
	@GetMapping("/new")
	public String newDojoForm(@ModelAttribute("dojo") Dojo dojo, Model model) {
		return "newDojo.jsp";
	}
	
	@GetMapping("/{id}")
	public String displayDojo(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojo", dojoService.getOne(id));
		return "dojoInformation.jsp";
	}
	
	@PostMapping("/new/submit")
	public String submitNewDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "newDojo.jsp";
		}
		dojoService.createDojo(dojo);
		return "redirect:/";
	}
}
