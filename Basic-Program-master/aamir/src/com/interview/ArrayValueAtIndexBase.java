package com.interview;

public class ArrayValueAtIndexBase {

	public static void main(String[] args) {
		int[] a= {21,43,65,87,88};
		for (int i = 0; i < a.length; i++) {
			if(a[i]==87) {
				System.out.println(i);
			}
		}

	}

}
