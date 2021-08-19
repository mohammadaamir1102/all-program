package com.smart.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smart.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByUserEmail(String userEmail);

}
