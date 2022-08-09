package com.kevinhuynh.omikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/omikuji/submit", method=RequestMethod.POST)
	public String submitOmikuji(
		@RequestParam(value="number") Integer number,
		@RequestParam(value="cityName") String cityName,
		@RequestParam(value="name") String name,
		@RequestParam(value="hobby") String hobby,
		@RequestParam(value="livingThing") String livingThing,
		@RequestParam(value="compliment") String compliment,
		HttpSession session) {
		session.setAttribute("number", number);
		session.setAttribute("cityName", cityName);
		session.setAttribute("name", name);
		session.setAttribute("hobby", hobby);
		session.setAttribute("livingThing", livingThing);
		session.setAttribute("compliment", compliment);

		
		return "redirect:/show";
	}
	
	@RequestMapping("/show")
	public String show() {
		return "show.jsp";
	}
}
