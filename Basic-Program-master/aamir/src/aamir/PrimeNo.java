package aamir;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		int no, temp = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		no = sc.nextInt();
		for (int i=2;i<no;i++) {
			if (no%i==0) {
				temp++;
			}
		}
		if(temp==0) {
			System.out.println(no + ": is Prime Number");
		} else {
			System.out.println(no + ": is Not Prime Number");
		}
		
		  if (no%2==0) {
			  System.out.println(" but " + no + " is even no"); 
			  }
		  else {
		  System.out.println("but " + no + " is odd no");
		  }
		 
	}
}
