package aamir;

public class Animal {
	void show() {
		System.out.println("Aamir khan");
	}

	public static void main(String[] args) {
		System.out.println("Aasim khan");
		Animal t1 = new Animal();
		t1.show();
		t1.run();
		Plane p1 = new Plane();
		p1.eat();
	}

	void run() {
		System.out.println("Aaquib khan");
	}
}

class Plane {
	void eat() {
		System.out.println("Imtiyaz Ahmad Qasimi");
	}
}
