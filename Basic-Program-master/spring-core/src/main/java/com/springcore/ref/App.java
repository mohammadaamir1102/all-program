package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		Engine engine = (Engine) context.getBean("eng");
		System.out.println(engine.getEname());
		System.out.println(engine.getCom().getCname());
		

	}
}
