package com.example.demo8.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/")
	String home() {
		return "Hello, spring";
	}

	@GetMapping("/sayhello/{name}")
	String hello(@PathVariable String name) {
		return "Hello, " + name;	
	}
}
