package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("com/manytomany/hibernate.cfg2.xml")
				.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		
		Emp emp = new Emp();
		emp.setEmpId(1);
		emp.setEmpName("Aamir khan");
		
		Emp emp2 = new Emp();
		emp2.setEmpId(2);
		emp2.setEmpName("Ehtesham");
		
		Project project = new Project();
		project.setpId(3);
		project.setProjectName("E Sales Management");
		
		Project project2 = new Project();
		project2.setpId(4);
		project2.setProjectName("Exam Portal");
		
		List<Emp> employeeList=new ArrayList<>();
		employeeList.add(emp);
		employeeList.add(emp2);
		
		List<Project> projectList=new ArrayList<>();
		projectList.add(project);
		projectList.add(project2);
		
		emp.setProjects(projectList);
		emp2.setProjects(projectList);
		
		project.setEmp(employeeList);
		project.setEmp(employeeList);
		
		session.save(emp);
		session.save(emp2);
		session.save(project);
		session.save(project2);
		
		transaction.commit();
		session.close();
		
	
	}

}
