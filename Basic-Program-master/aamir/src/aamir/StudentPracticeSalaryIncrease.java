package aamir;

import java.sql.Timestamp;

public class StudentPracticeSalaryIncrease {

	private Integer id;
	private String name;
	private String address;
	private Character gender;
	private Integer age;
	private Double salary;
	private Timestamp time;

	public StudentPracticeSalaryIncrease() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentPracticeSalaryIncrease(Integer id, String name, String address, Character gender, Integer age,
			Double salary, Timestamp time) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
		this.time = time;
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

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "StudentPracticeSalaryIncrease [id=" + id + ", name=" + name + ", address=" + address + ", gender="
				+ gender + ", age=" + age + ", salary=" + salary + ", time=" + time + "]";
	}

}
