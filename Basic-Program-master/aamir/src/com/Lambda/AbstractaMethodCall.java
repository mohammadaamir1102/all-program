package com.Lambda;

abstract class Simple {
	void show() {
		System.out.println("parent method");
	}

	public Simple() {
		System.out.println("parent class Constructor");
	}
}

public class AbstractaMethodCall extends Simple {
	public AbstractaMethodCall() {
		System.out.println("child class constructor");
	}

	void show() {
		System.out.println("child method");
	}

	public static void main(String[] args) {
		AbstractaMethodCall a = new AbstractaMethodCall();
		a.show();
	}
}
