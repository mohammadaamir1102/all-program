package com.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FirstLevelCache {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/practice/hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = factory.openSession();
		
		
		/* here by default enable FirstLevelCache when we get same data multiple times
		 * then Hibernate hit the database only one time and then return from the cache */
		Student student = session.get(Student.class, 1);
		System.out.println(student);
		System.out.println("working something");
		Student student2 = session.get(Student.class,1);
		System.out.println(student2);
		
		//it is checking for id 1 data is contains in student2
		System.out.println(session.contains(student2));
		
		
		factory.close();
		session.close();
		
	}
}
