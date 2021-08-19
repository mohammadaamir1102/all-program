package com.Lambda;

interface String1 {
	public String show();
}

public class LambdaExpressoinString {
	public static void main(String[] args) {
		String1 s = () -> {
			return "Hello Aamir Khan";
		};
		System.out.println(s.show());
	}

}
