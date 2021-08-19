package aamir;

import java.util.Scanner;

public class MaximumArray {

	public static void main(String[] args) {

		try (Scanner s = new Scanner(System.in)) {
			System.out.print("Enter the element size");
			int n = s.nextInt();
			int[] a = new int[n];
			System.out.println("enter all element");
			for (int i = 0; i < a.length; i++) {
				a[i] = s.nextInt();
			}
			int max = a[0];
			for (int i = 1; i < a.length; i++) {
				if (a[i] > max) {
					max = a[i];
				}
			}
			System.out.println("Maximum is:  " + max);
		}
	}
}
