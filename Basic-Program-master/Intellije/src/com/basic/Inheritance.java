package com.basic;

class Employee {
	void show() {
		System.out.println("showing");
	}
}
class Mouse extends Employee{
	void mouse() {
		System.out.println("chuha");
	}
}

public class Inheritance extends Employee {
	void run() {
		System.out.println("running");
	}

	public static void main(String[] args) {
		Employee employee = new Inheritance();
		employee.show();
		/*
		 * employee.mouse(); employee.run();
		 */

	}

}
