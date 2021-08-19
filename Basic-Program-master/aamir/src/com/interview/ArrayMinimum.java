package com.interview;

public class ArrayMinimum {

	public static void main(String[] args) {
		int[] a= {10,23,43,54,65,76};
		int min=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>min) {
				min=a[i];
			}
		}System.out.println(min);
	}

}
