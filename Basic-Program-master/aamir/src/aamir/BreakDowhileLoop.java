package aamir;

public class BreakDowhileLoop {

	public static void main(String[] args) {
		int a=1;
		do {
			if(a==5) {
				break;
			}
			System.out.println(a);
			a++;
		}while(a<=10);

	}

}
