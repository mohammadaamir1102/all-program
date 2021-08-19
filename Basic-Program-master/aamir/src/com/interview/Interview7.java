package com.interview;

import java.util.Scanner;

public class Interview7 {
	public static void main(String[] args) {
		System.out.println("enter the number");
		try (Scanner s = new Scanner(System.in)) {
			int no=s.nextInt();
			switch(no%2) {
			
			case 0: System.out.println("even no");
			break;
			
			case 1 :System.out.println("odd");
			break;
			
			
				
			}
		}
	}

}
