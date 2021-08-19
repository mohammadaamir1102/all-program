package aamir;

public class MethodChaning {
	int name;
	String age;

	public MethodChaning set(int name) {
		this.name = name;
		return this;
	}

	public MethodChaning get(String age) {
		this.age = age;
		return this;
	}

	void display() {
		System.out.println(name + " " + age);
	}

	public static void main(String[] args) {
		MethodChaning c = new MethodChaning();
		c.set(10).get("hello").display();

	}

}
