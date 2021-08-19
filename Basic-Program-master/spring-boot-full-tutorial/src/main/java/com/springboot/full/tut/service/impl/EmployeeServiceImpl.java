package com.springboot.full.tut.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.full.tut.entity.Employee;
import com.springboot.full.tut.exception.ResouceNotFoundException;
import com.springboot.full.tut.repo.EmployeeRepository;
import com.springboot.full.tut.service.inter.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee savEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeByID(Long studentId) {
//		Optional<Employee> employee = employeeRepository.findById(studentId);
//		
//		  if(employee.isPresent()) { return employee.get(); }else { throw new
//		  ResouceNotFoundException("Employee", "studentId", studentId); }
//		 

		// by java Lambda
		return employeeRepository.findById(studentId)
				.orElseThrow(() -> new ResouceNotFoundException("Employee", "studentId", studentId));
	}

	@Override
	public List<Employee> getEmployeeByName(String studentName) {
		List<Employee> byStudentName = employeeRepository.findByStudentName(studentName);
		if (!byStudentName.isEmpty()) {
			employeeRepository.findByStudentName(studentName);
		} else {
			throw new ResouceNotFoundException("Employee", "studentName", studentName);
		}
		return byStudentName;

	}

	@Override
	public Employee updateEmployee(Employee employee, Long studentId) {

		// first check the id whether exist in DB or not
		Employee existencEmployee = employeeRepository.findById(studentId)
				.orElseThrow(() -> new ResouceNotFoundException("Employee", "studentId", studentId));

		existencEmployee.setStudentName(employee.getStudentName());
		existencEmployee.setStudentAddress(employee.getStudentAddress());
		existencEmployee.setStudentCity(employee.getStudentCity());

		employeeRepository.save(existencEmployee);

		return existencEmployee;
	}

	@Override
	public void deleteEmployeeById(Long studentId) {
		//here handle if id not found
		employeeRepository.findById(studentId)
				.orElseThrow(() -> new ResouceNotFoundException("Employee", "studentId", studentId));

		//if id found then delete
		employeeRepository.deleteById(studentId);
		
	}

}
