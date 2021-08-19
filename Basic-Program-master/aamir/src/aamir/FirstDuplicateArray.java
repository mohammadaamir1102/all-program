package aamir;

public class FirstDuplicateArray {

	public static void main(String[] args) {
		int[] a = { 78, 2, 3, 4, 6, 3, 1, 7, 2, 9, 78 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[j]);
					temp++;
				}

			}
			if (temp > 0) {
				break;
			}

		}
	}
}