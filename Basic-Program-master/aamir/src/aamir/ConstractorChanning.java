package aamir;

class Chaning {
	Chaning() {
		System.out.println("parent constractor");
	}

	static {
		System.out.println("parent static");
	}
	{
		System.out.println("parent initializer block");
	}
}

class Constractor extends Chaning {
	Constractor() {
		System.out.println("child constractor");
	}

	static {
		System.out.println("child static");
	}
	{
		System.out.println("child initializer");
	}
}

public class ConstractorChanning {
	public static void main(String[] args) {

		Chaning c = new Constractor();
		Chaning c1=new Constractor();
	}
}
