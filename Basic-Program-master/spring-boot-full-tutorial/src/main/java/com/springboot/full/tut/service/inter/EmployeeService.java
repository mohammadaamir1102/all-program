package com.springboot.full.tut.service.inter;

import java.util.List;

import com.springboot.full.tut.entity.Employee;

public interface EmployeeService {
	
	Employee savEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeByID(Long studentId);
	List<Employee> getEmployeeByName(String studentName);
	Employee updateEmployee(Employee employee, Long studentId);
	void  deleteEmployeeById(Long studentId);
}
