package aamir;

public class CopyArray {

	public static void main(String[] args) {
	int[] a1= {21,34,23,12};
	int[] a2=new int[a1.length];
	for (int i = 0; i < a1.length; i++) {
		a2[i]=a1[i];
	}
	System.out.println("old element");
	for(int k:a1)
	{
		System.out.print(k+" ");
	}
	System.out.println();
	System.out.println("copy element");
	for(int z:a2)
	{
		System.out.print(z+" ");
	}

	}

}
