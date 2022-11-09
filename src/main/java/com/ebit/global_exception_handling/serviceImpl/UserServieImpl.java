package com.ebit.global_exception_handling.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebit.global_exception_handling.entity.User;
import com.ebit.global_exception_handling.repository.UserRepo;
import com.ebit.global_exception_handling.service.UserService;

@Service
public class UserServieImpl implements UserService {

	@Autowired
	private UserRepo userRepo;

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public User getUserById(int userid) {
		return userRepo.findById(userid);
	}

	@Override
	public void addUser(User user) {
		userRepo.save(user);
	}

	@Override
	public void deleteAllUsers() {
		userRepo.deleteAll();
	}

	@Override
	public void deleteUserById(int userid) {
		userRepo.deleteById(userid);
	}
}
