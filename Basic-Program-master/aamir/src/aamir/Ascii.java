package aamir;

public class Ascii {

	public static void main(String[] args) {
		String z = "A";
		byte[] b = z.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

}
