package com.one.to.many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/one/to/many/hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = factory.openSession();
		Question question = new Question();
		question.setQuestionId(1);
		question.setQuestion("what is the java");

		Answer answer1 = new Answer();
		answer1.setAnswerId(10);
		answer1.setAnswer("java is the programming language");
		answer1.setQuestion(question);

		Answer answer2 = new Answer();
		answer2.setAnswerId(11);
		answer2.setAnswer("java is the high level programming language");
		answer2.setQuestion(question);

		List<Answer> allAnswers = new ArrayList<Answer>();
		allAnswers.add(answer1);
		allAnswers.add(answer2);

		question.setAnswers(allAnswers);
		
		Transaction transaction = session.beginTransaction();
		session.save(question);
		
		
		

		transaction.commit();
		System.out.println("inserted");
		session.close();
		factory.close();

	}

}
