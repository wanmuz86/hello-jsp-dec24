package com.example.spring_boot_jsp_lab_2024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.spring_boot_jsp_lab_2024.model.User;
import com.example.spring_boot_jsp_lab_2024.model.UserList;

import jakarta.validation.Valid;

@Controller
public class UserController {
	
	// THis is an instance of List created just now
	// To store the user added in the "db"
	private UserList userList = new UserList();
	
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
	public String submitForm(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "userForm";
			// Return user form and pass the error message
		}
//		System.out.println("User name "+user.getName());
//		System.out.println("User email "+user.getEmail());
//		System.out.println("User phone "+user.getPhone());
//		return "formSuccess";
		
		// Add the new User to the List
		userList.addUser(user);
		
		// Pass userList to the view (addAttribute)
		model.addAttribute("userList",userList);
		
		// Redirect user to the userList page
		return "userList";
				
		}
	
	@GetMapping("/userList")
	public String showUserList(Model model) {
		model.addAttribute("userList",userList);
		return "userList";
	}
	
	
	

}
