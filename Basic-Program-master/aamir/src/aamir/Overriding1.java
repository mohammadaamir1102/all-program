package aamir;

class Mt {
	public String show(float i) {
		System.out.println("aamir");
		return null;

	}
}

public class Overriding1 extends Mt {
	public StringBuffer show(int a) {
		System.out.println("khan");
		return null;
	}

	public static void main(String[] args) {

		Mt m = new Mt();
		m.show(10);
	}
}
