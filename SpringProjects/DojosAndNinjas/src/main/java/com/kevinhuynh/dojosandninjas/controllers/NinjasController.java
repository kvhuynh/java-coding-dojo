package com.kevinhuynh.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kevinhuynh.dojosandninjas.models.Ninja;
import com.kevinhuynh.dojosandninjas.services.DojoService;
import com.kevinhuynh.dojosandninjas.services.NinjaService;

@Controller
@RequestMapping("/ninja")
public class NinjasController {
	@Autowired
	private NinjaService ninjaService;
	
	@Autowired
	private DojoService dojoService;
	
	@GetMapping("/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", dojoService.getAll());
		return "newNinja.jsp";
	}
	
	@PostMapping("/new/submit")
	public String submitNewNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if (result.hasErrors()) {
			System.out.println(result);
			return "newNinja.jsp";
		}
		
		ninjaService.createNinja(ninja);
		return "redirect:/";
	}
}
