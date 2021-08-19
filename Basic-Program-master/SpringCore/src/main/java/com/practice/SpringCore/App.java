package com.practice.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
  ApplicationContext context=    new ClassPathXmlApplicationContext("com/practice/SpringCore/config.xml");   
    	Student student =context.getBean(Student.class,"student");
    	System.out.println(student);
    ClassLoader sClassLoader=	context.getClassLoader();
    System.out.println(sClassLoader);
    }
}
