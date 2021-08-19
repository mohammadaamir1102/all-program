package aamir;

public class Practice {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7,9};
		int sum=0;
		int expect=a.length+1;
		int totalofsum=expect*(expect+1)/2;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println("missing "+(totalofsum-sum));
		
	}
}
