package com.ebit.global_exception_handling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebit.global_exception_handling.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	User findById(int userid);
}
