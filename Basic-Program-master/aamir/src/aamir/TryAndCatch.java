package aamir;

public class TryAndCatch {

	public static void main(String[] args) {
		String s="abc";
		
		for(int i=0;i<s.length();i++) {
			String s1="";
			for(int j=s.length()-1;j>=0;j--)
			{
				s1=s1+s.charAt(j);
			}
			s=s1;
			System.out.println(s);
		}

	}

}
