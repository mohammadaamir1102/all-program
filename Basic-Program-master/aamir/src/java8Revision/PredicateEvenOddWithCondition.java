package java8Revision;

import java.util.function.Predicate;

public class PredicateEvenOddWithCondition {
	public static void main(String[] args) {
		int[] a = { 44, 65, 78, 54, 45, 87, 90, 32 };
		Predicate<Integer> evenPredicate = x -> x % 2 == 0;
		Predicate<Integer> grtPredicate = y -> y > 50;
		for(int i:a) {
			if (grtPredicate.and(evenPredicate).test(i)) {
				System.out.println(i);
			}
		}
	}
}
