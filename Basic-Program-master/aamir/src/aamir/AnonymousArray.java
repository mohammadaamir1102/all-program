package aamir;

public class AnonymousArray {

	public static void main(String[] args) 
	{
		StringBuffer s= new StringBuffer("aamir");
		StringBuffer s1= new StringBuffer("aamir");
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
	}

}
