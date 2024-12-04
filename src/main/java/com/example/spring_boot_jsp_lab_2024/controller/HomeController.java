package com.example.spring_boot_jsp_lab_2024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Indicate that this is a @Controller
// A more specialized Bean/Component taking care of the 
// URL dispatcher

@Controller
public class HomeController {
	
	// When user call /welcome with GET method
	// Return welcome.jsp to user
	@GetMapping("/welcome")
	public String welcomePage() {
		return "welcome";
	}

}
