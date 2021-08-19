package com.springmvc.controller.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.controller.model.User;

@Repository
public class UserDao {
	/*
	 * here is HibernateTemplate is the class so inject the object of this class is
	 * done by IOC container implicitly so that's why here we use @Autowired
	 */
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int saveUser(User user) {
		int id = (Integer) this.hibernateTemplate.save(user);
		return id;
	}

}
