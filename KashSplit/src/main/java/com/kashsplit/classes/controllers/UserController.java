package com.kashsplit.classes.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kashsplit.classes.models.RegistrationForm;

@Controller
@RequestMapping("/user")
public class UserController
{
	private static final Logger logger = Logger.getLogger(UserController.class);

	@RequestMapping("/register")
	public String showRegistrationForm(Model m)
	{
		logger.debug("Entered /user/register in method showRegistrationForm()");
		
		m.addAttribute("registrationForm", new RegistrationForm());
		
		return "register-user";
	}
	
	
	@RequestMapping("/addUser")
	public String createNewUser(@ModelAttribute("registrationForm") RegistrationForm newUser, Model m)
	{
		logger.debug("Entered /user/addUser in method createNewUser()");
		
		m.addAttribute("newUserData", "New user for "+newUser.getFirstName()+" will be created soon with username "+newUser.getUsername());
		
		return "register-confirmation";
	}
}
