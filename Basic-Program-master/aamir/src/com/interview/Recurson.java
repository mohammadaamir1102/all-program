package com.interview;

public class Recurson {
	static int count = 0;

	static void show() {
		count++;
		if (count <= 5) {
			System.out.println("hello " + count);
			show();
		}
	}

	public static void main(String[] args) {
		show();

	}

}
