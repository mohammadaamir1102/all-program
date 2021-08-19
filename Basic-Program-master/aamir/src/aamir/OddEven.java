package aamir;

public class OddEven {

	public static void main(String[] args) {
		String even = "";
		String odd = "";
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				even = even + i + " , ";
			} else {
				odd = odd + i + " , ";
			}
		}
		System.out.println(even);
		System.out.println(odd);

	}
}
