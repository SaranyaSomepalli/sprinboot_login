package com.app.Login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Login.model.User;
import com.app.Login.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository repo;
	
	public User saveUser(User user) {
		return repo.save(user);
	}
	
	public User fetchUserByEmailId(String email) {
		return repo.findByEmailId(email);
	}
	
	public User fetchUserEmailIdAndPassword(String email, String password) {
		return repo.findByEmailIdAndPassword(email,password);
	}
}
