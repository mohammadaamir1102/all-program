package com.interview;

public class StaticInnerOuter {

	void show(Object o) {
		System.out.println("object");
	}

	void show(Number i) {
		System.out.println("Integer");
	}

	void show(Integer n) {
		System.out.println("String");
	}

	public static void main(String[] args) {
		StaticInnerOuter s = new StaticInnerOuter();
		s.show(null);
	}

}
