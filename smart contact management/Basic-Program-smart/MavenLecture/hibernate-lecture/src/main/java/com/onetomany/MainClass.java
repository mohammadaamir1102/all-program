package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	
	public static void main(String[] args) {
		SessionFactory factory=new Configuration()
				.configure("com/onetomany/hibernate.cfg2.xml")
				.buildSessionFactory();
		
		Question question = new Question();
		question.setQuestion("who is creator of the world");
		
		Answer answer1 = new Answer();
		answer1.setAnswer("Allah Tala");
		answer1.setQuestion(question);
		
		
		Answer answer2 = new Answer();
		answer2.setAnswer("khuda tala");
		answer2.setQuestion(question);
		
		
		Answer answer3 = new Answer();
		answer3.setAnswer("Rabbul Aalameen");
		answer3.setQuestion(question);
		
		List<Answer> allAnswers=new ArrayList<Answer>();
		allAnswers.add(answer1);
		allAnswers.add(answer2);
		allAnswers.add(answer3);
		
		
		question.setAnswers(allAnswers);
		
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(question);
		
		
		transaction.commit();
		session.close();
		System.out.println("created");
	}

}
