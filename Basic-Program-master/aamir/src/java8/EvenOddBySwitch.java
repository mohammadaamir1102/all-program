package java8;

public class EvenOddBySwitch {
	
	public static void main(String[] args) {
		int a =10;
		switch (a%2) {
		case 0:
			System.out.println("even");
			break;
		default:
			System.out.println("odd");
			break;
		}
	}

}
