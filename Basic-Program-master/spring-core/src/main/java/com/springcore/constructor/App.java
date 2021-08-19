package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructor/constructor.xml");
		Byconstructor b = (Byconstructor) context.getBean("cons");
		System.out.println(b);
		Ambiguity a=(Ambiguity) context.getBean("add");
		a.dosum();
	}

}
