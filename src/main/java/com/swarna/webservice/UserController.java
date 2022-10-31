package com.swarna.webservice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	@GetMapping("/user")
	public String listUsers(Model model) {
		model.addAttribute("Users", userService.getAllUsers());
		return "Users";
	}
	@GetMapping("user/new")
	public String createUserForm(Model model) {
		User user=new User();
		model.addAttribute("user",user);
		return "create_user";
		
	}
	@PostMapping("/user")
	public String saveUser(@ModelAttribute("user")User user) {
		userService.saveUser(user);
		return "redirect:/user";
	
	}
	@GetMapping("/user/edit/{id}")
	public String editUserForm(@PathVariable Integer id,Model model) {
		model.addAttribute("user",userService.getUserById(id));
		return "edit_user";
		
	}
	@PostMapping("/user/{id}")
	public String updateUser(@PathVariable Integer id,	
		@ModelAttribute("user")User user,Model model){
		User existinguser=userService.getUserById(id);
		existinguser.setLastName(user.getLastName());
		existinguser.setFirstName(user.getFirstName());
		existinguser.setEmail(user.getEmail());
		userService.UpdateStudent(existinguser);
		return "redirect:/user";
		
		
	}
	}

