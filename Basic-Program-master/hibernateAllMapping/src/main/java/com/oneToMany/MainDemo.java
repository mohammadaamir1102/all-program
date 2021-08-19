package com.oneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainDemo {

	public static void main(String[] args) {
		Configuration factory = new Configuration().configure("com/oneToMany/hibernate.cfg.xml");
		SessionFactory buildSessionFactory = factory.buildSessionFactory();
		
		Student student = new Student();
		student.setRollno(134);
		student.setName("ubaid");
		student.setAddressString("basti");
		
		Certificate certificate = new Certificate();
		certificate.setCertificateId(13);
		certificate.setDuration(3);
		certificate.setCertificate("java");
		
		
		Certificate certificate1 = new Certificate();
		certificate1.setCertificateId(4);
		certificate1.setDuration(4);
		certificate1.setCertificate("python");
		
		
		List<Certificate> list = new ArrayList<Certificate>();
		list.add(certificate1);
		list.add(certificate);
		
		student.setCertificate(list);
		

		Session eSession = buildSessionFactory.openSession();
		
		eSession.save(student);
		Transaction txTransaction = eSession.beginTransaction();
		txTransaction.commit();
		eSession.close();
		buildSessionFactory.close();

	}

}
