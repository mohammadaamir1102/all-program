package com.Lambda;

import java.util.function.Predicate;

public class PredicateisEqual {
	public static void main(String[] args) {
		String s="Mumbai";
		Predicate<String>p=Predicate.isEqual("Mumbai");
		System.out.println(p.test(s));

	}
}
