package aamir;

public class BankOverriding {
	int id;
	String name;

	BankOverriding(int id, String name) {
		this.id = id;
		this.name = name;

	}

	BankOverriding(BankOverriding b) {
		id = b.id;
		name = b.name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {

		BankOverriding bankOverriding = new BankOverriding(12, "aamir khan");
		BankOverriding bankOverriding2 = new BankOverriding(bankOverriding);
		bankOverriding2.display();
		bankOverriding.display();

	}

}
