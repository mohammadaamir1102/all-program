package com.interview;
@FunctionalInterface
interface Ta{
	void show();
}

public class Lambda1{

	public static void main(String[] args) {
		Ta s=()->{
			System.out.println("abstract method");
		};
		s.show();

	}

}
