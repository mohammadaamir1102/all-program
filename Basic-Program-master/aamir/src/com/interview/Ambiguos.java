package com.interview;

public class Ambiguos {
	void test(Object s) {
		System.out.println("aamir");
	}

	void test(String s) {
		System.out.println("assiem");
	}

	void test(Integer s) {
		System.out.println("integer");
	}

	public static void main(String[] args) {
		//test(null);

	}

}
