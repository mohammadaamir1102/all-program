package com.maven.mavenproject1;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "student_school_record")
public class SchoolRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "AGE")
	private String age;
	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "CITY")
	private String city;
	@Column(name = "COURSE")
	private String course;
	@Column(name = "DATE")
	@Temporal(TemporalType.DATE)
	private Date addDate;
	private Certificate cer;

	public SchoolRecord(int id, String name, String age, String address, String city, String course, Date addDate) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.city = city;
		this.course = course;
		this.addDate = addDate;
	}

	public SchoolRecord() {
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}
	

	public Certificate getCer() {
		return cer;
	}

	public void setCer(Certificate cer) {
		this.cer = cer;
	}

	@Override
	public String toString() {
		return "SchoolRecord [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", city=" + city
				+ ", course=" + course + ", addDate=" + addDate + ", cer=" + cer + "]";
	}

	
	

}
