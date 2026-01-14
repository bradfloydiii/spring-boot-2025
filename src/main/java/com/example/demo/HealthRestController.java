package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class HealthRestController {
	@GetMapping("/health")
	public String health() {
		return "Service is up & Running. " + Instant.now().toString();
	}
}
