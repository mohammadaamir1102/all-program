package com.maven;

import javax.persistence.*;

@Entity // @automatic table creation by entity
@Table(name = "Student_Details")

public class Student {
	@Id // @id is here use for primary key.
	@GeneratedValue(strategy = GenerationType.AUTO) // this is for auto increment and automatic generated value by
													// generated value.
	@Column(name = "id")
	private int id;
	@Column(name = "student_name")
	private String name;
	@Column(name = "city_name")
	private String city;
	private Certificate certi;

	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Certificate getCerti() {
		return certi;
	}

	public void setCerti(Certificate certi) {
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", certi=" + certi + "]";
	}

	
	}


