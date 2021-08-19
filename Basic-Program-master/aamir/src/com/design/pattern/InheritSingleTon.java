package com.design.pattern;

public class InheritSingleTon {

	public static void main(String[] args) {
		
		SingleTon singleTon=SingleTon.getSingleTon();
		System.out.println(singleTon);
		

		SingleTon singleTon2=SingleTon.getSingleTon();
		System.out.println(singleTon2);
		
	}
}
