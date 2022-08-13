package com.kevinhuynh.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevinhuynh.dojosandninjas.models.Ninja;
import com.kevinhuynh.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepository ninjaRepository;
	
	
	// ========== Create / Update ==========
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}
	
	// ========== Read ==========
	
	public List<Ninja> getAll() {
		return ninjaRepository.findAll();
	}
	
	public Ninja getOne(Long id) {
		return ninjaRepository.findById(id).orElse(null);
	}
	
	// ========== Delete ==========

	public void delete(Long id) {
		ninjaRepository.deleteById(id);
	}
}
