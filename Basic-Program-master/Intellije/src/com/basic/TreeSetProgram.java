package com.basic;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetProgram {
	public static void main(String[] args) {
		Set<String>treeSet=new TreeSet<>();
		treeSet.add("zeeshan khan");
		treeSet.add("Aamir khan");
		treeSet.add("Aamir khan");
		treeSet.add(null);
		treeSet.add("furqan khan");
		treeSet.add("izhar khan");
		treeSet.forEach(a->System.out.println(a));
	}

}
