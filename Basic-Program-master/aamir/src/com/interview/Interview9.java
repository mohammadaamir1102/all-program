package com.interview;

//@FunctionalInterface
interface Book {
	static void show() {
		System.out.println("static");
	}

	// void show();
	void aamir();

	public default void pen() {
		System.out.println("aamir khan");
	}
}

public class Interview9 implements Book {

	public static void main(String[] args) {
		Interview9 i = new Interview9();
		Book.show();
		i.pen();

	}

	@Override
	public void aamir() {
		// TODO Auto-generated method stub

	}

}
