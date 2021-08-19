package com.interview;

import java.util.Scanner;

public class ArrayByUser {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size");
		int n = scanner.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the Elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		int max = a[0];
		for (int j = 0; j < a.length; j++) {
			if (a[j] > max) {
				max = a[j];
			}
		}
		System.out.println("result of maximum value is " + max);
		scanner.close();
	}

}
