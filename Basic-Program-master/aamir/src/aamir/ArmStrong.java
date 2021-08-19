package aamir;

public class ArmStrong {
	public static void main(String[] args) {
		int no = 370, rem, sum = 0;
		int temp = no;
		while (no > 0) {
			rem = no % 10;
			sum = sum + (rem * rem * rem);
			no = no / 10;
		}
		if (temp == sum)
			System.out.println("arm strong");
		else
			System.out.println("not arm");

	}

}
