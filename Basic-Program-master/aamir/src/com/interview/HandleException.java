package com.interview;

public class HandleException {

	public static void main(String[] args) {
		try {
			int a=10/0;
			if(a!=0) {
		
			System.out.println("exception handled");
			}
			int c=30;
			System.out.println(c);
			
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

	}

}
