package com.Lambda;

public class Function {
	public static void main(String[] args) {
		java.util.function.Function<String, Integer> function = s -> s.length();
		System.out.println(function.apply("salman khan"));
	}

}
