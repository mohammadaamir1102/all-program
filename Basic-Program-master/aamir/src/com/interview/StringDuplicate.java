package com.interview;

import java.util.Scanner;

public class StringDuplicate {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the something");
	String name=sc.nextLine();
	int count=0;
	for(int i=0;i<name.length();i++)
	{
		if(name.charAt(i)=='a') {
			
			count++;
		}
		sc.close();
	}
	System.out.println(count);

	}
	
}
