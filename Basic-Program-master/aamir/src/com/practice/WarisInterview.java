package com.practice;

public class WarisInterview {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		int d=31;
		a=++b;
		b=++c;
		c=--c;
		d=--b;
		a=++a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d) ;
	}

}
