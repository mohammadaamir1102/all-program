package com.interview;

public class MultipleCactBlock {

	public static void main(String[] args) {
		try {
		      int array[] = new int[10];
		      array[10] = 30 / 6;
		    } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
		      System.out.println(e);
		    }
		System.out.println("rest of the code");

	}

}
