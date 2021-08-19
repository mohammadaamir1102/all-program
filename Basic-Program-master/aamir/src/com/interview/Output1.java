package com.interview;

public class Output1 {

	public static void main(String[] args) {
		test(null);

	}

	static void test(Object o) {
		System.out.println("Object class");
	}

	static void test(String s) {
		System.out.println("String class");
	}

	/*
	 * static void test(Integer i) { System.out.println("Integer class"); }
	 */
	//because of ambiguous problem if we remove Integer 

}
