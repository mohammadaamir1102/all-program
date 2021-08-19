package com.springboot.full.tut.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.full.tut.entity.Employee;
import com.springboot.full.tut.service.inter.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	// build create employee REST API
	@PostMapping("/employee")
	public ResponseEntity<Employee> savEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<Employee>(employeeService.savEmployee(employee), HttpStatus.CREATED);
	}

	// get All Employee
	@GetMapping("/get-employee")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();

	}

	//get Record based id
	@GetMapping("/get-id/{id}")
	public ResponseEntity<Employee> getEmployeeByID(@PathVariable("id") Long studentId) {
		return new ResponseEntity<Employee>(employeeService.getEmployeeByID(studentId), HttpStatus.OK);
	}

	//get record based name
	@GetMapping("/get-name/{name}")
	public ResponseEntity<List<Employee>> getEmployeeByName(@PathVariable("name") String studentName) {
		return new ResponseEntity<List<Employee>>(employeeService.getEmployeeByName(studentName), HttpStatus.NOT_FOUND);

	}

	//update employee 
	@PutMapping("update-employee/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Long studentId, @RequestBody Employee employee) {
		return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, studentId), HttpStatus.OK);

	}
	//delete API by id
	@DeleteMapping("delete-employee/{id}")
	 public ResponseEntity<String> deleteEmployeeById(@PathVariable("id") long studentId){
		return new ResponseEntity<String>(" Employee deleted Successfully", HttpStatus.OK);
		
	}
	
	
	
	
	
	
	

}
