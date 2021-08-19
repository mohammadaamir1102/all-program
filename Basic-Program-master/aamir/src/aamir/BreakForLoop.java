package aamir;

public class BreakForLoop {

	public static void main(String[] args) {
		for(int a=1;a<=3;a++) {
		for(int j=1;j<=3;j++) {
			if(a==2&&j==2) {
				break;
			}
			System.out.println(a+" "+j);
		}
		}

	}

}
