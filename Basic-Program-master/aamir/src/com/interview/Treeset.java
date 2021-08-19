package com.interview;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
		/*
		 * Map<String,Integer>m=new HashMapProgram<>(); m.put(null, 20); m.put(null, 30);
		 * System.out.println(m.get(null));
		 */
		Set<Object>set=new TreeSet<>();
		set.add("1");
		set.add("2");
		set.forEach(a->System.out.println(a));
	}

}
