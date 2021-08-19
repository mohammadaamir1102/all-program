package com.interview;

import java.util.Arrays;
import java.util.Scanner;

public class Interview18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int no = sc.nextInt();
		int[] a = new int[10];
		System.out.println(Arrays.toString(a));
		while (no != 0) {
			int lastDigit = no % 10;
			a[lastDigit]++;
			no = no / 10;
		}
		System.out.println(Arrays.toString(a));
		System.out.println("===================");
		System.out.println("Digits : Frequency");
		System.out.println("===================");
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				System.out.println("   " + i + "   :   " + a[i]);
			}
		}
		

		sc.close();

	}

}
