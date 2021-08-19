package aamir;

public class Omega {

	public static void main(String[] args) {
		String s = "omega";
		for (int i = 0; i < s.length(); i++) {
			String s1 = "";
			for (int j = 1; j < s.length(); j++) {
				s1 = s1 + s.charAt(j);
				if (j == s.length() - 1) {
					s1 = s1 + s.charAt(0);
				}

			}
			s=s1;
			System.out.println(s);
		}

	}
}
