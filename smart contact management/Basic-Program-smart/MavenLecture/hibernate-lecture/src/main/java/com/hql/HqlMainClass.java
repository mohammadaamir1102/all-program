package com.hql;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

public class HqlMainClass {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/hql/hibernate.cfg2.xml").buildSessionFactory();

		Session session = factory.openSession();

		// String hqlQuery = "from Student";

		/*
		 * Query<Student> query = session.createQuery(hqlQuery);
		 * 
		 * // query.uniqueResult();//single result query
		 * 
		 * // Multiple (List)
		 * 
		 * System.out.println(); System.out.println(); System.out.println(
		 * "_______________________________________________________________");
		 * List<Student> list = query.list();
		 * 
		 * 
		 * for (Student s : list) { System.out.println(s.getId()+" "+s.getName()+" "
		 * +s.getAddress()+" "+s.getSalary()); }
		 * 
		 * /* list.forEach(System.out::println); for (Student student : list) {
		 * System.out.println(student); }
		 */

		// update
		Transaction transaction = session.beginTransaction();

		/*
		 * String qString="update Student set name=:n where id=:i"; Query query =
		 * session.createQuery(qString); query.setParameter("n", "Sakib");
		 * query.setParameter("i", 4);
		 * 
		 * int executeUpdate = query.executeUpdate();
		 * System.out.println(executeUpdate+" updated succesfully !!");
		 * System.out.println();
		 */
		
		/*
		 * String qString = "update Student set name='Arshad' where id=4"; Query query =
		 * session.createQuery(qString); int executeUpdate = query.executeUpdate();
		 * System.out.println(executeUpdate + " updated succesfully !!");
		 * System.out.println();
		 */
		
		String qString="from Student";
		Query createQuery = session.createQuery(qString);
		createQuery.setFirstResult(0);
		createQuery.setMaxResults(5);
		List<Student> list = createQuery.list();
		for (Student student : list) {
			System.out.println(student);
		}	

		transaction.commit();
		session.close();
		factory.close();
	}

}
