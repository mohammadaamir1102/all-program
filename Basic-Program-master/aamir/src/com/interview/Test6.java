package com.interview;
public class Test6 {

	public static void main(String[] args) {
		
		int no =123456;
		int rem, rev = 0;
		while (no != 0) {
			rem = no % 10;
			rev = rem;
			no = no / 10;
		}

		if (rev % 2 == 0) {
			System.out.println(rev + " even");
		} else {
			System.out.println(rev + " odd");
		}
	}
}