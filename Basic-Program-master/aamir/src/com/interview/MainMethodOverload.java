package com.interview;
public class MainMethodOverload {
	public static void main(String[] args) {
		System.out.println("main method");
		System.out.println("_________________");
		main("second main method");
		System.out.println("__________________");
		main("third main method  ",10);
	}
	public static void main(String name) {
		System.out.println("hello");
	}
	public static void main(String name,int age) {
		System.out.println(name+""+age);
	}

}//can we overload main method in java?
//yes we can 
