package com.kashsplit.classes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kashsplit.classes.models.RegistrationForm;

@Controller
@RequestMapping("user")
public class UserController
{

	@RequestMapping("/register")
	public String showRegistrationForm(Model m)
	{
		m.addAttribute("registrationForm", new RegistrationForm());
		
		return "register-user";
	}
	
	
	@RequestMapping("/addUser")
	public String createNewUser(@ModelAttribute("registrationForm") RegistrationForm newUser, Model m)
	{
		m.addAttribute("newUserData", "New user for "+newUser.getFirstName()+" will be created soon with username "+newUser.getUsername());
		
		return "register-confirmation";
	}
}
