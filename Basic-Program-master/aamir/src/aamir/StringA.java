package aamir;

public class StringA {

	public static void main(String[] args) {
		/*
		 * String s1 = "ABCD"; byte[] b = s1.getBytes(); for (int i = 0; i < b.length;
		 * i++) { System.out.println(b[i]); }
		 */
		StringBuffer stringBuffer=new StringBuffer("Aamir");
		stringBuffer.append("khan");
		System.out.println(stringBuffer);
	}

}
