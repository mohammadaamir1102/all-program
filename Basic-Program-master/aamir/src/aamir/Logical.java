package aamir;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		int a[] = { 2, 1, 2, 1, 2, 1 };
		int c = 0;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the Number");
			int no = s.nextInt();
			for (int i = 0; i <= no; i++) {
				c = a[0] + a[1];
				a[2] = a[0];
				a[1] = a[4];
			}
			System.out.println(c);
		}
	}

}
