package com.kashsplit.classes.dao;

import java.util.List;

import org.hibernate.Query;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.kashsplit.classes.SessionFactorySingleton;
import com.kashsplit.classes.models.User;
import com.kashsplit.interfaces.UserDAO;

@Repository
public class UserDaoImpl implements UserDAO
{

	private static final Logger logger = Logger.getLogger(UserDaoImpl.class);
	
	SessionFactory sessionFactory;

	@Override
	public List<User> getAllUsers()
	{
		this.sessionFactory = SessionFactorySingleton.getSessionFactory();
		
		Session s = sessionFactory.openSession();
		
		Transaction tx = s.beginTransaction();
		
		List<User> allUsersList = s.createQuery("from User").list();
		
		tx.commit();
		
		logger.debug("getAllUsers() fetched |"+allUsersList.size()+"|");
		
		return allUsersList;
	}

	@Override
	public User getUserById(int userId)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByLoginId(String loginId)
	{
		User retVal = null;
		
		this.sessionFactory = SessionFactorySingleton.getSessionFactory();
		
		Session s = sessionFactory.openSession();
		
		Transaction tx = s.beginTransaction();		
			
		Query query = s.getNamedQuery("getUserByLoginId");
		
		query.setString("loginId", loginId);
		
		List<User> fetchedUser = query.list();
		
		tx.commit();
		
		logger.debug("fetched User by loginId is |"+fetchedUser.get(0).getLoginId()+"|");
		
		if(fetchedUser==null)
		{
			retVal = null;
		}
		else
		{
			retVal = fetchedUser.get(0);
		}
		
		return retVal;
	}

	@Override
	public int addUser(User newUser)
	{
		this.sessionFactory = SessionFactorySingleton.getSessionFactory();
		
		Session s = sessionFactory.openSession();
		
		Transaction tx = s.beginTransaction();		
			
		s.save(newUser);
		
		tx.commit();
		
		logger.debug("created UserId is |"+newUser.getUserId()+"|");
		
		return newUser.getUserId();
	}

	
	
}
