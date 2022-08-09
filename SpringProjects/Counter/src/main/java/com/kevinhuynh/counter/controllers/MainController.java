package com.kevinhuynh.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			int currentCount = (int) session.getAttribute("count");
			currentCount++;
			session.setAttribute("count", currentCount);
		}
		return "index.jsp";
	}
	
	@RequestMapping("/counter2")
	public String counter2(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			int currentCount = (int) session.getAttribute("count");
			currentCount += 2;
			session.setAttribute("count", currentCount);
		}
		return "index.jsp";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.setAttribute("count", 0);
		return "index.jsp";
		
	}
	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		int currentCount = (int) session.getAttribute("count");
		System.out.println(currentCount);
		return "counter.jsp";
	}
}
