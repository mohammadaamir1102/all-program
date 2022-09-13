package aamir;

public class CalledCurrrentClassMethodByThisKeyword {

	void a() {
		System.out.println("Aamir");
	}

	void b() {
		this.a(); // here this keyword is optional u can use or not
		System.out.println("Bushra");
	}

	public static void main(String[] args) {
		CalledCurrrentClassMethodByThisKeyword cccmbt = new CalledCurrrentClassMethodByThisKeyword();
		cccmbt.b();
	}

}
