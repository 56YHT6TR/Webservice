package com.swarna.webservice;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class SimpleController {
	@Autowired
	private TextDaoService service;
	@Autowired
	private UserRepository userRepository;
	//To reverse the string
	@GetMapping("/reverse/{str}")
	public String reverse(@PathVariable String str) {
		return(new StringBuffer(str).reverse().toString());
		
	}
	//To save the Message
	//@PostMapping("/save/")
	/*public ResponseEntity<Object> saveText(@RequestBody Text str)
	{
		Text saved=userRepository.save(str);
		URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{inputStr}")
		.buildAndExpand(saved.getInputStr()).toUri();
		return ResponseEntity.created(location).build();
	}
	@GetMapping("/read")
	public List<Text> read()
	{
		return userRepository.findAll();
	}*/
	

}
