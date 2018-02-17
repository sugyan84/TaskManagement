package com.taskmanagement.classes.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.taskmanagement.classes.SessionFactorySingleton;
import com.taskmanagement.classes.models.Task;
import com.taskmanagement.classes.models.User;
import com.taskmanagement.interfaces.TaskDAO;

@Repository
public class TaskDaoImpl implements TaskDAO
{
	private static final Logger	logger	= Logger.getLogger(UserDaoImpl.class);

	SessionFactory	sessionFactory;

	@Override
	public boolean createNewTask(Task newTask)
	{
		boolean retVal = false;
		
		try
		{
			this.sessionFactory = SessionFactorySingleton.getSessionFactory();
			
			Session s = sessionFactory.openSession();
			
			Transaction tx = s.beginTransaction();		
				
			s.save(newTask);
			
			tx.commit();
			
			retVal = true;
		}catch(Exception ex)
		{
			retVal = false;
			
			logger.error("Error while trying to save Task object: ");
			ex.printStackTrace();
		}
		
		
		return retVal;
	}

	@Override
	public boolean updateTask(Task updatedtTask)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteTask(Task taskToBeDeleted)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Task getTask(int taskId)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> getAllTasks()
	{
		this.sessionFactory = SessionFactorySingleton.getSessionFactory();
		
		Session s = sessionFactory.openSession();
		
		Transaction tx = s.beginTransaction();
		
		List<Task> allTasksList = s.createQuery("from Task").list();
		
		tx.commit();
		
		return allTasksList;
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
