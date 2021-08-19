package aamir;

public class Addandeven {

	private final int a = 10;

	public static void main(String[] args) {
		int n = 10;
		for (int i = n; i >= 0; i--) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
