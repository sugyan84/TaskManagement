package com.taskmanagement.classes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskmanagement.classes.models.Task;
import com.taskmanagement.classes.utility.SystemUtil;
import com.taskmanagement.interfaces.TaskDAO;
import com.taskmanagement.interfaces.TaskService;

@Service
public class TaskServiceImpl implements TaskService
{
	@Autowired
	TaskDAO taskDao;
	
	@Override
	public boolean createNewTask(Task newTask)
	{
		//id
		//fill current date
		//fill isCompleted by default - NO
		newTask.setCreatedDate(SystemUtil.getDateTimeNow());
		newTask.setCompleted(false);
		
		boolean retVal = taskDao.createNewTask(newTask);
		
		return retVal;
	}

	@Override
	public boolean updateTask(Task updatedtTask)
	{
		boolean retVal = taskDao.updateTask(updatedtTask);
		return retVal;
	}

	@Override
	public boolean deleteTask(Task taskToBeDeleted)
	{
		boolean retVal = taskDao.deleteTask(taskToBeDeleted);
		return retVal;
	}

	@Override
	public Task getTask(int taskId)
	{		
		return taskDao.getTask(taskId);
	}

	@Override
	public List<Task> getAllTasks()
	{
		
		return taskDao.getAllTasks();
	}

	@Override
	public List<Task> getAllPendingTasks()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> getAllCompletedTasks()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
