package com.maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/maven/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();

		/*
		 * Address address = session.get(Address.class, 1); System.out.println(address);
		 * 
		 * Address address1 = session.get(Address.class, 3);
		 * System.out.println(address1); Student student = session.load(Student.class,
		 * 1); System.out.println(student.getName());
		 */
		Student student=session.get(Student.class,1);
		System.out.println(student);
		
	}

}
