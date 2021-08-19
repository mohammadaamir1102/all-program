package aamir;
import java.util.Scanner;
public class UserTable {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in) ;
		System.out.println("Enter The Number");
		int no=s.nextInt();
		/*for (int i=2;i<=10;i++) {
			System.out.println(no*i);*/
		/*
		 * int a=2; do { System.out.println(a*no); a++; } while(a<=10);
		 */
		int a=1;
		while(a<=10) {
		System.out.println(a*no);
			a++;
		}
	}

}
