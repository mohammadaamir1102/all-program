package aamir;
import java.util.Scanner;
public class Table {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		@SuppressWarnings("resource")
		Scanner Sc=new Scanner(System.in);
		int no=Sc.nextInt();
		for(int i=2;i<=10;i++) {
			System.out.println(no*i);

	}

}
}