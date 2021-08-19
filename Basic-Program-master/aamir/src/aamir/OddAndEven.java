package aamir;

class Supreme {
	void m1() {
		System.out.println("child");
	}
}

public class OddAndEven extends Supreme {
	void m1() {
		super.m1();
		System.out.println("parent");
	}

	public static void main(String[] args) {
		Supreme s = new OddAndEven();
		s.m1();

	}

}
