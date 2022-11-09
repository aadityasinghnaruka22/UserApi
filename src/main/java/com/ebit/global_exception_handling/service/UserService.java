package com.ebit.global_exception_handling.service;

import java.util.List;

import com.ebit.global_exception_handling.entity.User;

public interface UserService {

	List<User> getAllUsers();

	User getUserById(int userid);

	void addUser(User user);

	void deleteAllUsers();

	void deleteUserById(int userid);

}
