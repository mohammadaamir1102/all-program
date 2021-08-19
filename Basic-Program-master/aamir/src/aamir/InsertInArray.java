package aamir;

public class InsertInArray {

	public static void main(String[] args) {
		int[] a= {10,20,40,50};
		int pos=2;
		int ele=30;
		for (int i=a.length-1; i>2; i--) {
			a[i]=a[i-1];
		}
		a[2]=ele;
		for(int z:a) 
		{
			System.out.println(z);
		}
	}

}
