package aamir;

class InterfaceMultiple{
	public static void main(String[] args) {
	int []ar1=new int[] {1,2,3,4};
	int []ar2=new int[ar1.length];
	for(int i=0;i<ar1.length;i++) {
		ar2[i]=ar1[i];
	}
	System.out.println("fisrt element");
	for(int i=0;i<ar1.length;i++) {
		System.out.print(ar1[i]+" ");
	}
	System.out.println();
	System.out.println("second element");
	for(int i=0;i<ar1.length;i++) {
		System.out.print(ar2[i]+" ");
	}
	}
}