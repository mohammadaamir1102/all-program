package com.Lambda;

interface Lambda {
	void show();
}

public class LambdaExpressoinNoArgument {
	public static void main(String[] args) {
		Lambda l = () -> {
			System.out.println("Hello show method");
		};
		l.show();
	}
}