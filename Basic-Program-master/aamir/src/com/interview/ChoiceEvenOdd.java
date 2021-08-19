package com.interview;

public class ChoiceEvenOdd {

	public static void main(String[] args) {
		int no =123456;
		int rem, rev = 0;
		while (no != 0) {
			rem = no % 10;
			rev = rem;
			no = no / 10;
			if(rev==5) {
				break;
			}
		}
		if(rev%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
		
	}

}
