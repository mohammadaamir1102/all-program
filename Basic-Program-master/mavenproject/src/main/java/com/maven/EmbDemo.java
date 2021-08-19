package com.maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/maven/hibernate.cfg.xml").buildSessionFactory();
		Student student = new Student();
		/* student.setId(10); */
		student.setName("fayyaz siddiqui");
		student.setCity("lucknow dehat");

		/*
		 * Certificate cer = new Certificate(); cer.setCourse("hibernate");
		 * cer.setDuration("10 days");
		 * 
		 * student.setCerti(cer);
		 */
		Session s = factory.openSession();
		
		Transaction t = s.beginTransaction();
		s.save(student);

		t.commit();
		s.close();

	}

}
