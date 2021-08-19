package com.interview;

class Lappy {
	int age=10;
}

class Show extends Lappy {
	int age=19;
}

public class CovariantReturnType {
	public static void main(String[] args) {
		Lappy lappy = new Show();
		System.out.println(lappy.age);
	}

}
