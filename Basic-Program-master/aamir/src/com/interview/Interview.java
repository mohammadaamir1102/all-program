package com.interview;

import java.util.Scanner;

public class Interview {
	//for CGPA
	public static void main(String[] args) {
		try (
		Scanner s = new Scanner(System.in)) {
			System.out.println("enter the number of hindi");
			int hindi=s.nextInt();
			System.out.println("enter the number of urdu");
			int urdu=s.nextInt();
			System.out.println("enter the number of english");
			int english=s.nextInt();
			System.out.println("enter the number of math");
			int math=s.nextInt();
			System.out.println("enter the number of science");
			int science=s.nextInt();
			System.out.println("enter the number of social science");
			int soscience=s.nextInt();
			
			float percentage=(hindi+urdu+english+math+science+soscience)*100/600;
			System.out.println("percentage is "+percentage);
		}
		

	}

}
