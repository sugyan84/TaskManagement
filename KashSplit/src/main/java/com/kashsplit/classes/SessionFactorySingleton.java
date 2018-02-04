package com.kashsplit.classes;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import com.kashsplit.classes.models.User;

@Component
public class SessionFactorySingleton
{
	static SessionFactory sessionFac;

	static
	{
		sessionFac = new Configuration().configure("hibernate.cfg.xml")
										.addAnnotatedClass(User.class)
										.buildSessionFactory();		
		System.out.println("Session Factory is Initialized");
	}

	private SessionFactorySingleton()
	{
	}

	public static SessionFactory getSessionFactory()
	{
		return sessionFac;		
	}
}
