package com.Jpa.test;



import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.Jpa.test.entity.User;
import com.Jpa.test.repository.UserRepository;

@SpringBootApplication

public class SpringbootUsingJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootUsingJpaApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);
		
		  User user=new User();
		  
		  
		  user.setName("aamir");
		  user.setCity("SakiNaka");
		  user.setStatus("I am Spring Developer:"); 
		  //save user User
		 User user1=userRepository.save(user);
		  System.out.println(user1);
		 System.out.println("______________________________________");
			/*
			 * // update user
			 * 
			 * Optional<User> optional = userRepository.findById(2); User
			 * user2=optional.get(); user2.setName("Anas Ahmad"); User
			 * result=userRepository.save(user2); System.out.println(result);
			 * System.out.println("______________________________________"); //fetch
			 * 
			 * Iterable<User> itr=userRepository.findAll(); itr.forEach(user3->
			 * System.out.println(user3));
			 * 
			 * System.out.println("______________________________________"); // delete
			 * 
			 * userRepository.deleteById(4); System.out.println("Delete from database" );
			 * 
			 */
	}

}
