package com.mavenLectue;

import javax.persistence.*;

@Entity // mark a class as a Entity
@Table(name = "Student_details") // for changing table name
public class Student {

	@Id // for primary key
	@GeneratedValue(strategy = GenerationType.AUTO) // for id auto Increment
	@Column(name = "Student_id")
	private int id;

	@Column(name = "Student_name") // changing for column name
	private String name;

	@Column(name = "Student_village")
	private String village;

	@OneToOne
	private Address address;

	

	public Student(int id, String name, String village, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.village = village;
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", village=" + village + ", address=" + address + "]";
	}

}
