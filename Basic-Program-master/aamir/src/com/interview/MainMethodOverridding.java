package com.interview;
class Super{
	public static void main(String[] args) {
		System.out.println("hello");
	}
}

public class MainMethodOverridding extends Super {

	public static void main(String[] args) {
		System.out.println("hello 2");

	}

}
/*
 * 43. Can we override main method? No because static method can’t be
 * overridden…… But if we want to compile then complier ask me which method u
 * want to run..
 */