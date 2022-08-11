package com.kevinhuynh.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevinhuynh.savetravels.models.Expense;
import com.kevinhuynh.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	@Autowired
	private ExpenseRepository expenseRepository;
	
	public Expense createExpense(Expense expense) {
		return expenseRepository.save(expense);
	}
	
	public List<Expense> allExpenses() {
		return expenseRepository.findAll();
	}
	
	public Expense getOne(Long id) {
		Optional<Expense> optionalExpense = expenseRepository.findById(id);
		
		if (optionalExpense.isPresent()) {
			return optionalExpense.get();
		}
		
		return null;
	}
	
	public Expense findExpense(Long id) {
		Optional<Expense> optionalExpense = expenseRepository.findById(id);
		if (optionalExpense.isPresent()) {
			return optionalExpense.get();
		}
		return null;
	}
	
	public Expense save(Expense expense) {
		return expenseRepository.save(expense);
	}
	
	public void delete(Long id) {
		expenseRepository.deleteById(id);
	}
	
	
}
