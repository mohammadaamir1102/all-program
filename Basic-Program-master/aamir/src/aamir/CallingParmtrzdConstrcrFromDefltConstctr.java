package aamir;

public class CallingParmtrzdConstrcrFromDefltConstctr {
	public int a;
	public int b;
	public String correctResult;
	public String wrongResult;

	public CallingParmtrzdConstrcrFromDefltConstctr() {
		this("a");
		System.out.println("default constructor");
		this.check("aamir");
	}

	public CallingParmtrzdConstrcrFromDefltConstctr(String name) {
		System.out.println(name);
		System.out.println("parameterized constructor");
	}

	void check(String name) {
		if (name == "aamir") {
			a = 10;
			b = 20;
			correctResult = "sum = 10";
			wrongResult = "sum != 10";
			int sum = sum(a, b);
			if (sum == 10) {
				System.out.println(correctResult);
			} else {
				System.out.println(wrongResult);
			}
		} else {
			System.out.println("false");
		}
	}

	private int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		CallingParmtrzdConstrcrFromDefltConstctr cp = new CallingParmtrzdConstrcrFromDefltConstctr();
	}
}
