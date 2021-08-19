package aamir;

public class StaticMethod {
	static void display() {
		System.out.println("aamir");
	}

	public static void main(String[] args) {
		display();
		Test.screen();

	}
}
	class Test{
		static void screen() {
			System.out.println("aasim");
			
		}
	}

