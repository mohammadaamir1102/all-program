package com.maven.mavenproject1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmbDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
					.configure("com/maven/mavenproject1/hibernate.cfg.xml")
				.buildSessionFactory();
		

	}

}
