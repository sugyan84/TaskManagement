package com.kashsplit.classes.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name="getUserByLoginId", query="from User where loginId=:loginId")
@Table(name="ks_User")
public class User
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	int userId;
	
	@Column(name="login_id", length=15)
	String loginId;
	
	@Column(name="password", length=20)
	String password;
	
	@Column(name="first_name", length=20)
	String firstName;
	
	@Column(name="last_name", length=20)
	String lastName;
	
	@Column(name="email_id", length=30)
	String emailId;
	
	@Column(name="created")
	LocalDateTime createdTime;
	
	@Column(name="last_updated")
	LocalDateTime lastUpdatedTime;
	
	public User() {}

	public int getUserId()
	{
		return userId;
	}

	public void setUserId(int userId)
	{
		this.userId = userId;
	}

	public String getLoginId()
	{
		return loginId;
	}

	public void setLoginId(String loginId)
	{
		this.loginId = loginId;
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

	public String getEmailId()
	{
		return emailId;
	}

	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}

	public LocalDateTime getCreatedTime()
	{
		return createdTime;
	}

	public void setCreatedTime(LocalDateTime createdTime)
	{
		this.createdTime = createdTime;
	}

	public LocalDateTime getLastUpdatedTime()
	{
		return lastUpdatedTime;
	}

	public void setLastUpdatedTime(LocalDateTime lastUpdatedTime)
	{
		this.lastUpdatedTime = lastUpdatedTime;
	}
	
	
	
}
