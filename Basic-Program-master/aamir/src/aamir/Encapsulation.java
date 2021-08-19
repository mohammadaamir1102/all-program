package aamir;

class Employee {
	private int empid;
	private String name;

	public void setempId(int id) {
		empid = id;
	}

	public int getempId() {
		return empid;
	}

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}
}

class Encapsulation {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setempId(101);
		e.setName("Aamir");
		System.out.println(e.getempId() + "\n" + e.getName());
	}
}