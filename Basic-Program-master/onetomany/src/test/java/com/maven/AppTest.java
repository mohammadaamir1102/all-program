package com.maven;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppTest {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/maven/hibernate.cfg.xml").buildSessionFactory();
		Question q = new Question();
		q.setQuestionId(101);
		q.setQuestion("who is allah");
		
		Answer ans = new Answer();
		ans.setAnswerId(102);
		ans.setAnswer("which is created you");
		
		Answer ans1 = new Answer();
		ans1.setAnswerId(103);
		ans1.setAnswer("which is created the world");
		
		Answer ans2 = new Answer();
		ans2.setAnswerId(104);
		ans2.setAnswer("which is created everything");
		
		List<Answer> list = new ArrayList<>();
		list.add(ans);
		list.add(ans1);
		list.add(ans2);
		q.setAnswer(list);
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(q);
		
		tx.commit();
		factory.close();

	}
}