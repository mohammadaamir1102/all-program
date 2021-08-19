package com.interview;
class AamirKhan{
	void display() {
		System.out.println("display");
	}
}
class Mobile extends AamirKhan{
	void mo() {
		System.out.println("moving");
	}
}
class Practice extends Mobile{
	void show() {
		System.out.println("showing 2");
	}
	public static void main(String[] args) {
		Practice a=new Practice();
		a.show();
		a.display();
		a.mo();
		
	}

}
