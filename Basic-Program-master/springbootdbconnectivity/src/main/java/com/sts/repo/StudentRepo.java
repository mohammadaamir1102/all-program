package com.sts.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sts.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	// this method is use for fetch data from database and the use this method
	// inside main class
	
	/*
	 * this is all method is made by user method that is called derived query
	 */
	public List<Student> findByName(String name);
	/* here find is the introducer and byName is the criteria */

	public List<Student> findByNameAndCity(String name, String city);

	public List<Student> findByIdBetween(int id, int id2);

	public List<Student> findByIdGreaterThan(int id);

	public List<Student> findByCityOrCity(String city, String city1);

	public List<Student> findByCity(String city);

	/* this is JPAQL query */
	//here we are fetching all record from the student entity which is saved into db
	@Query("FROM Student")
	public List<Student> getAllStudent();
	
	//here u is a alias and :n is a variable here a value will come 
	//into String name so now we have to transfer this value into :n
	//then we have to use @param
	@Query("select u from Student u where u.name= :n")
	public List<Student> getStudentByName(@Param("n")String name);

}
