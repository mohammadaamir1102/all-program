package com.interview;

public class NonStaticCalledFromMainMethod {

	public static void main(String[] args) {
		NonStaticCalledFromMainMethod n = new NonStaticCalledFromMainMethod();
		n.show();
	}

	void show() {
		System.out.println("called non static from main method");

	}

}
