package com.Lambda;

import java.util.function.Function;

public class FunctionSpaceRemove {
	public static void main(String[] args) {
		String space="    Salman khan     ";
		System.out.println(space);
		Function<String, String> function=s->s.trim();
		System.out.println(function.apply(space));
	}

}
 