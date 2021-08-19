package aamir;

class CountObject {

	static int count = 0;

	CountObject() {
		count = count + 1;

	}

	void getDisplay() {
		System.out.println("count obkect " + count);
	}

}

public class Prakash {
	int a;

	public static void main(String[] args) {
		CountObject kk = new CountObject();
		kk.getDisplay();
		CountObject kk1 = new CountObject();
		kk1.getDisplay();

	}

}
