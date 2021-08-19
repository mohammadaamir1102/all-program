package com.interview;

import java.util.Scanner;

public class Interview3 {
	
	//kilometer to miles
	
	public static void main(String[] args) {
		System.out.println("enter the kilometer");
		
		Scanner s=new Scanner (System.in);
		int km=s.nextInt();
		float cal=(float)(km*(0.62137119));
		System.out.println(cal);
		s.close();
	}

}
