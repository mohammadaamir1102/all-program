package com.one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("com/one/hibernate.xml").buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
	
		Employee e1=new Employee();
		e1.setEmp_name("aamir khan");
		e1.setEmp_gmail("khanaamir1102@gmail.com");
		
		Address ad=new Address();
		ad.setAddress("millat nagar");
		ad.setCity("basti");
		ad.setState("up");
		
		e1.setAddress(ad);
		ad.setEmployee(e1);
		
		session.save(e1);
		session.save(ad);
		
		tx.commit();
		session.close();  
		System.out.println("done");
	}

}
