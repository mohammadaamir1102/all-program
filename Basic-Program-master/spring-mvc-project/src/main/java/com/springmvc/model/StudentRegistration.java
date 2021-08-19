package com.springmvc.model;

import javax.persistence.*;

@Entity
public class StudentRegistration {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;

	@Column(name = "First_Name")
	private String firstName;

	@Column(name = "Last_Name")
	private String lastName;

	@Column(name = "Student_Gender")
	private String gender;

	@Column(name = "Orphan")
	private String orphan;

	@Column(name = "Student_Email")
	private String email;

	@Column(name = "Student_Mobile_no")
	private Long mobileNumber;

	@Column(name = "Father_Name")
	private String fatherName;

	@Column(name = "Parent_Mobile_no")
	private Long parentNumber;

	@Column(name = "Student_Address")
	private String address;

	@Column(name = "State")
	private String states;

	@Column(name = "Course")
	private String courses;

	@Column(name = "Zipcode")
	private int zipcode;

	@Column(name = "Country")
	private String country;

	@Column(name = "Total_Fees")
	private float totalFees;

	@Column(name = "Paid_Fees")
	private float paidFees;

	@Column(name = "Remain_Fees")
	private float remainFees;

	public StudentRegistration(int id, String firstName, String lastName, String gender, String orphan, String email,
			Long mobileNumber, String fatherName, Long parentNumber, String address, String states, String courses,
			int zipcode, String country, float totalFees, float paidFees, float remainFees) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.orphan = orphan;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.fatherName = fatherName;
		this.parentNumber = parentNumber;
		this.address = address;
		this.states = states;
		this.courses = courses;
		this.zipcode = zipcode;
		this.country = country;
		this.totalFees = totalFees;
		this.paidFees = paidFees;
		this.remainFees = remainFees;
	}

	public StudentRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getOrphan() {
		return orphan;
	}

	public void setOrphan(String orphan) {
		this.orphan = orphan;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public Long getParentNumber() {
		return parentNumber;
	}

	public void setParentNumber(Long parentNumber) {
		this.parentNumber = parentNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStates() {
		return states;
	}

	public void setStates(String states) {
		this.states = states;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public float getTotalFees() {
		return totalFees;
	}

	public void setTotalFees(float totalFees) {
		this.totalFees = totalFees;
	}

	public float getPaidFees() {
		return paidFees;
	}

	public void setPaidFees(float paidFees) {
		this.paidFees = paidFees;
	}

	public float getRemainFees() {
		return remainFees;
	}

	public void setRemainFees(float remainFees) {
		this.remainFees = remainFees;
	}

	@Override
	public String toString() {
		return "StudentRegistration [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
				+ gender + ", orphan=" + orphan + ", email=" + email + ", mobileNumber=" + mobileNumber
				+ ", fatherName=" + fatherName + ", parentNumber=" + parentNumber + ", address=" + address + ", states="
				+ states + ", courses=" + courses + ", zipcode=" + zipcode + ", country=" + country + ", totalFees="
				+ totalFees + ", paidFees=" + paidFees + ", remainFees=" + remainFees + "]";
	}

}
