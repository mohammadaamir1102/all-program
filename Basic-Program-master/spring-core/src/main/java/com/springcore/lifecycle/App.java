package com.springcore.lifecycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		
		// AbstractApplicationContext is an interface and contains many method but here
		// registerShutdownHook() method is of the AbstractApplicationContext
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/lifecycleconfig.xml");
		
		Technology t =context.getBean("tech",Technology.class);
		System.out.println(t);
		context.registerShutdownHook();
		
		System.out.println("---------------------------------------------------");
		Information in = (Information) context.getBean("inform");
		System.out.println(in);
		
		System.out.println("---------------------------------------------------");
		AnnotationBase a=(AnnotationBase) context.getBean("anno");
		System.out.println(a);
	}

}
