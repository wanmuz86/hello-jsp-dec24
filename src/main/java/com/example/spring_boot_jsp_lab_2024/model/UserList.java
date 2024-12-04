package com.example.spring_boot_jsp_lab_2024.model;

import java.util.ArrayList;
import java.util.List;

public class UserList {
	private List<User> users = new ArrayList<>();

	// Getters and Setters
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	// Method to create and remove user
	
	public void addUser(User user) {
		users.add(user);
	}
	
	public void removeUser(User user) {
		// remove the passed object
		// suitable if we are sure the object is unique
		// alternative to remove by index
		users.remove(user);
	}
	

}
