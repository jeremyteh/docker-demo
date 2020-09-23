package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/test-docker")
	public String testDocker() {
		return "Successfully run java docker image on Aks";
	}
	
	@GetMapping("/test-docker-two")
	public String testDockerTwo() {
		return "Another Api";
	}
}
