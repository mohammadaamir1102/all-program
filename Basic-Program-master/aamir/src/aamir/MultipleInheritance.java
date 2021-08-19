package aamir;

interface MultipleInheritance {
	void display();
}

interface Multiple {
	void show();
}

class Child implements MultipleInheritance, Multiple {

	@Override
	public void show() {
		System.out.println("hello world");

	}

	public static void main(String[] args) {
		Child t = new Child();
		t.show();
		t.display();

	}

	@Override
	public void display() {
		System.out.println("program");

	}

}
