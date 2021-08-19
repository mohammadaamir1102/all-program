package com.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	private Integer id;
	private String name;
	private String address;
	public Employee(Integer id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}

public class LambdaComprator {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"aamir","mumbai"));
		list.add(new Employee(2,"aasim","Basti"));
		list.add(new Employee(3,"aaquib","millat nager"));
		list.add(new Employee(4,"arman","lucknow"));
		List<Employee> collect = list.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);
		
		
		
	}

}
