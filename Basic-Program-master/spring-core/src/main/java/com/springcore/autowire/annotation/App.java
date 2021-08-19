package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		  ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/springcore/autowire/annotation/autoconfig.xml");
		Employee e = applicationContext.getBean("emp1", Employee.class);
		/*
		 * here if we use Employee.class then we don't need to type cast
		 */
		
		System.out.println(e);
	}
}
