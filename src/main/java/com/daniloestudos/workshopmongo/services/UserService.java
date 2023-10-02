package com.daniloestudos.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniloestudos.workshopmongo.domain.User;
import com.daniloestudos.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired // Instancia uma classe 
	private UserRepository repo;

	public List<User> findAll(){
		return repo.findAll();
	}
}
