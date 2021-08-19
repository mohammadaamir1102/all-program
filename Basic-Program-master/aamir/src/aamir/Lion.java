package aamir;

class Tiger {
	Number show() {
		System.out.println("Aamir");
		return 0;
	}
}

public class Lion extends Tiger {
	Integer show() {
		System.out.println("Aasim");
		return 0;

	}

	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.show();
	}
}
