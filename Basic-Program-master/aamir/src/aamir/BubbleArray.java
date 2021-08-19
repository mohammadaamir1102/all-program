package aamir;

public class BubbleArray {

	public static void main(String[] args) {
		int[] a = { 3, 6, 4, 3, 2, 4, 56, 6 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int temp = 0;
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int i : a) {
			System.out.println(i);
		}

		System.out.println("Second largest no = " + a[a.length - 2]);

	}

}
