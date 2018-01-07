package com.kashsplit.classes.controllers;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
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
	private static final Logger logger = Logger.getLogger(GreetingController.class);
	
	@Autowired
	private LoginService loginService;

	@RequestMapping("/showForm")
	public String showLoginForm(Model m)
	{
		logger.debug("Entered /showLoginForm method of GreetingController");
		
		m.addAttribute("loginForm", new LoginForm());
		return "login-form";
	}

	@RequestMapping("/processForm")
	public String processLoginForm(@ModelAttribute("loginForm") LoginForm form, Model m, HttpSession session)
	{
		logger.debug("Entered /processForm method of GreetingController");
		
		System.out.println("Username submitted is " + form.getUserName());
		System.out.println("Password submitted is " + form.getPassword());

		logger.info("Username submitted is " + form.getUserName());
		logger.info("Password submitted is " + form.getPassword());
		
		String returnPage = null;

		logger.debug("Going to validateUser()");
		
		if(loginService.validateUser(form))
		{
			logger.debug("validateUser() - success");
			
			m.addAttribute("username", form.getUserName());
			// Create Session also
			session.setAttribute("username", form.getUserName());
			returnPage = "user-homePage";
		}
		else
		{
			logger.debug("validateUser() - failure");
			
			returnPage = "login-failure";
		}

		return returnPage;

	}
	
	
	
	@RequestMapping("/nextPage")
	public String nextPage(Model m, HttpSession session)
	{
		String username = (String)session.getAttribute("username");
		m.addAttribute("username", username);
		return "nextPage";
	}
}
