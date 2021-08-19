package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/Collectionconfig.xml");
		Employee emp = (Employee) context.getBean("Emp1");
		System.out.println(emp.getName());
		System.out.println(emp.getPhone());
		System.out.println(emp.getAddress());
		System.out.println(emp.getCourse());
		
		System.out.println("------------------------------------------------------------");
		
		/* for checking which type list and set and map which is created in xml */
		System.out.println(emp.getName().getClass().getName());
		System.out.println(emp.getPhone().getClass().getName());
		System.out.println(emp.getAddress().getClass().getName());
		System.out.println(emp.getCourse().getClass().getName());
	}

}
