package aamir;

class Qurban {
	void m(StringBuffer a) {
		System.out.println("A");
	}

	void m(String a) {
		System.out.println("b");

	}
}

public class Overloading {

	public static void main(String[] args) {
		Qurban q = new Qurban();
		q.m((new StringBuffer("aamir")));

	}

}
