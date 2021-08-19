package aamir;

class Acces {
	int x;
	static int y;

	void cal(int a, int b) {
		x += a;
		y += b;
	}
}

class Callbyvalue {
	public static void main(String[] args) {
		Acces a = new Acces();
		Acces a1 = new Acces();
		a.x = 0;
		a.y = 0;
		a.cal(1, 2);
		a1.x = 0;
		a1.cal(2, 3);
		System.out.println(a.x + "     " + a1.y);

	}
}
