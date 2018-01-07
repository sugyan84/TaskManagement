package com.kashsplit.classes.models;

public class RegistrationForm
{
	private String	userName;
	private String	password;
	private String	firstName;
	private String	lastName;

	public RegistrationForm()
	{

	}

	public String getUsername()
	{
		return userName;
	}

	public void setUsername(String username)
	{
		this.userName = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

}
