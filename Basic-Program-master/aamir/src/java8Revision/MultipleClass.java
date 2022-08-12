package java8Revision;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultipleClass {
	void x() {
		System.out.println(this);
	}

	public static void main(String args[]) {
		MultipleClass a = new MultipleClass();
		System.out.println(a);
		a.x();
	}
}
