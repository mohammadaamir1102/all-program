package aamir;

import java.io.IOException;

class H {

	static void method() throws IOException {
		throw new IOException("device error");
	}
}

public class M {
	public static void main(String args[]) throws IOException {

		//System.out.println(H.method());
		System.out.println("normal flow...");
	}
}
