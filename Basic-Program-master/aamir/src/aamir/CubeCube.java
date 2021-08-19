package aamir;

class Fish {
	void fish() {
		System.out.println("fish class");
	}
}

class Bird extends Fish {
	void bird() {
		System.out.println("bird class");
	}
}

class Sky extends Fish {
	void sky() {
		System.out.println("Sky class");
	}
}

public class CubeCube {
	public static void main(String[] args) {
		Sky bird = new Sky();
		bird.fish();
		bird.sky();

	}

}
