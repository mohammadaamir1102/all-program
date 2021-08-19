package com.practice;

class Cast {

	void show() {
		System.out.println("Parent");
	}
}

public class CallChildMethodByParentReference extends Cast {

	void show() {
		System.out.println("child");
	}

	public static void main(String[] args) {
		Cast cast = new Cast();
		cast.show();
	}
}
