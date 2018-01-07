package com.kashsplit.classes.services;

import org.springframework.stereotype.Service;

import com.kashsplit.classes.models.LoginForm;
import com.kashsplit.interfaces.LoginService;

@Service
public class LoginServiceImpl implements LoginService
{

	public boolean validateUser(LoginForm form)
	{
		if(form.getUserName().equalsIgnoreCase("sugyan") && form.getPassword().equals("sahu"))
		{
			return true;
		}
		else
			return false;
	}

}
