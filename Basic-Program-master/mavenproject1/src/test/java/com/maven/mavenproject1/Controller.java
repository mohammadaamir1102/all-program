package com.maven.mavenproject1;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Controller {
	public static void main(String[] args){
		SessionFactory factory=new Configuration().configure("com/maven/mavenproject1/hibernate.cfg.xml").buildSessionFactory();
		System.out.println("bismillah");
		SchoolRecord sc=new SchoolRecord();
		sc.setName("Aamir khan");
		sc.setAge("22");
		sc.setAddress("Millat Nagar");
		sc.setCity("Basti");
		sc.setCourse("Bsc(iT)");
		sc.setAddDate(new Date());
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(sc);
		tx.commit();
		session.close();
		System.out.println("done");
		
	}

}
