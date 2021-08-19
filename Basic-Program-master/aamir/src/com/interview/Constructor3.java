package com.interview;

class Cons {
	Cons() {
		System.out.println("2");
	}
}

public class Constructor3 extends Cons{
	Constructor3() {
		System.out.println("3");
	}

	public static void main(String[] args) {
		System.out.println("4");
		Constructor3 c=new Constructor3();
		

	}

}
