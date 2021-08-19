package com.maven;

import java.util.List;

import javax.persistence.*;
@Entity
public class Project {
	@Id
	private int id;
	private String project_name;
	@ManyToMany(mappedBy = "project")
	private List<Emp> emp;
	public Project(int id, String project_name, List<Emp> emp) {
		super();
		this.id = id;
		this.project_name = project_name;
		this.emp = emp;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public List<Emp> getEmp() {
		return emp;
	}
	public void setEmp(List<Emp> emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", project_name=" + project_name + ", emp=" + emp + "]";
	}
	

}
