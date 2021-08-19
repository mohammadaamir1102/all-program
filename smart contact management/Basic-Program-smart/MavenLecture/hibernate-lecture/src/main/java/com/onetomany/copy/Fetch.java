package com.onetomany.copy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {
	
	public static void main(String[] args) {
		SessionFactory factory=new Configuration()
				.configure("com/onetomany/hibernate.cfg2.xml")
				.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Question question = (Question)session.get(Question.class, 1);
		System.out.println("Question id " +question.getId());
		System.out.println("Question Name "+question.getQuestion());
		
		
		session.close();
	}

}
