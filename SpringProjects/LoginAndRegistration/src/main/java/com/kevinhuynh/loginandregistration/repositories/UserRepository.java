package com.kevinhuynh.loginandregistration.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.kevinhuynh.loginandregistration.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
	Optional<User> findByEmail(String email);
}
