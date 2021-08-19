package com.interview;

public class PrimeOnetoHundred {
	public static void main(String[] args) {
		for (int no = 1; no <= 100; no++) {
			int temp = 0;
			for (int i = 2; i < no; i++) {
				if (no % i == 0) {
					temp++;
				}
			}
			if (temp == 0) {
				System.out.println(no + " is prime number");
			} else {
				System.out.println(no + " is not prime number");
			}
		}
	}

}
