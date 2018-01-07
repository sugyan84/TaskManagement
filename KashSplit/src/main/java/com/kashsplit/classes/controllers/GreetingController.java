package com.kashsplit.classes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kashsplit.classes.models.LoginForm;
import com.kashsplit.interfaces.LoginService;

@Controller
@RequestMapping("/login")
public class GreetingController 
{
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/showForm")
	public String showLoginForm(Model m) 
	{
		m.addAttribute("loginForm", new LoginForm());
		return "login-form";
	}

	@RequestMapping("/processForm")
	public String processLoginForm(@ModelAttribute("loginForm") LoginForm form, Model m) 
	{
		System.out.println("Username submitted is " + form.getUserName());
		System.out.println("Password submitted is " + form.getPassword());

		if(loginService.validateUser(form))
		{
			m.addAttribute("username", form.getUserName());
			//Create Session also
			return "user-homePage";
		}
		else
		{
			return "login-failure";
		}
		
		
	}
}
