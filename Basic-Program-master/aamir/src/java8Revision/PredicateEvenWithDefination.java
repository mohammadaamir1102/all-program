package java8Revision;

/*Predicate an functional interface use for conditional statement
 * which is accept an argument and return a boolean*/
public class PredicateEvenWithDefination {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		java.util.function.Predicate<Integer> evenPredicate = x -> x % 2 == 0;
		for (int i : a) {
			if (evenPredicate.test(i)) {
				System.out.println("even no: " + i);
			} else {
				System.out.println("odd no: " + i);
			}
		}

	}
}
