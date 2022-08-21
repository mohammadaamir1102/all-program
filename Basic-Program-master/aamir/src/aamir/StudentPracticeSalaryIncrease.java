package aamir;

public class StudentPracticeSalaryIncrease {

	private Integer id;
	private String name;
	private String address;
	private Character gender;
	private Integer age;
	private Double salary;
	public StudentPracticeSalaryIncrease() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentPracticeSalaryIncrease(Integer id, String name, String address, Character gender, Integer age, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
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
	@Override
	public String toString() {
		return "StudentPractice [id=" + id + ", name=" + name + ", address=" + address + ", gender=" + gender + ", age="
				+ age + ", salary=" + salary + "]";
	}
	
	
}
