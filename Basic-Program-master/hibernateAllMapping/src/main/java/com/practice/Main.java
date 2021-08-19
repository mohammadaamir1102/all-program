package com.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory buildSessionFactory = new Configuration().configure("com/practice/hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = buildSessionFactory.openSession();
		Student student = new Student();
		student.setId(101);
		student.setName("Aasim khan");
		student.setCity("Mumbai");
		
		Certificate certificate = new Certificate();
		certificate.setCid(99);
		certificate.setCourseName("spring");
		certificate.setDuration(78);
		
		student.setCertificate(certificate);
		
		Transaction txTransaction = session.beginTransaction();
		session.save(student);
		session.save(certificate);
		
		txTransaction.commit();
		System.out.println("inserted");
		session.close();
		buildSessionFactory.close();
	}

}
