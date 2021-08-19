package aamir;

public class Methodover {

	void sum(int a, int b, int c) {
		System.out.println("hii...");
	}

	void sum(int... x) {
		System.out.println("byy");
	}

	public static void main(String[] args) {
		Methodover m = new Methodover();
		m.sum(1, 2);
	}

}
