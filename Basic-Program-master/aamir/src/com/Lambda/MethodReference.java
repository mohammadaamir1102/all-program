package com.Lambda;

interface Operation {
	public int op(int a, int b);
}

class MethodReference {
	public static void addition(int a, int b, Operation obj) {
		System.out.println(obj.op(a, b));
	}

	public static void main(String[] args) {
		addition(3, 6, (a, b) -> (a + b));

	}

}
