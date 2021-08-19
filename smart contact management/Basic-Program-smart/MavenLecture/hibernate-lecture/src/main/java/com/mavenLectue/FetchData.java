package com.mavenLectue;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/mavenLectue/hibernate.cfg2.xml")
				.buildSessionFactory();
		Session session = factory.openSession();
		
		Student student = session.load(Student.class, 1);
		System.out.println(student);
		session.close();
	}

}
