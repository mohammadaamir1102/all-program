package aamir;

public class Anonymous {

	public static void main(String[] args) {
		Anonymous.show(new int[] { 12, 13, 14, 15 });

	}

	static void show(int[] a) {
		int total = 0;
		for (int i : a) {
			total = total + i;
		}
		System.out.println(total);
	}
}
