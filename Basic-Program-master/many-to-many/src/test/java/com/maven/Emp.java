package com.maven;

import java.util.List;

import javax.persistence.*;

import org.hibernate.engine.jdbc.env.spi.IdentifierCaseStrategy;

@Entity
public class Emp {
	@Id
	private int id;
	private String emp_name;
	@JoinTable(name ="emp_learn", joinColumns = {
			@JoinColumn(name = "Employee_Id") }, inverseJoinColumns = { @JoinColumn(name = "Project_Id") })
	private List<Project> project;

	public Emp(int id, String emp_name, List<Project> project) {
		super();
		this.id = id;
		this.emp_name = emp_name;
		this.project = project;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", emp_name=" + emp_name + ", project=" + project + "]";
	}

}
