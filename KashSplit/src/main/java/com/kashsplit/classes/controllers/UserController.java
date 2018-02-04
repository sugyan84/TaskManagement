package com.kashsplit.classes.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kashsplit.classes.models.User;
import com.kashsplit.interfaces.UserService;

@Controller
@RequestMapping("/user")
public class UserController
{
	private static final Logger logger = Logger.getLogger(UserController.class);

	@Autowired
	public UserService userService;
	
	
	
	@RequestMapping("/register")
	public String showRegistrationForm(Model m)
	{
		logger.debug("Entered /user/register in method showRegistrationForm()");
		
		m.addAttribute("registrationForm", new User());
		
		return "register-user";
	}
	
	
	
	
	@RequestMapping("/addUser")
	public String createNewUser(@ModelAttribute("registrationForm") User newUser, Model m)
	{
		logger.debug("Entered /user/addUser in method createNewUser()");
		
		int createdId = userService.addUser(newUser);
		
		m.addAttribute("newUserData", "New user for |"+newUser.getFirstName()+"| created with loginId |"+newUser.getLoginId()+"| and rowId |"+createdId+"|");
		
		return "register-confirmation";
	}
}
