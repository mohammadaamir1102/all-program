package aamir;

public class CallingDefltConstrcrFromParmtrzdConstctr {

	// here Calling default constructor from parameterized constructor:

	public CallingDefltConstrcrFromParmtrzdConstctr() {
		System.out.println("default constructor");
	}

	public CallingDefltConstrcrFromParmtrzdConstctr(String name) {
		this();
		System.out.println("parameterized constructor");
	}

	public static void main(String[] args) {
		CallingDefltConstrcrFromParmtrzdConstctr cp = new CallingDefltConstrcrFromParmtrzdConstctr("Aamir");

	}
}
