package aamir;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNotRepeatedChar {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the Name for seeing first non repeated character");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		FirstNotRepeatedChar firstNotRepeatedChar = new FirstNotRepeatedChar();
		Character firstRepeatedChar = firstNotRepeatedChar.getFirstRepeatedChar(name);
		System.out.println("first non repeated char :" + firstRepeatedChar);
	}

	private Character getFirstRepeatedChar(String name) {
		Map<Character, Integer> counts = new LinkedHashMap<>(name.length());
		for (Character c : name.toCharArray()) {
			counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
		}
		for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}

		}
		throw new RuntimeException("did not get any first non repeated character !");
	}

}
