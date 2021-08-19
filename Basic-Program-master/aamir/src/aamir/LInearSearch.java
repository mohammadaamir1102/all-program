package aamir;

public class LInearSearch {

	public static void main(String[] args) {
		int[] a = { 2, 4, 5, 6, 2};
		int itom = 2;
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == itom) {
				System.out.println("Item exits at " + i + " index");
				temp++;
			}

		}
		if (temp == 0) {
			System.out.println("Itom not found ");
		}
	}

}
