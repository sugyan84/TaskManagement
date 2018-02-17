package com.taskmanagement.classes.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Task")
public class Task
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="task_id")
	int taskId;
	
	@Column(name="task_name")
	String taskName;
	
	@Column(name="task_desc")
	String taskDescription;
	
	@Column(name="due_date")
	LocalDateTime dueDate;
	
	@Column(name="created")
	LocalDateTime createdDate;
	
	@Column(name="label")
	String label;
	
	@Column(name="isCompleted")
	boolean isCompleted;
	
	
	
	public Task(String taskName, String taskDescription, LocalDateTime dueDate, String label)
	{
		this.taskName = taskName;
		this.taskDescription = taskDescription;
		this.dueDate = dueDate;
		this.label = label;
	}

	public Task()
	{
	// TODO Auto-generated constructor stub
	}

	public int getTaskId()
	{
		return taskId;
	}

	public void setTaskId(int taskId)
	{
		this.taskId = taskId;
	}

	public String getTaskName()
	{
		return taskName;
	}

	public void setTaskName(String taskName)
	{
		this.taskName = taskName;
	}

	public String getTaskDescription()
	{
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription)
	{
		this.taskDescription = taskDescription;
	}

	public LocalDateTime getDueDate()
	{
		return dueDate;
	}

	public void setDueDate(LocalDateTime dueDate)
	{
		this.dueDate = dueDate;
	}

	public LocalDateTime getCreatedDate()
	{
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate)
	{
		this.createdDate = createdDate;
	}

	public String getLabel()
	{
		return label;
	}

	public void setLabel(String label)
	{
		this.label = label;
	}

	public boolean isCompleted()
	{
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted)
	{
		this.isCompleted = isCompleted;
	}

	@Override
	public String toString()
	{
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", label=" + label + ", isCompleted=" + isCompleted
				+ "]";
	}
	
	
}
