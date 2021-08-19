package aamir;

public class ArrayBubble {

	public static void main(String[] args) {

		int[] a = { 10, 30, 50, 20, 70, 60, 40 };
		System.out.println("Ascending is: ");
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int z : a) {
			System.out.print(z + " ");
		}
		System.out.println();
		System.out.println("Second Largest: " + a[a.length - 2]);

	}
}
