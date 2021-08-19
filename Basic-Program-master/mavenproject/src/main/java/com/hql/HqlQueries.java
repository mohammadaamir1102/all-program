package com.hql;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.maven.Student;

public class HqlQueries {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/maven/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();

		// hql syntax
		String query = "from Student as s where s.city=:x and s.name=:n";
		// here as s is alies and here pass the parameterized query

		// create query method of session interface and give the query objects.
		Query q = session.createQuery(query);
		q.setParameter("x", "basti dehat");
		q.setParameter("n", "aamir siddiqui");

		// single object getting (uniqueResult)
		// q.uniqueResult();

		// multiple object getting
		List<Student> list = q.list();

		// for iterating student list
		for (Student student : list) {
			System.out.println(student.getName() + " : " + student.getCerti());
		}

		System.out.println("--------------------------------------------------");
		Transaction tx = session.beginTransaction();
		
		
		// delete query 
		/*
		 * Query q2 = session.createQuery("delete from Student s where s.city=:c");
		 * q2.setParameter("c", "lucknow dehat"); int a = q2.executeUpdate();
		 * System.out.println("deleted"); System.out.println(a);
		 */
		
		Query q3=session.createQuery("update Student set course=:d where id=:i");
		q3.setParameter("d", "Angular");
		q3.setParameter("i", 7);
		int e=q3.executeUpdate();
		System.out.println("updated");
		System.out.println(e);
		
		
		
		
		
		
		tx.commit();
		factory.close();
		session.close();
	}

}
