package aamir;
class Copy{
	 void show()
	{
		System.out.println("parent property");
	}
}

public class Practice2 extends Copy {
	public void show()
	{
		System.out.println("child property");
	}
	public static void main(String[] args) 
	{
		Copy t=new Practice2();
		t.show();
		t.show();
	}

}
