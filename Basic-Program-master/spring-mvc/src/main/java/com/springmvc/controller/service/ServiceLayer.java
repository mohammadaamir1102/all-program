package com.springmvc.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.controller.dao.UserDao;
import com.springmvc.controller.model.User;

@Service
public class ServiceLayer {
	/* here IOC inject the object of UserDao class implicitly so here @Autowired */
	@Autowired
	private UserDao userDao;

	public int createLayer(User user) {
		System.out.println(userDao);
		return this.userDao.saveUser(user);
	}

}
