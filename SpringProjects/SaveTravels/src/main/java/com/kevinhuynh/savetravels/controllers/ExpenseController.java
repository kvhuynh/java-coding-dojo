package com.kevinhuynh.savetravels.controllers;

import java.util.List;

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

import com.kevinhuynh.savetravels.models.Expense;
import com.kevinhuynh.savetravels.services.ExpenseService;

@Controller
public class ExpenseController {
	
	@Autowired
	private ExpenseService expenseService;
	
	@GetMapping("/")
	public String index() {
		return "redirect:/expense";
	}
	
	@GetMapping("/expense")
	public String index(@ModelAttribute("expense") Expense expense, Model model) {
		List<Expense> expenses = expenseService.allExpenses();
		model.addAttribute("expenses", expenses);
		
		
		return "index.jsp";
	}
	
	@GetMapping("/expense/{id}/information")
	public String displayExpense(@PathVariable("id") Long id, Model model) {
		model.addAttribute("expense", expenseService.getOne(id));
		
		return "/information.jsp";
	}
	
	@GetMapping("/expense/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		Expense expense = expenseService.findExpense(id);
		System.out.println(expense);
		model.addAttribute("expense", expense);
		return "edit.jsp";
	}
	
	@PostMapping("/expense/submit")
	public String createExpense(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if (result.hasErrors()) {
			// render data with model
			List<Expense> expenses = expenseService.allExpenses();
			model.addAttribute("expenses", expenses);
			return "index.jsp";
		}
		expenseService.createExpense(expense);
		return "redirect:/expense";
	}
	
	@PutMapping("/expense/{id}/update")
	public String updateExpense(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, @PathVariable("id") Long id) {
		if (result.hasErrors()) {
			return "edit.jsp";
		}
		expenseService.save(expense);
		return "redirect:/expense";
		
	}
	
	@DeleteMapping("/expense/{id}/delete")
	public String deleteExpense(@PathVariable("id") Long id) {
		expenseService.delete(id);
		return "redirect:/expense";
	}
	
	
	
	
	
}
