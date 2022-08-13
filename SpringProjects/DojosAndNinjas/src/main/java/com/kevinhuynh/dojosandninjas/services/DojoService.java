package com.kevinhuynh.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevinhuynh.dojosandninjas.models.Dojo;
import com.kevinhuynh.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {
	@Autowired 
	private DojoRepository dojoRepository;
	
	
	// ========== Create / Update ==========
	public Dojo createDojo(Dojo dojo) {
		return dojoRepository.save(dojo);
	}
	
	
	// ========== Read ==========
	
	public List<Dojo> getAll() {
		return dojoRepository.findAll();
	}
	
	public Dojo getOne(Long id) {
		return dojoRepository.findById(id).orElse(null);
	}
	
	// ========== Delete ==========

	public void delete(Long id) {
		dojoRepository.deleteById(id);
	}
	
}
