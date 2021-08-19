package com.Lambda;

import java.util.function.Predicate;

public class PredicateGreatherThan {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7,7,8,9,65,1,2,3,4,5};
		Predicate<Integer>p=x->x>5;
		for (int i : a) {
			if(p.test(i)) {
				System.out.println(i);
			}
		}
	}

}
