package aamir;

public class ConstcutorChanning {
	ConstcutorChanning()
	{
		this(5);
		System.out.println("hello");
	}
	ConstcutorChanning(int a)
	{
		this(5,10);
		System.out.println(a);
	}
	ConstcutorChanning(int a,int b)
	{
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		new ConstcutorChanning();

	}

}
