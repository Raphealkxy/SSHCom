package com.timmy.action;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class userService {
	
	private userDao uDao;
	
	
	public void setuDao(userDao uDao) {
		this.uDao = uDao;
	}


	public void add()
	{
		uDao.add();
		System.out.println("userService.............");
	}

}
