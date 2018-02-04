package com.kashsplit.classes.services;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.kashsplit.classes.models.LoginForm;
import com.kashsplit.classes.models.User;
import com.kashsplit.interfaces.LoginService;

@Service
public class LoginServiceImpl implements LoginService
{
	private static final Logger logger = Logger.getLogger(LoginServiceImpl.class);

	public boolean validateUser(User form)
	{
		logger.debug("Entered validateUser()");
		logger.info("Username: |" + form.getLoginId() + "|");
		logger.info("Password: |" + form.getPassword() + "|");

		if(form.getLoginId().equalsIgnoreCase("sugyan") && form.getPassword().equals("sahu"))
		{
			return true;
		}
		else
			return false;
	}

}
