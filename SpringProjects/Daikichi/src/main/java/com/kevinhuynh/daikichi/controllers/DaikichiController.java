package com.kevinhuynh.daikichi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DaikichiController {
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("name", "kevin");
		return "test.jsp";
	}
}

//@RestController
//@RequestMapping("/daikichi")
//public class DaikichiController {
//	@RequestMapping("")
//	public String welcome() {
//		return "Welcome!";
//	}
//
//	@RequestMapping("/today")
//	public String today() {
//		return "Today you will find luck in all your endeavors!";
//	}
//	
//	@RequestMapping("/tomorrow")
//	public String tomorrow() {
//		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
//	}
//	
//	@RequestMapping("/travel/{location}")
//	public String showLocation(@PathVariable("location") String location) {
//		return "Congratulations! You will soon travel to " + location + "!";
//	}
//	
//	@RequestMapping("/lotto/{lottoNumber}")
//	public String showLotto(@PathVariable("lottoNumber") int lottoNumber) {
//		if (lottoNumber % 2 == 0) {
//			return "You will take a grand journey in the near future, but be weary of temping offers.";
//		} else{
//			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
//		}
//	}
//}