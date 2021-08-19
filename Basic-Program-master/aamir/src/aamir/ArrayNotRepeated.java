package aamir;

public class ArrayNotRepeated {

	public static void main(String[] args) {
		int[] a= {1,1,2,2,3,3,4};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])
					System.out.println(a[j]);
			}
		}

	}

}
