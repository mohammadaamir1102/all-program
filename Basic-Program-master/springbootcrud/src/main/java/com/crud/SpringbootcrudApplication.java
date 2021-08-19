package com.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.crud.model.Student;
import com.crud.repo.StudentRepo;

@SpringBootApplication
public class SpringbootcrudApplication {
	
	
	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(SpringbootcrudApplication.class, args);
	StudentRepo studentRepo = context.getBean(StudentRepo.class);
	Student student = new Student();
	student.setName("aamir");
	Student save = studentRepo.save(student);
	System.out.println(save);
	
	}

}
