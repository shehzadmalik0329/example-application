package com.company.department.team.exampleapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World using Spring Boot!!!";
	}

}
