package aamir;

public class InsertIntoarray1 {
	public static void main(String[] args) {
		int[] a = { 12, 54, 67, 45 };
		for (int i = 0; i < a.length; i++) {
			if (i == 3) {
				a[i] = 10;
			}
		}
		for (int i : a) {
			System.out.println(i);
		}
	}

}
