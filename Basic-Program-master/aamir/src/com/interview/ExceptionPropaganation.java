package com.interview;

public class ExceptionPropaganation {
	void m() {
		int a = 100 / 0;
	}
	void n() {
		m();
	}
	void p() {
		n();
	}	
	void show() {
		try {
			p();
		} catch (Exception e) {
			System.out.println("excepton handled");
		}
	}
	public static void main(String[] args) {
		ExceptionPropaganation e=new ExceptionPropaganation();
		e.show();
		System.out.println("normal flow");
	}
}
