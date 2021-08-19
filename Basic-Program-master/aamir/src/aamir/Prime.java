package aamir;

public class Prime {

	public static void main(String[] args) {

		for (int no = 1; no <= 100; no++) {
			int temp = 0;
			for (int i = 2; i < no; i++) {
				if (no % i == 0) {
					temp = temp + 1;
				}
			}
			if (temp == 0) {
				System.out.println("    Prime No:" + no);
			} else {
				System.out.println("Not prime No:" + no);
			}
		}
	}

}