package com.maven;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Maping{
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("com/maven/hibernate.cfg.xml").buildSessionFactory();
		Emp e1=new Emp();
		Emp e2=new Emp();
		
		e1.setId(102);
		e1.setEmp_name("aamir khan");
		
		e2.setId(103);
		e2.setEmp_name("aasim khan");
		
		Project p1=new Project();
		Project p2=new Project();
		
		p1.setId(102);
		p1.setProject_name("Billing project");
		
		p2.setId(103);
		p2.setProject_name("online shopping");
		
		List<Emp>emp=new ArrayList<Emp>();
		emp.add(e1);
		emp.add(e2);
		
		List<Project>pro=new ArrayList<Project>();
		pro.add(p1);
		pro.add(p2);
		
		e1.setProject(pro);
		p2.setEmp(emp);
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		
		tx.commit();
		session.close();
		
		
		
	}
	
}