package com.interview;

public class Interview10 {

	public static void main(String[] args) {
		for (int no = 1; no <= 12; no++) {
			int temp = 0;
			for (int i = 2; i < no; i++) {
				if (no % i == 0) {
					temp++;
				}
			}
			if (temp == 0) {
				System.out.print(no + " prim number ");
				if (no % 2 == 0) {
					System.out.println(" and also even no ");
				} else {
					System.out.println(" and also odd ");
				}
			} else {
				System.out.print(no + " not prime number ");
				if (no % 2 == 0) {
					System.out.println(" and also even number ");

				} else {
					System.out.println(" and also odd ");
				}
			}
		}
	}

}
