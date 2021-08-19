package com.interview;

public class ArrayMaximum {

	public static void main(String[] args) {
		int[] a= {10,20,30,78,4,76};
		int max=a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}System.out.println(max);

	}

}
