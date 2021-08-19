package aamir;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class Main {
	public static void main(String[] args) throws ParseException, IOException {
		System.out.println("Enter the name");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		StringBuffer sb = new StringBuffer(s1);
		for (int i = 0; i < sb.length(); i++) {
			int count = 0;
			for (int j = i + 1; j < sb.length(); j++) {
				if (sb.charAt(i) == sb.charAt(j)) {
					sb.deleteCharAt(j);
					j--;
					count++;
				}
			}
			if (count >= 1) {
				sb.deleteCharAt(i);
				i--;
			}
		}
		System.out.println(sb.length());
		
	}
}
