package com.taskmanagement.interfaces;

import java.util.List;

import com.taskmanagement.classes.models.User;

public interface UserDAO
{
	public int addUser(User newUser);
	
	public List<User> getAllUsers();
	
	public User getUserById(int userId);
	
	public User getUserByLoginId(String loginId);
}
