package com.taskmanagement.interfaces;

import java.util.List;

import com.taskmanagement.classes.models.Task;
import com.taskmanagement.classes.models.User;

public interface TaskDAO
{
	public boolean createNewTask(Task newTask);

	public boolean updateTask(Task updatedtTask);

	public boolean deleteTask(Task taskToBeDeleted);

	public Task getTask(int taskId);

	public List<Task> getAllTasks();

	public List<Task> getAllPendingTasks();

	public List<Task> getAllCompletedTasks();
}
