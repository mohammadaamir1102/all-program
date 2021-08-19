package com.Lambda;

import java.util.function.Predicate;

public class PredicateNumberEvenAndGreater {
	public static void main(String[] args) {
		int[] a = { 1, 2, 44, 64, 64, 332, 56, 32, 564, 3, 45, 6, 6 };
		Predicate<Integer> even = x -> x % 2 == 0;
		Predicate<Integer> grt = y -> y > 20;
		for (int i : a) {
			/*
			 * if (grt.and(even).test(i)) {
			 * System.out.println("Number is even and greater than five " + i); }
			 */
			if (even.and(grt).test(i)) {
				System.out.println("Number is even and greater than five " + i);
			}
		}
	}

}
