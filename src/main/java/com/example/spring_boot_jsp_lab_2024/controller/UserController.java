package com.example.spring_boot_jsp_lab_2024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.spring_boot_jsp_lab_2024.model.User;

import jakarta.validation.Valid;

@Controller
public class UserController {
	
	// Method GET
	// Url in browser = /showForm
	@GetMapping("/showForm")
	public String showForm(Model model) {
		// WE will bind  new User (user)
		// to the form 
		model.addAttribute("user", new User());
		return "userForm";
	}
	
	// Method POST
	// Url for action is /submitForm
	// user is the data passed from the Form
	// It will be validated thanks to @Valid
	// The result of validation will be stored in bindingResult
	@PostMapping("submitForm")
	public String submitForm(@Valid @ModelAttribute("user") User user, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "userForm";
			// Return user form and pass the error message
		}
		System.out.println("User name "+user.getName());
		System.out.println("User email "+user.getEmail());
		System.out.println("User phone "+user.getPhone());
		return "formSuccess";
				
		}
	
	
	

}
