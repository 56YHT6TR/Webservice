package com.swarna.webservice.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swarna.webservice.model.Role;
import com.swarna.webservice.model.UserN;
import com.swarna.webservice.repository.UserNRepository;
import com.swarna.webservice.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserNService{

	
	private UserNRepository userRepository;
	
	public UserServiceImpl(UserNRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public UserN save(UserRegistrationDto registraionDto) {
		// TODO Auto-generated method stub
		UserN user=new UserN(registraionDto.getFirstName(),registraionDto.getLastName(),
				registraionDto.getEmail(),registraionDto.getPassword(),
				Arrays.asList(new Role("ROLE_USER")));
		return userRepository.save(user);
	}

}
