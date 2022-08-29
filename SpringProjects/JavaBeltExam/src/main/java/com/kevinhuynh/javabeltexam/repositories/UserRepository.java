package com.kevinhuynh.javabeltexam.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.kevinhuynh.javabeltexam.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
	Optional<User> findByEmail(String email);
}