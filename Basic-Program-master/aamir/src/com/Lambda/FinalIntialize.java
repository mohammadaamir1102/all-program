package com.Lambda;

class M23 {
	final int a;
	final String nameString;

	public M23(int a, String nameString) {
		super();
		this.a = a;
		this.nameString = nameString;
	}
	void show() {
		System.out.println(a+""+nameString);
	}

}

public class FinalIntialize {
	public static void main(String[] args) {
		M23 m23=new M23(12, "Aamir khan");
		m23.show();
		
	}
}
