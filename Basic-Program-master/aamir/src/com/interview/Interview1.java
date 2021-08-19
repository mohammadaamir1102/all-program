package com.interview;

class A {
	void add() {
		System.out.println("A");
	}
}

class B extends A {
	void add() {
		super.add();
		System.out.println("B");
	}
}

class Interview1 extends B {
	void add() {
		super.add();
		System.out.println("Interview");
	}

	public static void main(String[] args) {
		Interview1 i=new Interview1();
		i.add();

	}

}
