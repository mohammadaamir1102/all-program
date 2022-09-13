package aamir;

public class ParameterizedConstructorSession2 {

	int age;
	String name; // instance var

	 ParameterizedConstructorSession2(int a, String n) { // parameterize constructor
		age = a; // here a value swipe into age same happened with n which is below
		name = n;
	}

	void forPrint() {
		System.out.println(age + " " + name);
	}

	public static void main(String[] args) {
		ParameterizedConstructorSession2 pc = new ParameterizedConstructorSession2(33, "Aamir");
		pc.forPrint();
	}
}
