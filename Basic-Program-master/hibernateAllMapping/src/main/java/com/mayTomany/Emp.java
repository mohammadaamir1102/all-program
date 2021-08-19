package com.mayTomany;

import java.util.List;

import javax.persistence.*;

@Entity
public class Emp {
	
	@Id
	private int id;
	private String empName;
	
	@ManyToMany
	private List<Project> projects;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", empName=" + empName + ", projects=" + projects + "]";
	}
	

}
