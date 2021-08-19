package com.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("com/OneToOne/hibernate.cfg2.xml").buildSessionFactory();

		// create object of Human class
		Human human = new Human();

		human.setHumanName("Insan Ali");
		human.setHumanCity("Balipur");

		// create object of AadHar class

		Aadhar aadhar = new Aadhar();
		aadhar.setAadharNumber("6361-9471-4557");

		human.setAadhar(aadhar);
		
		aadhar.setHuman(human);

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(human);
		session.save(aadhar);
		
		transaction.commit();
		session.close();

	}
}
