package com.taskmanagement.classes.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taskmanagement.classes.models.Task;
import com.taskmanagement.interfaces.TaskService;

@Controller
@RequestMapping("/task")
public class TaskController
{
	private static final Logger logger = Logger.getLogger(TaskController.class);

	@Autowired
	public TaskService taskService;
	
	
	@RequestMapping("/show/new")
	public String showCreateTaskForm(Model m)
	{
		Task newTaskToBeFilled = new Task();
		m.addAttribute("taskForm", newTaskToBeFilled);
		
		return "addTask";
	}
	
	//new Task
	@RequestMapping("/new")
	public String createTask(Model m, @ModelAttribute("taskForm") Task newTaskToBeCreated)
	{
		boolean retVal = taskService.createNewTask(newTaskToBeCreated);
		
		m.addAttribute("newUserData", retVal);
		
		return "__register-confirmation";
	}
	
	//update Task
	@RequestMapping("/update")
	public String updateTask(Model m)
	{		
		return "register-user";
	}
	
	//delete Task
	@RequestMapping("/delete")
	public String deleteTask(Model m)
	{		
		return "register-user";
	}
	
	//view all Tasks
	@RequestMapping("/view")
	public String viewTasks(Model m)
	{		
		return "register-user";
	}
}
