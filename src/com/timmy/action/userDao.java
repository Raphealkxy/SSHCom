package com.timmy.action;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.timmy.entity.User;

public class userDao {
	private HibernateTemplate hibernateTemplate;
	
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	public void add()
	{
		System.out.println("userdao...........");
		User user=new User();
	
		user.setPassword("12334");
		user.setUsername("kxy");
		hibernateTemplate.save(user);
	}

}
