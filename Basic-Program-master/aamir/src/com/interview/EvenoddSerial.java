package com.interview;
import java.util.Scanner;

public class EvenoddSerial {

	public static void main(String[] args) {
		System.out.println("Enter the no:");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		System.out.println("odd no:");
		for (int i = 1; i <= no; i++) {

			if (i % 2 == 0) {
				System.out.print(i);
				if (i < no - 1) {
					System.out.print(",");
				}

				i++;
				if (i == no || i == no + 1) {
					break;
				}

			}

			else {
				System.out.print(i);
				if (i < no - 1) {
					System.out.print(",");
				}
				i++;

			}
			if (i == no + 1) {
				i = no;
			}
			if (i == no) {
				i = 1;
				System.out.println("\neven no:");
			}
		}

	}
}