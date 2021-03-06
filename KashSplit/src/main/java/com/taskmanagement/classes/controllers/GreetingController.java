package com.taskmanagement.classes.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taskmanagement.classes.models.Task;
import com.taskmanagement.classes.models.User;
import com.taskmanagement.interfaces.TaskService;
import com.taskmanagement.interfaces.UserService;

@Controller
@RequestMapping("/login")
public class GreetingController
{
	private static final Logger logger = Logger.getLogger(GreetingController.class);
	
	@Autowired
	private UserService userService;
	
	@Autowired
	public TaskService taskService;

	
	
	@RequestMapping("/showForm")
	public String showLoginForm(Model m)
	{
		logger.debug("Entered /showLoginForm method of GreetingController");
		
		m.addAttribute("loginForm", new User());
		return "login-form";
	}

	
	
	@RequestMapping("/processForm")
	public String processLoginForm(@ModelAttribute("loginForm") User form, Model m, HttpSession session)
	{
		String returnPage = null;
		
		logger.debug("Entered /processForm method of GreetingController");
		logger.info("Username submitted is " + form.getLoginId());
		logger.info("Password submitted is " + form.getPassword());
		logger.debug("Going to validateUser()");
		
		if(userService.validateUser(form))
		{
			logger.debug("validateUser() - success");
			
			m.addAttribute("username", form.getLoginId());
			// Create Session also
			session.setAttribute("username", form.getLoginId());
			
			List<Task> allTasksList = taskService.getAllTasks();
			
			m.addAttribute("tasksList", allTasksList);
			
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
