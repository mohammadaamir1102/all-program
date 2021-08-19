package aamir;

import java.util.Scanner;

class Practic {

	public static void main(String[] args) {
		try(Scanner scanner=new Scanner(System.in)){
			System.out.println("Enter money in rupees");
			float f=scanner.nextFloat();
			int rup=(int)f;
			float z=rup;
			System.out.println(z);
			int paisa=(int)(f-z);
			System.out.println("here "+rup+ " is rupya");
			System.out.println("here "+paisa+ " is paisa");
			
		}
		
	}
}
