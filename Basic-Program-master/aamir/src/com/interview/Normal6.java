package com.interview;
class Normal7{
	void ma()
	{
		System.out.println("parent");
	}
}

public class Normal6 extends Normal7 {
	
	void ma() {super.ma();
		System.out.println("child");
	}

	public static void main(String[] args) {
		Normal7 n=new Normal6();
		n.ma();

	}

}
