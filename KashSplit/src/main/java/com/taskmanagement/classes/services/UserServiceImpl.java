package com.taskmanagement.classes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskmanagement.classes.models.User;
import com.taskmanagement.classes.utility.SystemUtil;
import com.taskmanagement.interfaces.UserDAO;
import com.taskmanagement.interfaces.UserService;

@Service
public class UserServiceImpl implements UserService
{

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public boolean validateUser(User form)
	{
		boolean retVal = false;
		
		//fetch User
		User fetchedUser = userDAO.getUserByLoginId(form.getLoginId());
		
		if(fetchedUser.getPassword().equals(form.getPassword()))
		{
			//Correct Password
			retVal = true;
		}
		else
		{
			//Incorrect Password
			retVal = false;
		}
		
		return retVal;
	}

	@Override
	public int addUser(User form)
	{
		//Set DateTime now and Insert
		
		form.setCreatedTime(SystemUtil.getDateTimeNow());
		form.setLastUpdatedTime(SystemUtil.getDateTimeNow());
		
		int createdId = userDAO.addUser(form);
		
		return createdId;
	}

	@Override
	public User getUser(User form)
	{
		//getUser and return
		return new User();
	}

}
