package com.practice;

import java.util.HashSet;
import java.util.Set;

public class SaifQuestion {
	public static void main(String[] args) {
		int temp = 0;
		
		String string = "Mohammad Saif";
		char[] ch = string.toCharArray();
		String s1="";

		Set<Character> set = new HashSet<>();
		for (int i = 0; i < string.length(); i++) {
			if (set.contains(ch[i])) {
				continue;
			}
			for (int j = i + 1; j < string.length(); j++) {
				if (ch[i] == ch[j]) {
					set.add(ch[i]);
					System.out.println(set);
				}
				if(ch[i]!=ch[j]) {
					s1=s1+ch[i];
				}

			}

		}
		
	}

}
