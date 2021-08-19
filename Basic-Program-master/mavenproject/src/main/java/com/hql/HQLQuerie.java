package com.hql;

import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.maven.Student;

public class HQLQuerie {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("com/maven/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		String query = "from Student as s where s.city=:x and s.name=:n";
		Query<Student> q = session.createQuery(query);
		q.setParameter("x", "lucknow");
		q.setParameter("n", "danish");
		List<Student> list = q.list();
		for (Student object : list) {
			System.out.println(object.getName()+" "+object.getId()+" "+object.getCerti());
			
		}
		System.out.println("______________________________________________");
		
		Transaction tx=session.beginTransaction();
		
		/*
		 * String query2="delete from Student s where s.city=:c"; Query
		 * q2=session.createQuery(query2); q2.setParameter("c", "lucknow"); int
		 * r=q2.executeUpdate(); System.out.println("deleted"); System.out.println(r);
		 */
		/*
		 * Query
		 * q2=session.createQuery("Update Student set student_name=:s where id =:i");
		 * q2.setParameter("s", "aasim khan"); q2.setParameter("i", "6"); int
		 * r=q2.executeUpdate(); System.out.println(r+"row updated");
		 */
		
		
		//pagination
		Query<Student> que=session.createQuery("from Student");//pagination
		que.setFirstResult(1);
		que.setMaxResults(2);
		List<Student>li=que.list();
		for (Student student : li) {
			System.out.println(student.getName());
		}
		
		
		tx.commit();
		factory.close();
		
		
		session.close();
	}

}
