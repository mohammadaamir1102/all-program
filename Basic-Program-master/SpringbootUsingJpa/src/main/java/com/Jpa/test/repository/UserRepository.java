package com.Jpa.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.Jpa.test.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	//custom finder method
	/*
	 * public List<User>getByName(String name); public
	 * List<User>getByNameAndCity(String name,String city);
	 */
	
	//using @Query and @param annotation with jpql 
	/*
	 * @Query("select u from User u") public List<User>getAllData();
	 * 
	 * @Query("select u from u where u.name =:n") public
	 * List<User>getdatabyname(@Param("n") String name);
	 */
	
	//using @Query annotation with native query
	
	/*
	 * @Query(value="select * from User",nativeQuery = true) public
	 * List<User>getallusers();
	 */
}
