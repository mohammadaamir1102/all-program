package aamir;

public class CalledInstanceVariableByThisKeyword {

	private int age;
	private String name;
	private float fee;

	private CalledInstanceVariableByThisKeyword(int a, String n, float fe) {
		age = a;
		name = n;
		fee = fe;
	}

	void print() {
		System.out.println(age + " " + name + " " + fee);
	}

	public static void main(String[] args) {
		CalledInstanceVariableByThisKeyword civbc = new CalledInstanceVariableByThisKeyword(33, "Aamir khan", 500);
		civbc.print();
	}
}
