package aamir;

public class Arrayeven {

	public static void main(String[] args) {
		int[] a = { 9, 4, 6, 7, 3, 11 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println("Even  " + a[i]);
			} else {
				System.out.println("odd  " + a[i]);
			}

		}

	}

}
