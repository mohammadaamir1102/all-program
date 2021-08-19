package aamir;

public class InsertElementinArray {

	public static void main(String[] args) {
		/*
		 * int[] a= {10,20,30,40,50}; int pos=3; int ele=100; for(int
		 * i=a.length-1;i>pos-1;i--) { a[i]=a[i-1]; } a[pos-1]=ele; for(int z:a) {
		 * System.out.println(z); }
		 */
		int[] a={23,65,78,9,5};
		for (int i = 0; i < a.length; i++) {
			if(a[i]==5) {
				a[i]=100;
			}
		}
		for (int i : a) {
			System.out.println(i);
		}
	}

}
