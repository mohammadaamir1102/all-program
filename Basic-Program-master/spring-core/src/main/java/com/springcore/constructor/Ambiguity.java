package com.springcore.constructor;

public class Ambiguity {
	private int a;
	private int b;

	public Ambiguity(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("double property");
	}

	public Ambiguity(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("integer prperty");
	}

	public Ambiguity(String a, String b) {
		//here String constructor call because of IOC give the priority first String type
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("String property");
	}

	public void dosum() {
		System.out.println("sum is " + (a + b));
	}

}
