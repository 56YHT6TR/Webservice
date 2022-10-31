package com.swarna.webservice;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class UserService {
	private UserRepository userRepository;
	
	
	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}


	public List<User> getAllUsers()
	{
		return userRepository.findAll();
	
	}
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	public User getUserById(Integer id) {
		return  userRepository.findById(id).get();
		
	}
	public User UpdateStudent(User user)
	{
		return userRepository.save(user);
		
	}
}
