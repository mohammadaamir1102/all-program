package com.mayTomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/mayTOmany/hibernate.cfg.xml").buildSessionFactory();

		Session session = factory.openSession();
		Emp emp = (Emp) session.get(Emp.class, 101);
		System.out.println(emp.getEmpName());
		for (Project p : emp.getProjects()) {
			System.out.println(p.getpName());
		}
		session.close();
		factory.close();
	}
}
