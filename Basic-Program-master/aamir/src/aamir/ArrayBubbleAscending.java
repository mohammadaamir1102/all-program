package aamir;

public class ArrayBubbleAscending {

	public static void main(String[] args) {
		int temp;
		int a[] = { 54, 65, 23, 56, 87, 34, 56 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

}
