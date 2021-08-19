package com.Lambda;

import java.util.function.Predicate;

public class PredicateEven {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Predicate<Integer> p = x -> x % 2 == 0;
		for (int i : a) {

			if (p.test(i)) {
				System.out.println("even number is " + i);
			} else {
				System.out.println("odd number is " + i);
			}

			/*
			 * if (p.negate().test(i)) { System.out.println(i); }
			 */
		}
	}
}
