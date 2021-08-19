package aamir;

public class DemoStatic {
	int empid;
	String name;
	static String company = "jsoft";
	
	static void change() {
		company="Mumbai";
	}

	DemoStatic(int empid, String name) {
		this.empid = empid;
		this.name = name;
	}

	void display() {
		System.out.println(empid + " " + name + " " + company);
	}

	public static void main(String arg[]) {
		DemoStatic.change();
		DemoStatic t1 = new DemoStatic(101, "aamir");
		t1.display();
		DemoStatic t2 = new DemoStatic(102, "aasim");
		t2.display();

	}
}
