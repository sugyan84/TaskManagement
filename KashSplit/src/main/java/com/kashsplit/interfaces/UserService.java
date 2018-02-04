package com.kashsplit.interfaces;

import com.kashsplit.classes.models.User;

public interface UserService
{
	public boolean validateUser(User form);
	
	public int addUser(User form);
	
	public User getUser(User form);

}
