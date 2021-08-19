package aamir;

public class CountingCharacter {

	public static void main(String[] args) {
		String name = "Aamir khan";
		int count = 0;
		for (int i = 0; i < name.length() - 1; i++) {
			if (name.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println(count + ":time");

	}

}
