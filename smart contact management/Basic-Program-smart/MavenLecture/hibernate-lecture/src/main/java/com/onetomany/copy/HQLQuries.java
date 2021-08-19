package com.onetomany.copy;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLQuries {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/onetomany/hibernate.cfg2.xml")
				.buildSessionFactory();

		Session session = factory.openSession();
		String query = "from Question";

		Query<Question> createQuery = session.createQuery(query);
		List<Question> list = createQuery.list();
		for (Question question : list) {
			System.out.println(question);
		}

		session.close();
		factory.close();

	}

}
