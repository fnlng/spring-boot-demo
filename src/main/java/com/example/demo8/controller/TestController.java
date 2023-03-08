package com.example.demo8.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo8.dao.UserRepository;
import com.example.demo8.model.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/hello")
public class TestController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping
	String home() {
		return "Hello";
	}

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<String> hello(@PathVariable Long id) {
		User user = userRepository.findById(id).orElse(null);
		if (user == null) {
			log.info("User not found for id {}", id);
			return ResponseEntity.notFound().build();
		} else {
			log.info("Found user: {}", user);
			return ResponseEntity.ok("Hello, " + user.getUserName());
		}
	}

}
