package aamir;

public class Prctce {

	void run(Prctce p) {
		System.out.println("run method called !!");
	}
	void show() {
//		run(this);
		System.out.println("show method called !!");
	}
	public static void main(String[] args) {
		Prctce prctce = new Prctce();
		prctce.show();
	}
	public static void screen() {
		// TODO Auto-generated method stub
		
	}
}
