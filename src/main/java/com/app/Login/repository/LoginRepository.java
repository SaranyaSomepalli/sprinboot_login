package com.app.Login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Login.model.User;

public interface LoginRepository extends  JpaRepository<User, Integer>{
	public User findByEmailId(String emailId);
	public User findByEmailIdAndPassword(String emailId, String password);
}
