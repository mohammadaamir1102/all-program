package aamir;

public class Arrayindexcalculate {

	public static void main(String[] args) {
		int[] a = { 12, 13, 98, 65, 10, 15, 24, 1, 18, 7 };
		for (int i = 0; i < a.length - 1; i++) {
			int first = a[i];
			int second = a[i + 1];
			if (first + second == 25) {
				System.out.println("first index " + (i) + " second index " + (i + 1) + " is = 25");
			}
		}
	}

}
