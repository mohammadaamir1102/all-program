package com.Lambda;

interface Book {
	void show(int x, int y);

	static void run() {
		System.out.println("static block");
	}

	default void fast() {
		System.out.println("default method");
	}
}

public class LambdaExpressoinArgumentWithStaticAndDefault {

	public static void main(String[] args) {
		Book b = (x, y) -> {
			System.out.println(x + y);
		};
		b.show(101, 101);
		Book.run();
		b.fast();
		
	}

}
