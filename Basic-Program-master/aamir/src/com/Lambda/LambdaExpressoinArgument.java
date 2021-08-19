package com.Lambda;

interface Lambda1 {
	public void show(int a, int b);

}

public class LambdaExpressoinArgument {
	public static void main(String[] args) {
		Lambda1 l = (a,b) -> {
			System.out.println(a + b);
		};
		l.show(10, 10);
	}

}