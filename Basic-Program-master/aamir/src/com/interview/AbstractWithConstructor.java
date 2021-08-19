package com.interview;

abstract class PenDrive {
	public PenDrive() {
		System.out.println("Constructor");
	}

	abstract void run();

	void show() {
		System.out.println("method with declaration");
	}
}

class Showing extends PenDrive {

	@Override
	void run() {
		System.out.println("abstract method");

	}

}

public class AbstractWithConstructor {
	public static void main(String[] args) {
		PenDrive penDrive=new Showing();
		penDrive.run();
		penDrive.show();
	}
	

}
