package aamir;

import java.util.Scanner;

public class PrimeUser {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int no = s.nextInt();
		int temp = 0;

		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				temp++;
			}
		}

		if (temp == 0) {
			System.out.print("Prime Number");
		} else {
			System.out.print("Not Prime Number");
		}
		if (no % 2 == 0) {
			System.out.println(" And Even Number");
		} else {
			System.out.println(" And Odd Number");
		}
		s.close();
	}

}
