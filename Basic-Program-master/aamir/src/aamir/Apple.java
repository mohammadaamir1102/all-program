package aamir;

import java.util.Scanner;

public class Apple {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the NUmber");
			int no = s.nextInt();
			int sum = 0;
			for (int i = 1; i <= no; i++) {
				if (i % 2 != 0) {
					sum += 2;
				} else {
					sum += 1;
				}

			}
			System.out.println("Total is :" + sum);
		}
	}

}
