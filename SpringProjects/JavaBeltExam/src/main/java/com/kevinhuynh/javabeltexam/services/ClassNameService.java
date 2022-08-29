package com.kevinhuynh.javabeltexam.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevinhuynh.javabeltexam.models.ClassName;
import com.kevinhuynh.javabeltexam.repositories.ClassNameRepository;

@Service
public class ClassNameService {
	@Autowired
	private ClassNameRepository classNameRepository;
	
	// ========== Create / Update ==========
	public ClassName createClass(ClassName className) {
		return classNameRepository.save(className);
	}
	
	// ========== Read ==========
	public List<ClassName> getAll() {
		return classNameRepository.findAll();
	}
	
	public ClassName getOne(Long id) {
		return classNameRepository.findById(id).orElse(null);
	}
	
	// ========== Delete ==========

	public void delete(Long id) {
		classNameRepository.deleteById(id);
	}
	
}
