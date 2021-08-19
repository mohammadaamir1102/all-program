package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*create maven project 
adding dependencies ->spring core maven and spring context
create bean class
creating configuration file ->config.xml
setter injection
main class -which can pull the object and use 
*/
public class App {
	public static void main(String[] args) {
		System.out.println("Bismillah");

		// here ApplicationContext is an interface and here
		// ClassPathXmlApplicationContext is scan for xml file
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config.xml");

		// Student is the bean class
		// here student1 is the name of class name which is located in cofig.xml
		Student student1 = (Student) context.getBean("student1");
		Student student2 = (Student) context.getBean("student2");
		Student student3 = (Student) context.getBean("student3");
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
	}
}
