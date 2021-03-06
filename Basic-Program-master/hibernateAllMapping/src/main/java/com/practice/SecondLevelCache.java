package com.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SecondLevelCache {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("com/practice/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();

		//first level cache
		Student student = session.get(Student.class, 2);
		System.out.println(student);
		session.close();

		Session session2 = factory.openSession();
		//second level cache
		Student student2 = session2.get(Student.class, 2);
		System.out.println(student2);

		session2.close();
		factory.close();
	}

}
