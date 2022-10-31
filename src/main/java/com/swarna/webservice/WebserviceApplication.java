package com.swarna.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebserviceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WebserviceApplication.class, args);
	}
	@Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		User user1=new User("swarna","latha","swarna@gmail.com");
		// TODO Auto-generated method stub
		userRepository.save(user1);
		User user2=new User("swa","la","swa@gmail.com");
		userRepository.save(user2);
		User user3=new User("kir","an","kir@gmail.com");
		userRepository.save(user3);
		
	}

}
