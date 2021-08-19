package com.interview;

class Furqan {
	static int a = 1;
	int temp=0;

	void show() {
		if (a <= 1) {
			System.out.println(a);
			temp=temp+2;
			a=temp;
			show();
		}
	}
}
				
public class REcurson2 {

	public static void main(String[] args) {
		Furqan f = new Furqan();
		f.show();

	}

}
