package com.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	private int pId;
	private String projectName;

	@ManyToMany
	private List<Emp> emp;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int pId, String projectName, List<Emp> emp) {
		super();
		this.pId = pId;
		this.projectName = projectName;
		this.emp = emp;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Emp> getEmp() {
		return emp;
	}

	public void setEmp(List<Emp> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Project [pId=" + pId + ", projectName=" + projectName + ", emp=" + emp + "]";
	}

}
