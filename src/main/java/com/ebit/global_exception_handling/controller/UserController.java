package com.ebit.global_exception_handling.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebit.global_exception_handling.entity.User;
import com.ebit.global_exception_handling.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/user/{userid}")
	public User getUserById(@PathVariable int userid) {
		return userService.getUserById(userid);
	}

	@PostMapping("/user")
	public String addUser(@RequestBody User user) {
		userService.addUser(user);
		return "Successfully added";
	}

	@DeleteMapping("/user")
	public String deleteAllUser() {
		userService.deleteAllUsers();
		return "Delete All User Succesfully";
	}

	@DeleteMapping("/user/{userid}")
	public String deleteUserById(@PathVariable int userid) {
		userService.deleteUserById(userid);
		return "delete single user by given id successfully";
	}
}
