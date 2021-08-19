package com.one;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String emp_name,emp_gmail;
	@OneToOne
	private Address address;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_gmail() {
		return emp_gmail;
	}
	public void setEmp_gmail(String emp_gmail) {
		this.emp_gmail = emp_gmail;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee(int empId, String emp_name, String emp_gmail, Address address) {
		super();
		this.empId = empId;
		this.emp_name = emp_name;
		this.emp_gmail = emp_gmail;
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
