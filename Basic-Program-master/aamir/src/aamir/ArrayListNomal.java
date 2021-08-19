package aamir;

import java.util.ArrayList;

public class ArrayListNomal {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		al.add("Grapes");
		al.forEach(a->{
			System.out.println(a);
		});
	}
}
