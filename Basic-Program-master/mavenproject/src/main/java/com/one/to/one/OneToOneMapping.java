package com.one.to.one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneMapping {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("com/maven/hibernate.cfg.xml").buildSessionFactory();
		Question q=new Question();
		q.setQuestionID(101);
		q.setQuestion("who is the creater of the world");
		
		
		Answer a=new Answer();
		a.setAnswerId(786);
		a.setAnswer("Allah is the creator of the world");
		
		
		q.setAnswer(a);
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(q);
		session.save(a);
		tx.commit();
		factory.close();
		
	}

}
