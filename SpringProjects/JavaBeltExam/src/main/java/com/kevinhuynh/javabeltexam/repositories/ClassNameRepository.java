package com.kevinhuynh.javabeltexam.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kevinhuynh.javabeltexam.models.ClassName;

public interface ClassNameRepository extends CrudRepository<ClassName, Long>{
	List<ClassName> findAll();
}
