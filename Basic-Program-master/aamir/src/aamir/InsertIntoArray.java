package aamir;

public class InsertIntoArray {
	
	public static void main(String[] args) {
		int[] a= {10,20,40,50};
		int pos=3;
		int ele=100;
		for(int i=a.length-1;i>pos-1;i--)
		{
			a[i]=a[i-1];
		}
		a[pos-1]=ele;
		for(int z:a) 
		{
			System.out.println(z);
		}
	}

}
