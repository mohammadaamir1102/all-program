package aamir;

public class FindFirstDuplicateArray {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 1, 2 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[j]);
					temp++;
				}
			}
			if (temp == 1) {
				break;
			}
		}
	}
}
