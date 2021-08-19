package com.mavenLectue;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/mavenLectue/hibernate.cfg2.xml")
				.buildSessionFactory();

		Student student = new Student();
	
		student.setName("Aasim Khan");
		student.setVillage("Balaipur post Baghnager district sant kabir nager");

		Address address = new Address();
	
		address.setCity("Saki Naka");
		address.setState("Maharashtra");

		student.setAddress(address);

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(student);
		session.save(address);
		transaction.commit();
		session.close();
		System.out.println("created");

	}
}
