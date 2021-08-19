package com.maven;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Bismillah");
		SessionFactory factory=new Configuration().configure("com/maven/hibernate.cfg.xml").buildSessionFactory();
		//create object of Student class
		Student st = new Student();// object entered in transient state 
		//st.setId(100);
		st.setName("danish khan");
		st.setCity("Mumbai");
		System.out.println(st);
		
		//create object of Address class.
		
		Address ad=new Address();// object entered in transient state
		ad.setStreet("turkahiya");
		ad.setCity("UttarPradesh");
		ad.setIsOpen("open");
		ad.setX(3434.34343);
		
		
		// image reading
		@SuppressWarnings("resource")
		FileInputStream fi=new FileInputStream("src/main/java/pic.png");
		byte [] data=new byte[fi.available()];
		fi.read(data);
		ad.setImage(data);
		ad.setAddedDate(new Date());
		Session session = factory.openSession();// here factory provides the current session
		Transaction tx = session.beginTransaction();// here session start the transaction.....
		session.save(st); // object entered in Persistent state
		session.save(ad);
		tx.commit();
		session.close();// object entered in Detached state
		System.out.println("done");
	}
}
