package com.practice;

class Show {
	int show = 20;

	Show() {

		System.out.println("Dada");
	}
}

class Name extends Show {
	int show = 10;

	Name() {
		System.out.println("parent class");
	}
}

class Naam extends Show {
	Naam() {

		System.out.println("child class");
		System.out.println(super.show);
	}
}

public class SuperConstructor {
	public static void main(String[] args) {
		Naam naam = new Naam();

	}

}
