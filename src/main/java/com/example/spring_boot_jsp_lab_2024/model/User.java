package com.example.spring_boot_jsp_lab_2024.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

// Encapsulation
// You keep private of the properties
// Other class will access it trough getter/setter


// Class (Representation of the object)
// Tomorrow this will be connected to DB / Table
public class User {
	
	// Properties (column in a table)
	@NotEmpty(message="Name is required")
	@Size(min=3, max=20, message="Name must be between 3 and 20 characters")
	private String name;
	
	@NotEmpty(message="Email is required")
	@Email(message="Please fill in the correct format")
	private String email;
	
	@NotEmpty(message="Phone is required")
	private String phone;

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
