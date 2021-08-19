package com.mayTomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/mayTomany/hibernate.cfg.xml").buildSessionFactory();

		Emp emp = new Emp();
		emp.setId(101);
		emp.setEmpName("Aamir khan");

		Emp emp2 = new Emp();
		emp2.setId(102);
		emp2.setEmpName("Asadullah khan");

		Project project = new Project();
		project.setpId(201);
		project.setpName("Sale Management");

		Project project2 = new Project();
		project2.setpId(202);
		project2.setpName("E sales");

		List<Emp> employeeList = new ArrayList<>();
		employeeList.add(emp);
		employeeList.add(emp2);

		List<Project> projectList = new ArrayList<>();
		projectList.add(project);
		projectList.add(project2);

		emp.setProjects(projectList);
		emp2.setProjects(projectList);

		project.setEmps(employeeList);
		project2.setEmps(employeeList);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(emp);
		session.save(emp2);
		session.save(project);
		session.save(project2);

		/*
		 * Emp emp = (Emp) session.get(Emp.class, 101); System.out.println(emp);
		 */
		tx.commit();
		System.out.println("inserted");
		factory.close();
		session.close();
	}

}
