package com.maven.mavenproject1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("com/maven/mavenproject1/hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		SchoolRecord record=session.get(SchoolRecord.class, 1);
		System.out.println(record);

	}

}
