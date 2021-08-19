package com.maven.mavenproject1;

public class Certificate {
	private String male;
	private String salary;
	public Certificate(String male, String salary) {
		super();
		this.male = male;
		this.salary = salary;
	}
	public Certificate() {
		super();
		
	}
	public String getMale() {
		return male;
	}
	public void setMale(String male) {
		this.male = male;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
	

}
