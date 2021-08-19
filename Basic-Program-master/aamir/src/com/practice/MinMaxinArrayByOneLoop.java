package com.practice;

public class MinMaxinArrayByOneLoop {
	public static void main(String[] args) {

		int[] a = { 5, 10, 54, 78, 90 };
		int min = a[0];
		int max = a[0];
		for (int i = 1; i < a.length; i++) {

			if (a[i] < min) {
				min = a[i];

			} else if (a[i] > max) {
				max = a[i];

			}
		}
		System.out.println("minimum value is " + min);
		System.out.println("maximum value is " + max);

	}

}
