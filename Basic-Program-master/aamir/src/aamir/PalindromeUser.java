package aamir;

import java.util.Scanner;

public class PalindromeUser {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the number");
		int no=s.nextInt();
		int rem,rev=0,pal;
		pal=no;
		while(no!=0) {
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		if(pal==rev)
			System.out.println(pal + ": is Palindrome");
		else
			System.out.println(pal + ": is not a Palindrome");
		s.close();
	}

}
