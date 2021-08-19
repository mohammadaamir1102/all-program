package main;

import java.util.*;
//saif interview question

class Employee {
	long empid;
	String name;
	String designation;

	public Employee(long empid, String name, String designation) {
		super();
		this.empid = empid;
		this.name = name;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", designation=" + designation + "]";
	}

}

public class Main {

	public static void main(String[] args) {

		List<Employee> l = new ArrayList<>();

		l.add(new Employee(1, "saif", "JavaDaveloper"));
		l.add(new Employee(2, "Ammir", "JavaDaveloper"));
		l.add(new Employee(5, "Faizan", "JavaDaveloper"));

		List<Employee> l1 = new ArrayList<>();
		l1.add(new Employee(1, "Raju", "python"));
		l1.add(new Employee(2, "Kartik", "python"));
		l1.add(new Employee(3, "Rahul", "python"));

		Map<String, List<Employee>> map = new HashMap<>();
		map.put("JavaDaveloper", l);
		map.put("python", l1);
		
		System.out.println("Please Enter Designation");
		Scanner scanner = new Scanner(System.in);
		String designation = scanner.nextLine();

		for (Map.Entry <String, List<Employee>> m : map.entrySet()) {
			if (m.getKey().equals(designation))
				System.out.println(m.getValue());
		}

		scanner.close();
	}
}
