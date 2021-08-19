package aamir;

public class StringgetByte {

	public static void main(String[] args) {
		String a="abcd";
		byte[] b=a.getBytes();
		for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);	
		}
	}

}
