package com.Lambda;

interface Shalimar {
	String show(String name);
}

public class LambdaExpressionStringParameter {

	public static void main(String[] args) {
		Shalimar shalimar = (name) -> {
			return "Hello " + name;
		};
		System.out.println(shalimar.show("Aamir khan"));

		Shalimar shalimar2 = (name) -> {
			return "Hello " + name;
		};
		System.out.println(shalimar2.show("Aasim khan"));
	}
}
