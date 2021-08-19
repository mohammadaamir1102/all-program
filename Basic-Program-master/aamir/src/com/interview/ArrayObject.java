package com.interview;

public class ArrayObject {

	public static void main(String[] args) {
		Object[] a = new Object[5];
		a[0] = 10;
		a[1] = "aasim";
		a[2] = 345.65;
		a[3] = 23.5f;
		a[4] = 234567766;
		for (Object object : a) {
			//System.out.println(object);
		}

	}

}
