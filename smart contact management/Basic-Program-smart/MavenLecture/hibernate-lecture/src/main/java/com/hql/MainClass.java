package com.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration()
				.configure("com/hql/hibernate.cfg2.xml").buildSessionFactory();
		
		
		Session session = factory.openSession();
		
		
		Student student = new Student();
		student.setName("Hazrat Buzurg Etc.......");
		student.setAddress("Balaipur");
		student.setSalary(88686);
		
		Transaction transaction = session.beginTransaction();
		
		session.save(student);
		transaction.commit();
		session.close();
		factory.close();
		
	}

}
